package com.flyer.domain;

import java.io.Serializable;
import java.util.Date;

import com.jfinal.plugin.activerecord.Model;

public class Apply extends Model<Apply> implements Serializable{
	
	public static final Apply dao=new Apply();
    /**
	 * 
	 */
	private static final long serialVersionUID = 3148752620419817157L;

	private Integer id;

    private Integer jobId;

    private String employeeId;

    private Date applyTime;

    private Byte status;

    private Double longitude;

    private Double latitude;	

    
    private String EmployerName;
    
    private String EmployeeName;
    
    

    public String getEmployerName() {
		return EmployerName;
	}

	public void setEmployerName(String employerName) {
		EmployerName = employerName;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

    
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getJobId() {
		return jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Date getApplyTime() {
		return applyTime;
	}

	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}



	public int getStatus() {
		return status;
	}

	public void setStatus(Byte status) {
		this.status = status;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}



    
}