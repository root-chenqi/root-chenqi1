package com.ssm.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.entity.Goods;
import com.ssm.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService goodsServiceImpl;
	
	@RequestMapping("/save.do")
	public String save(Goods good) {
		int row =goodsServiceImpl.save(good);
		if(1==row) {
			return "success";
		}else {
			return "error";
		}
	}
	@RequestMapping("/update.do")
	public String update(Goods good) {
		int row = goodsServiceImpl.update(good);
		if(1==row) {
			return "success";
		}else {
			return "error";
		}
	}
	@RequestMapping("/delete.do")
	public String deleteById(Goods good) {
		int row = goodsServiceImpl.deleteById(good);
		if(1==row) {
			return "success";
		}else {
			return "error";
		}
	}
	@RequestMapping("/selectAll.do")
	public String selectAll() {
		ArrayList<Goods> goodss = goodsServiceImpl.selectAll();
		for (Goods goods : goodss) {
			System.out.println(goods);
		}
		if(null!=goodss) {
			System.out.println("≤È—Ø≥…π¶");
			return "success";
		}else {
			return "error";
		}
	}
	@RequestMapping("/selectById.do")
	public String selectById(Goods good) {
		Goods goods = goodsServiceImpl.selectById(good);
		System.out.println(goods);
		if(null!=goods) {
			return "success";
		}else {
			return "error";
		}
	}
}
