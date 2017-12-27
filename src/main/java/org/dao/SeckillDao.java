package org.dao;

import java.sql.Date;
import java.util.List;

import org.entity.Seckill;

public interface SeckillDao {
	/**
	 * �����
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
	 * ����ƫ������ѯ��ɱ��Ʒ�б�
	 * @param offet
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAll(int offet, int limit);

}
