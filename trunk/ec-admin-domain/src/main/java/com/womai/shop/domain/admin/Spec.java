package com.womai.shop.domain.admin;import java.io.Serializable;import com.womai.shop.domain.page.PagerModel;public class Spec extends PagerModel implements Serializable {	private static final long serialVersionUID = 1L;	private String id;	private String productID;	private String specColor;	private String specSize;	private String specStock;	private String specPrice;	private String specStatus;		/**	 * 规格的显示和隐藏	 */	public static final String spec_specStatus_y = "y";	public static final String spec_specStatus_n = "n";	public Spec() {		super();	}	public Spec(String id, String productID, String specColor, String specSize,			String specStock, String specPrice, String specStatus) {		super();		this.id = id;		this.productID = productID;		this.specColor = specColor;		this.specSize = specSize;		this.specStock = specStock;		this.specPrice = specPrice;		this.specStatus = specStatus;	}	public void clear() {		super.clear();		id = null;		productID = null;		specColor = null;		specSize = null;		specStock = null;		specPrice = null;		specStatus = null;	}	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}	public String getProductID() {		return productID;	}	public void setProductID(String productID) {		this.productID = productID;	}	public String getSpecColor() {		return specColor;	}	public void setSpecColor(String specColor) {		this.specColor = specColor;	}	public String getSpecSize() {		return specSize;	}	public void setSpecSize(String specSize) {		this.specSize = specSize;	}	public String getSpecStock() {		return specStock;	}	public void setSpecStock(String specStock) {		this.specStock = specStock;	}	public String getSpecPrice() {		return specPrice;	}	public void setSpecPrice(String specPrice) {		this.specPrice = specPrice;	}	public String getSpecStatus() {		return specStatus;	}	public void setSpecStatus(String specStatus) {		this.specStatus = specStatus;	}	@Override	public String toString() {		return "Spec [id=" + id + ", productID=" + productID + ", specColor="				+ specColor + ", specSize=" + specSize + ", specStock="				+ specStock + ", specPrice=" + specPrice + ", specStatus="				+ specStatus + "]";	}}