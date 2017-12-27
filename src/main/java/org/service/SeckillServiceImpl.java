package org.service;

import java.util.List;

import org.dao.SeckillDao;
import org.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SeckillServiceImpl implements SeckillService {
	@Autowired
	private SeckillDao SeckillDao;

	@Override
	public List<Seckill> getSeckillList() {
		return null;
	}
    @Transactional
	@Override
	public Seckill getSeckillById(int seckillId) {
		return SeckillDao.queryById(seckillId);
	}

}
