package ${myModel.packageName};

import com.jfinal.plugin.activerecord.Model;
import java.util.Date;
import java.math.BigDecimal;

public class ${myModel.className?cap_first} extends Model<${myModel.className?cap_first}>{
	public static final ${myModel.className?cap_first} dao = new ${myModel.className?cap_first}();
	

<#if myModel.attributes?exists>
<#-- private   ${key};  
<#list myModel.attributes?keys as key>
	${myModel.attributes[key].type} 
</#list>	
${myModel.className}
-->
<#list myModel.attributes?keys as key>
	public  ${myModel.attributes[key].type} get${key?cap_first}(){
		return get("${myModel.attributes[key].column}");
	}
	
	<#if myModel.attributes[key].remark?trim?length gt 0>
	/**
	* @Description: ${myModel.attributes[key].remark}
	*/
	</#if>
	public void set${key?cap_first}(${myModel.attributes[key].type} value){
		set("${myModel.attributes[key].column}",value);
	}
	
</#list>	

</#if>
}
