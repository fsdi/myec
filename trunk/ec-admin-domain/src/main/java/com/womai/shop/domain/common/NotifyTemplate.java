package com.womai.shop.domain.common;import java.io.Serializable;import com.womai.shop.domain.page.PagerModel;public class NotifyTemplate extends PagerModel implements Serializable {	private static final long serialVersionUID = 1L;	private String id;	private String type;	private String code;	private String name;	private String template;	private String remark;		/**	 * 模板代号	 */	public static final String email_reg = "email_reg";	public static final String email_forget_password = "email_forget_password";	public static final String email_change_email = "email_change_email";	public static final String email_notify_product = "email_notify_product";	public static final String sms_pay_success = "sms_pay_success";	public void clear() {		super.clear();		id = null;		type = null;		code = null;		name = null;		template = null;		remark = null;	}	public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public String getId() {		return id;	}	public void setId(String id) {		this.id = id;	}	public String getType() {		return type;	}	public void setType(String type) {		this.type = type;	}	public String getCode() {		return code;	}	public void setCode(String code) {		this.code = code;	}	public String getTemplate() {		return template;	}	public void setTemplate(String template) {		this.template = template;	}	public String getRemark() {		return remark;	}	public void setRemark(String remark) {		this.remark = remark;	}}