package org.dao;

import org.entity.SuccessKilled;

public interface SuccessKilledDao {
	/**
	 * ���빺����ϸ���ɹ����ظ�
	 * @param id
	 * @param phone
	 * @return
	 */
	int insertSuccessKilled(long id,long phone);
	/**
	 * ����id��ѯSuccessKilled��Я����ɱ����ʵ��
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId);

}
