package com.flyer.jfinal.createEntity;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.mysql.jdbc.Statement;

public class DB {
	public static  Properties p = null;
	public DB init(String properties){
		try {
			p=new Properties();
			p.load(DB.class.getResourceAsStream("/createEntity.properties"));
			Class.forName(p.getProperty("className"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this;
	}
	
	public  Connection getConnection() throws IOException, SQLException {
		return DriverManager.getConnection(p.getProperty("driverName"),
				p.getProperty("userName"), p.getProperty("userPassword"));
	}
	
	public  List<String> getTableNamesByDBName() throws SQLException,
			IOException {
		Connection conn=DriverManager.getConnection(p.getProperty("driverName"),
				p.getProperty("userName"), p.getProperty("userPassword"));
		Statement stame = (Statement) conn.createStatement();
		ResultSet rs = stame.executeQuery("show tables;");
		List<String> list = new ArrayList<String>();
		while (rs.next()) {
			list.add(rs.getString(1));
		}
		return list;
	}

	public static Map<String,JFinalAttrInfo> getAttributeByTableName(String tName){
		Connection conn=null;
		Map<String,JFinalAttrInfo> map = new HashMap<String,JFinalAttrInfo>();
		Statement stame = null ;
		try {
			conn=DriverManager.getConnection(p.getProperty("driverName"),
					p.getProperty("userName"), p.getProperty("userPassword"));
			stame = (Statement) conn.createStatement();
			ResultSet rs= stame.executeQuery("select * from  " + tName + " limit 0,1;");
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for (int i=1; i<columnCount+1; i++) {
				JFinalAttrInfo attrInfo=new JFinalAttrInfo();				
				attrInfo.setAttribute(ColumnNameUtil.columnNameToAttr(rsmd.getColumnLabel(i)));
				attrInfo.setColumn(rsmd.getColumnLabel(i));
				attrInfo.setType(TypeConverter.getJavaType(rsmd.getColumnType(i)));	
				attrInfo.setLength(rsmd.getColumnDisplaySize(i));
				DatabaseMetaData dbmd = conn.getMetaData();  
	            ResultSet r = dbmd.getColumns(null, null, tName, rsmd.getColumnLabel(i));  
	            while (r.next()) {  
	                	attrInfo.setRemark(r.getString("REMARKS"));  
	            }  
	            map.put(attrInfo.getAttribute(), attrInfo);
			}
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		finally{
			if(stame!=null){
				try {
					stame.close();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		return map;
	}
	
}
