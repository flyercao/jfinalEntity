package com.flyer.jfinal.createEntity;

import java.math.BigDecimal;
import java.sql.Types;
import java.util.Date;
import java.util.HashMap;

public class TypeConverter {

	static HashMap<Integer, String> typeMap = new HashMap<Integer, String>();
	static{
	    typeMap.put(Types.ARRAY, getShortName(Object.class));
	    typeMap.put(Types.BIGINT, getShortName(Long.class));
	    typeMap.put(Types.BINARY, "byte[]"); //$NON-NLS-1$
	    typeMap.put(Types.BIT, getShortName(Boolean.class));
	    typeMap.put(Types.BLOB, "byte[]"); //$NON-NLS-1$
	    typeMap.put(Types.BOOLEAN, getShortName(Boolean.class));
	    typeMap.put(Types.CHAR, getShortName(String.class));
	    typeMap.put(Types.CLOB, getShortName(String.class));
	    typeMap.put(Types.DATALINK, getShortName(Object.class));
	    typeMap.put(Types.DATE, getShortName(Date.class));
	    typeMap.put(Types.DISTINCT, getShortName(Object.class));
	    typeMap.put(Types.DOUBLE, getShortName(Double.class));
	    typeMap.put(Types.FLOAT,getShortName(Double.class));
	    typeMap.put(Types.INTEGER, getShortName(Integer.class));
	    typeMap.put(Types.JAVA_OBJECT,getShortName(Object.class));
	    typeMap.put(Types.LONGNVARCHAR, getShortName(String.class));
	    typeMap.put(Types.LONGVARBINARY, "byte[]"); //$NON-NLS-1$
	    typeMap.put(Types.LONGVARCHAR, getShortName(String.class));
	    typeMap.put(Types.NCHAR, getShortName(String.class));
	    typeMap.put(Types.NCLOB,getShortName(String.class));
	    typeMap.put(Types.NVARCHAR, getShortName(String.class));
	    typeMap.put(Types.NULL, getShortName(Object.class));
	    typeMap.put(Types.OTHER, getShortName(Object.class));
	    typeMap.put(Types.REAL, getShortName(Float.class));
	    typeMap.put(Types.REF,getShortName(Object.class));
	    typeMap.put(Types.SMALLINT, getShortName(Short.class));
	    typeMap.put(Types.STRUCT, getShortName(Object.class));
	    typeMap.put(Types.TIME, getShortName(Date.class));
	    typeMap.put(Types.TIMESTAMP, getShortName(Date.class));
	    typeMap.put(Types.TINYINT, getShortName(Byte.class));
	    typeMap.put(Types.VARBINARY, "byte[]"); //$NON-NLS-1$
	    typeMap.put(Types.VARCHAR, getShortName(String.class));
	    typeMap.put(Types.DECIMAL, getShortName(BigDecimal.class));
	}
	public  TypeConverter(){

	}
	
    public static String getJavaType(Integer type){
    	return typeMap.get(type);
    }
    private static String getShortName(Class<?> c){
    	String packageName=c.getPackage().getName();
    	return c.getName().substring(packageName.length()+1);
    }
}
