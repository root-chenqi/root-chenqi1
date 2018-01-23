package com.ssm.dao;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ssm.entity.Goods;

public interface GoodsDaoMapper {
	
	ArrayList<Goods> selectAll();
	Goods selectById(Goods good);
	int save(Goods good);
	int update(Goods good);
	int deleteById(Goods good);
}
