package com.collabera.SprinBootSecurity.modelClass;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Entity
@Data
public class Product extends AuditModel implements Serializable {

	private static final long serialVersionUID = 6925264493065833214L;

	@Id
	@Column(name = "Code", length = 20, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long code;

	@Column(name = "Name", length = 255, nullable = false)
	private String name;

	@Column(name = "Price", nullable = false)
	private double price;

	@Lob
	@Column(name = "Image", length = Integer.MAX_VALUE, nullable = true)
	private byte[] image;

}
