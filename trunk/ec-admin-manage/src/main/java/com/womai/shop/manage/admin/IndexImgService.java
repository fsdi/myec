/**
 * 2012-7-8
 * jqsl2012@163.com
 */
package com.womai.shop.manage.admin;

import java.util.List;

import com.womai.shop.manage.Services;
import com.womai.shop.domain.admin.IndexImg;


/**
 * @author huangf
 */
public interface IndexImgService extends Services<IndexImg> {

	/**
	 * 加载图片显示到门户
	 * @param i
	 */
	List<IndexImg> getImgsShowToIndex(int i);

}
