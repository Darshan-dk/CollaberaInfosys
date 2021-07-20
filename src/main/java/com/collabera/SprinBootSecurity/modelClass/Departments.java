package com.collabera.SprinBootSecurity.modelClass;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Departments extends AuditModel implements Serializable{
	
	private static final long serialVersionUID = -1606169901038082721L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long dptID;
	private Long deptName;

}
