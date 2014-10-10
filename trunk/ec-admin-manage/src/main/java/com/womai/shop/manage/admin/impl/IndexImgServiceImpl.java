/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.womai.shop.manage.admin.impl;

import java.util.List;

import com.womai.shop.manage.ServersManager;
import com.womai.shop.manage.admin.IndexImgService;
import com.womai.shop.domain.admin.IndexImg;
import com.womai.shop.dao.admin.IndexImgDao;


/**
 * @author huangf
 */
public class IndexImgServiceImpl extends ServersManager<IndexImg> implements
		IndexImgService {

	private IndexImgDao indexImgDao;

	public IndexImgDao getIndexImgDao() {
		return indexImgDao;
	}

	public void setIndexImgDao(IndexImgDao indexImgDao) {
		this.indexImgDao = indexImgDao;
	}

	@Override
	public List<IndexImg> getImgsShowToIndex(int i) {
		return indexImgDao.getImgsShowToIndex(i);
	}

}
