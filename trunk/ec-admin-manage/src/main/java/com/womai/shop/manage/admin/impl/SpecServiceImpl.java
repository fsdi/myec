package com.womai.shop.manage.admin.impl;import com.womai.shop.manage.ServersManager;import com.womai.shop.manage.admin.SpecService;import com.womai.shop.domain.admin.Spec;import com.womai.shop.dao.admin.SpecDao;public class SpecServiceImpl extends ServersManager<Spec> implements		SpecService {	private SpecDao specDao;	public void setSpecDao(SpecDao specDao) {		this.specDao = specDao;	}}