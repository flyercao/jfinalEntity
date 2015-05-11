package com.flyer.jfinal.createEntity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**
 * 
* @ClassName: Create 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Flyer_cao
* @date 2015年5月11日 下午4:49:07 
*
 */
public class EntityBuilder {
	
	public void build(String propertie,String template) throws SQLException, IOException,
			TemplateException {
		Configuration config = new Configuration();
		config.setClassForTemplateLoading(EntityBuilder.class, "/ftl");
		Template temp = config.getTemplate(template);
		List<String> tables = new DB().init(propertie).getTableNamesByDBName(); 
		Map<String,JFinalClassInfo> map = new HashMap<String,JFinalClassInfo>(); 
		JFinalClassInfo myModel = new JFinalClassInfo();
		myModel.setPackageName(DB.p.getProperty("package"));
		String tablePrefix=DB.p.getProperty("tablePrefix");
		for (String table : tables) {
			if(!table.startsWith(tablePrefix)){
				continue;
			}
			myModel.setClassName(ColumnNameUtil.tableNameToCalss(table, tablePrefix)); 
			myModel.setAttributes(DB.getAttributeByTableName(table));
			map.put("myModel", myModel);
			File createFolder = new File(System.getProperty("user.dir")+"/src/main/java/"+DB.p.getProperty("package").replace(".", "/"));
			createFolder.mkdirs();	
			temp.process(map, new FileWriter(createFolder+"/"+ColumnNameUtil.tableNameToCalss(table, tablePrefix)+".java"));
		}
	}

}
