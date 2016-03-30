package com.onebus.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.onebus.beans.GoodsScore;
import com.onebus.dao.BaseDAO;
import com.onebus.service.GoodsScoreService;

@Service("goodsScoreService")
@Transactional
public class GoodsScoreServiceImpl implements GoodsScoreService {

	@Resource
	private BaseDAO<GoodsScore> baseDAO;

	@Override
	public void saveGoodsScore(GoodsScore goodsScore) {
		// TODO Auto-generated method stub
		baseDAO.save(goodsScore);

	}

	@Override
	public void delete(GoodsScore goodsScore) {
		// TODO Auto-generated method stub
		baseDAO.delete(goodsScore);

	}

	@Override
	public List<GoodsScore> getAllGoodsScore() {
		// TODO Auto-generated method stub
		String hql = "from com.onebus.beans.GoodsScore";
		return baseDAO.find(hql);
	}

	@Override
	public void updateGoodsScore(GoodsScore goodsScore) {
		// TODO Auto-generated method stub
		baseDAO.update(goodsScore);

	}

	/*
	 * @Override public User login(User user) { return null; }
	 */

}
