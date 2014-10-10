package com.womai.shop.dao.admin.impl;import java.util.List;import com.womai.shop.dao.BaseDao;import com.womai.shop.domain.page.PagerModel;import com.womai.shop.domain.admin.EmailNotifyProduct;import com.womai.shop.dao.admin.EmailNotifyProductDao;public class EmailNotifyProductDaoImpl implements EmailNotifyProductDao {	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(EmailNotifyProduct e) {		return dao.selectPageList("manage.emailNotifyProduct.selectPageList",				"manage.emailNotifyProduct.selectPageCount", e);	}	public List selectList(EmailNotifyProduct e) {		return dao.selectList("manage.emailNotifyProduct.selectList", e);	}	public EmailNotifyProduct selectOne(EmailNotifyProduct e) {		return (EmailNotifyProduct) dao.selectOne(				"manage.emailNotifyProduct.selectOne", e);	}	public int delete(EmailNotifyProduct e) {		return dao.delete("manage.emailNotifyProduct.delete", e);	}	public int update(EmailNotifyProduct e) {		return dao.update("manage.emailNotifyProduct.update", e);	}	public int deletes(String[] ids) {		EmailNotifyProduct e = new EmailNotifyProduct();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(EmailNotifyProduct e) {		return dao.insert("manage.emailNotifyProduct.insert", e);	}	public int deleteById(int id) {		return dao.delete("manage.emailNotifyProduct.deleteById", id);	}	@Override	public EmailNotifyProduct selectById(String id) {		return (EmailNotifyProduct) dao.selectOne(				"manage.emailNotifyProduct.selectById", id);	}}