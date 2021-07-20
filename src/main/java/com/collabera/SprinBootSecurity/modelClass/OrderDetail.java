package com.collabera.SprinBootSecurity.modelClass;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.ForeignKey;


import lombok.Data;

@Entity
@Data
public class OrderDetail extends AuditModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", length = 50, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ORDER_ID", nullable = false, //
			foreignKey = @ForeignKey(name = "ORDER_DETAIL_ORD_FK"))
	private Order order;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCT_ID", nullable = false, //
			foreignKey = @ForeignKey(name = "ORDER_DETAIL_PROD_FK"))
	private Product product;

	@Column(name = "Quanity", nullable = false)
	private int quanity;

	@Column(name = "Price", nullable = false)
	private double price;

	@Column(name = "Amount", nullable = false)
	private double amount;

}
