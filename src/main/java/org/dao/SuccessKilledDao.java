package org.dao;

import org.entity.SuccessKilled;

public interface SuccessKilledDao {
	/**
	 * 插入购买明细，可过滤重复
	 * @param id
	 * @param phone
	 * @return
	 */
	int insertSuccessKilled(long id,long phone);
	/**
	 * 根据id查询SuccessKilled并携带秒杀对象实体
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId);

}
