package org.service;

import java.util.List;

import org.entity.Seckill;

/**
 * 
 * @author Administrator
 *
 */
//�������x���ȣ���������������
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
