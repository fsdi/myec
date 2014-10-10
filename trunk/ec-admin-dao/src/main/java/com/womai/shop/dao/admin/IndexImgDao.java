/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.womai.shop.dao.admin;

import java.util.List;

import com.womai.shop.dao.DaoManager;
import com.womai.shop.domain.admin.IndexImg;


public interface IndexImgDao extends DaoManager<IndexImg> {

	/**
	 * @param i
	 * @return
	 */
	List<IndexImg> getImgsShowToIndex(int i);

}
