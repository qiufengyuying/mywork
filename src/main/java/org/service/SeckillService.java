package org.service;

import java.util.List;

import org.entity.Seckill;

/**
 * 
 * @author Administrator
 *
 */
//方法定義力度，参数，返回类型
public interface SeckillService {
	/**
	 * 
	 * @return
	 */
	List<Seckill>  getSeckillList();
	/**
	 * 
	 * @param seckillId
	 * @return
	 */
	Seckill  getSeckillById(int seckillId);

}
