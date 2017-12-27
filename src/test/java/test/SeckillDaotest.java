package test;
import javax.annotation.Resource;

import org.entity.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.service.SeckillService;
import org.service.SeckillServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * junit����ʱ����springIOC����
 */
@RunWith(SpringJUnit4ClassRunner.class)
//����junit spring �����ļ�
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class SeckillDaotest {
	//private final Logger logger = LoggerFactory.getLogger(this.getClass());
	//ע��DAOʵ��������
     @Resource
     private  SeckillService   SeckillService ;
	@Test
	public void reduceNumber() throws Exception{
		int id =1001;
		Seckill seckill = SeckillService.getSeckillById(id);
		System.out.println(seckill.getName());
		System.out.println(seckill);
		
	}

}
