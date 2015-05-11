package com.flyer.jfinal.jfinalEntity;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.activerecord.SqlReporter;
import com.jfinal.plugin.c3p0.C3p0Plugin;

public class DemoConfig{
	public  void configPlugin() {
		C3p0Plugin c3p0Plugin = new C3p0Plugin("jdbc:mysql://10.0.0.26:3306/jobnow?useUnicode=true&characterEncoding=utf8&autoReconnect=true&failOverReadOnly=false&zeroDateTimeBehavior=convertToNull",
				"jobnow", "jobnow");
		c3p0Plugin.start();
		ActiveRecordPlugin arp = new ActiveRecordPlugin(c3p0Plugin);
//		arp.addMapping("TBL_JN_JOB_APPLY", JobApply.class);
//		arp.addMapping("TBL_JN_JOB", Job.class);
		arp.setShowSql(true);
		arp.start();
		SqlReporter.setLogger(false);
	}

}