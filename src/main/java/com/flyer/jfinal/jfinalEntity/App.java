package com.flyer.jfinal.jfinalEntity;

import com.flyer.jfinal.createEntity.ColumnNameUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		new DemoConfig().configPlugin();
//		JobApply apply=JobApply.dao.findById(32);
//		Page<JobApply> xxPage = apply.paginate(1, 10, "SELECT apply.*", "FROM TBL_JN_JOB_APPLY apply LEFT JOIN TBL_JN_JOB job on apply.job_Id=job.id");
//		System.out.append(apply.getEmployeeId());
    	System.out.print(ColumnNameUtil.columnNameToAttr("TBL_JN_JOB_APPLY"));
	}
}
