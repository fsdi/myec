package com.womai.shop.dao.front;import com.womai.shop.dao.DaoManager;import com.womai.shop.domain.front.Favorite;public interface FavoriteDao extends DaoManager<Favorite> {	int selectCount(Favorite favorite);}