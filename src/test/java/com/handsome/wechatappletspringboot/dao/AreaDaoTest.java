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

import java.util.Date;
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
		int areaId = 1;
		Area area = areaDao.queryAreaById(areaId);
		logger.info("area = {}", area);
	}

	@Test
	public void insertArea() {
		Area area = new Area();
		area.setAreaName("南苑");
		area.setPriority(1);
		int insertCount = areaDao.insertArea(area);
		logger.info("insertCount = {}", insertCount);
	}

	@Test
	public void updateArea() {
		Area area = new Area();
		area.setAreaId(2);
		area.setAreaName("南苑");
		area.setLastEditTime(new Date());
		int updateCount = areaDao.updateArea(area);
		logger.info("updateCount = {}", updateCount);
	}

	@Test
	public void deleteArea() {
		int areaId = 2;
		int deleteCount = areaDao.deleteArea(areaId);
		logger.info("deleteCount = {}", deleteCount);
	}
}