package com.womai.shop.dao.admin.impl;import java.util.List;import com.womai.shop.dao.BaseDao;import com.womai.shop.domain.page.PagerModel;import com.womai.shop.domain.admin.Catalog;import com.womai.shop.dao.admin.CatalogDao;public class CatalogDaoImpl implements CatalogDao {	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(Catalog e) {		return dao.selectPageList("manage.catalog.selectPageList",				"manage.catalog.selectPageCount", e);	}	public List selectList(Catalog e) {		return dao.selectList("manage.catalog.selectList", e);	}	public Catalog selectOne(Catalog e) {		return (Catalog) dao.selectOne("manage.catalog.selectOne", e);	}	public int delete(Catalog e) {		return dao.delete("manage.catalog.delete", e);	}	public int update(Catalog e) {		return dao.update("manage.catalog.update", e);	}	public int deletes(String[] ids) {		Catalog e = new Catalog();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(Catalog e) {		return dao.insert("manage.catalog.insert", e);	}	public int deleteById(int id) {		return dao.delete("manage.catalog.deleteById", id);	}	@Override	public void deletes(List<String> ids) {		dao.delete("manage.catalog.deleteByIds", ids);			}	public Catalog selectById(String id) {		return (Catalog) dao.selectOne(id);	}}