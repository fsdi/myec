package com.womai.shop.web.action.manage.orderdetail;import com.womai.shop.web.action.BaseAction;import com.womai.shop.manage.admin.OrderdetailService;import com.womai.shop.domain.admin.Orderdetail;public class OrderdetailAction extends BaseAction<Orderdetail> {private static final long serialVersionUID = 1L;private OrderdetailService orderdetailService;public OrderdetailService getOrderdetailService() {return orderdetailService;}protected void selectListAfter() {pager.setPagerUrl("orderdetail!selectList.action");}public void setOrderdetailService(OrderdetailService orderdetailService) {this.orderdetailService = orderdetailService;}public Orderdetail getE() {return this.e;}public void prepare() throws Exception {if (this.e == null) {this.e = new Orderdetail();}}public void insertAfter(Orderdetail e) {e.clear();}}