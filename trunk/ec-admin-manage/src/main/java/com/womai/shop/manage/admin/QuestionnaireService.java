package com.womai.shop.manage.admin;import com.womai.shop.manage.Services;import com.womai.shop.domain.admin.Questionnaire;public interface QuestionnaireService extends Services<Questionnaire> {	/**	 * 批量修改问卷状态	 * @param ids	 * @param questionnaireStatusY	 */	void changeStatus(String[] ids, String questionnaireStatusY);}