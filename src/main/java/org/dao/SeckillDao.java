package org.dao;

import java.sql.Date;
import java.util.List;

import org.entity.Seckill;

public interface SeckillDao {
	/**
	 * 减库存
	 * @param id
	 * @param time
	 * @return
	 */
	int reduceNumber(long seckillId,Date killTime);
	/**
	 * 
	 * @param id
	 * @return
	 */
	Seckill queryById(int seckillId);
	/**
	 * 根据偏移量查询秒杀商品列表
	 * @param offet
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAll(int offet, int limit);

}
