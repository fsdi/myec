package com.womai.shop.domain.admin;import java.io.Serializable;public class Orderdetail extends com.womai.shop.domain.common.Orderdetail		implements Serializable {	private static final long serialVersionUID = 1L;	private Product product;	public void clear() {		super.clear();		if (product != null) {			product.clear();			product = null;		}	}	public Product getProduct() {		return product;	}	public void setProduct(Product product) {		this.product = product;	}}