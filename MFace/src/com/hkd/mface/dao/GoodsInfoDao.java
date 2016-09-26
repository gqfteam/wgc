package com.hkd.mface.dao;

import java.util.ArrayList;

import com.hkd.mface.model.GoodsInfo;
import com.hkd.mface.model.UserInfo;

public interface GoodsInfoDao {
	boolean addGoodsInfo(GoodsInfo goods);
	boolean updateGoodsInfo(GoodsInfo goods);
	boolean deleteGoodsInfo(GoodsInfo goods);
	
	ArrayList<GoodsInfo> getUsersGoodsInfo(GoodsInfo goods);//查询用户旗下所有商品
	public ArrayList<GoodsInfo> getLikeGoodsInfo(GoodsInfo goods);//根据商品名模糊查询
	public ArrayList<GoodsInfo> getGoodsInfoBySchoolAndClassification(GoodsInfo goods);//根据城市，学校，校区进行查询
}
