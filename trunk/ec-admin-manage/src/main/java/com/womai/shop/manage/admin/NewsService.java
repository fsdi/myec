package com.womai.shop.manage.admin;

import java.util.List;

import com.womai.shop.manage.Services;
import com.womai.shop.domain.admin.News;


public interface NewsService extends Services<News> {
	public List<News> selecIndexNews(News e);

	/**
	 * @param ids
	 * @param status 2:审核通过,4:审核未通过
	 */
	public void updateStatus(String[] ids, String status);
	
	/**
	 * 更新指定的文章 显示/不显示
	 * @param news
	 */
	public void updateDownOrUp(News news);

	public int selectCount(News news);
}
