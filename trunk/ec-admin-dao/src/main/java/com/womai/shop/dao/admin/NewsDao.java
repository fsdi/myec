/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.womai.shop.dao.admin;

import java.util.List;

import com.womai.shop.dao.DaoManager;
import com.womai.shop.domain.admin.News;


/**
 * @author huangf
 * @param <T>
 */
public interface NewsDao extends DaoManager<News> {

	/**
	 * @param e
	 * @return
	 */
	List<News> selecIndexNews(News e);

	/**
	 * @param news
	 */
	void sync(News news);

	void updateDownOrUp(News news);

	int selectCount(News news);

}
