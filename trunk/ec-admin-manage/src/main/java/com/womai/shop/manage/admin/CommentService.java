package com.womai.shop.manage.admin;import com.womai.shop.manage.Services;import com.womai.shop.domain.admin.Comment;public interface CommentService extends Services<Comment> {	/**	 * 批量修改评论状态	 * @param ids	 */	void updateStatus(String[] ids,String status);	/**	 * 查询尚未恢复的评论数	 * @return	 */	int selectNotReplyCount();}