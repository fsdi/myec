package com.womai.shop.manage.admin.impl;import com.womai.shop.manage.ServersManager;import com.womai.shop.manage.admin.SmsService;import com.womai.shop.domain.admin.Sms;import com.womai.shop.dao.admin.SmsDao;public class SmsServiceImpl extends ServersManager<Sms> implements SmsService {	private SmsDao smsDao;	public void setSmsDao(SmsDao smsDao) {		this.smsDao = smsDao;	}}