/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.womai.shop.dao.front;

import java.util.List;

import com.womai.shop.dao.DaoManager;
import com.womai.shop.domain.front.News;


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
	 * @return
	 */
	List<String> selectAllMd5();

	/**
	 * @param e
	 */
	void updateInBlackList(String e);

	/**
	 * @param news
	 */
	void sync(News news);

	List<News> selectNoticeList(News news);

	News selectSimpleOne(News news);

}
