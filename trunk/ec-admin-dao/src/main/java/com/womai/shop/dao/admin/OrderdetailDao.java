package com.womai.shop.dao.admin;import java.util.List;import com.womai.shop.dao.DaoManager;import com.womai.shop.domain.admin.Orderdetail;import com.womai.shop.domain.admin.ReportInfo;public interface OrderdetailDao extends DaoManager<Orderdetail> {	List<ReportInfo> reportProductSales(Orderdetail orderdetail);}