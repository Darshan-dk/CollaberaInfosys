package com.collabera.SprinBootSecurity.modelClass;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data 	

@Table(name = "`order`")
public class Order extends AuditModel implements Serializable {
	
	private static final long serialVersionUID = -4007142105224945278L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int orderNum;
	private double amount;
	private String customerName;
	private String customerAddress;
	private String customerEmail;
	private String customerPhone;

}
