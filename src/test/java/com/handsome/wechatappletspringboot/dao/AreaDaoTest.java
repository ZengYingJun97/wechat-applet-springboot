package com.handsome.wechatappletspringboot.dao;

import com.handsome.wechatappletspringboot.pojo.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class AreaDaoTest {

	@Autowired
	private AreaDao areaDao;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void queryAll() {
		List<Area> areaList = areaDao.queryAll();
		logger.info("areaList = {}", areaList);
	}

	@Test
	public void queryAreaById() {
	}

	@Test
	public void insertArea() {
	}

	@Test
	public void updateArea() {
	}

	@Test
	public void deleteArea() {
	}
}