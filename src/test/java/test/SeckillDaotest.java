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
 * junit启动时加载springIOC容器
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring 配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml" })
public class SeckillDaotest {
	//private final Logger logger = LoggerFactory.getLogger(this.getClass());
	//注入DAO实现类依赖
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
