package com.ssm.service.impl;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.GoodsDaoMapper;
import com.ssm.entity.Goods;
import com.ssm.service.GoodsService;
@Service
public class GoodsServiceImpl implements GoodsService{

	@Autowired
	private GoodsDaoMapper goodsDao;
	@Override
	public ArrayList<Goods> selectAll() {
		return goodsDao.selectAll();
	}

	@Override
	public Goods selectById(Goods good) {
		return goodsDao.selectById(good);
	}
	@Override
	public int save(Goods good) {
		return goodsDao.save(good);
	}
	@Override
	public int update(Goods good) {
		return goodsDao.update(good);
	}
	@Override
	public int deleteById(Goods good) {
		return goodsDao.deleteById(good);
	}

}
