package com.womai.shop.dao.front.impl;import java.util.List;import com.womai.shop.dao.BaseDao;import com.womai.shop.domain.page.PagerModel;import com.womai.shop.domain.front.Attribute;import com.womai.shop.dao.front.AttributeDao;public class AttributeDaoImpl implements AttributeDao {	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(Attribute e) {		return dao.selectPageList("front.attribute.selectPageList",				"front.attribute.selectPageCount", e);	}	public List selectList(Attribute e) {		return dao.selectList("front.attribute.selectList", e);	}	public Attribute selectOne(Attribute e) {		return (Attribute) dao.selectOne("front.attribute.selectOne", e);	}	public int delete(Attribute e) {		return dao.delete("front.attribute.delete", e);	}	public int update(Attribute e) {		return dao.update("front.attribute.update", e);	}	public int deletes(String[] ids) {		Attribute e = new Attribute();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(Attribute e) {		return dao.insert("front.attribute.insert", e);	}	public int deleteById(int id) {		return dao.delete("front.attribute.deleteById", id);	}	public void deleteByPid(Attribute e) {		 dao.delete("front.attribute.deleteByPid", e);	}		public Attribute selectById(String id) {		return (Attribute) dao.selectOne("account.selectById", id);	}}