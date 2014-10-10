package com.womai.shop.dao.front.impl;import java.util.List;import com.womai.shop.dao.BaseDao;import com.womai.shop.domain.page.PagerModel;import com.womai.shop.domain.front.Catalog;import com.womai.shop.dao.front.CatalogDao;public class CatalogDaoImpl implements CatalogDao {	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(Catalog e) {		return dao.selectPageList("front.catalog.selectPageList",				"front.catalog.selectPageCount", e);	}	public List selectList(Catalog e) {		return dao.selectList("front.catalog.selectList", e);	}	public Catalog selectOne(Catalog e) {		return (Catalog) dao.selectOne("front.catalog.selectOne", e);	}	public int delete(Catalog e) {		return dao.delete("front.catalog.delete", e);	}	public int update(Catalog e) {		return dao.update("front.catalog.update", e);	}	public int deletes(String[] ids) {		Catalog e = new Catalog();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(Catalog e) {		return dao.insert("front.catalog.insert", e);	}	public int deleteById(int id) {		return dao.delete("front.catalog.deleteById", id);	}		public Catalog selectById(String id) {		return (Catalog) dao.selectOne("account.selectById", id);	}}