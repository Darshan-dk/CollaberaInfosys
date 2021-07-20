package com.example.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department extends AudtiModel implements Serializable{

	private static final long serialVersionUID = -1606169901038082721L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dptID;
	private Long deptName;
	public Long getDptID() {
		return dptID;
	}
	public void setDptID(Long dptID) {
		this.dptID = dptID;
	}
	public Long getDeptName() {
		return deptName;
	}
	public void setDeptName(Long deptName) {
		this.deptName = deptName;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
