package com.flyer.jfinal.createEntity;

public class ColumnNameUtil {
	
	//首字母转小写
    public static String capLowerFirst(String s)
    {
        if(Character.isLowerCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
    }
    //首字母转大写
    public static String capUpperFirst(String s)
    {
        if(Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }
    
    public static String columnNameToAttr(String column){
    	column=column.toLowerCase();
    	StringBuffer sb=new StringBuffer();
    	if(column.contains("_")){
    		String[] splits=column.split("_");
    		sb.append(splits[0]);
    		for(int i=1;i<splits.length;i++){
    			sb.append(capUpperFirst(splits[i]));
    		}
    	}
    	else{
    		return column;
    	}
    	
    	return new String(sb);
    }
    
    public static String tableNameToCalss(String tableName,String preFix){
    	String clasName=tableName;
    	if(tableName.indexOf(preFix)==0){
    		clasName= tableName.substring(preFix.length());
    	}
    	clasName=columnNameToAttr(clasName);
    	return capUpperFirst(clasName);
    }
    
}
