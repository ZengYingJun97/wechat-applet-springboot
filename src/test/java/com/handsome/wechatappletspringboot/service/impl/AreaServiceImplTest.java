package com.handsome.wechatappletspringboot.service.impl;

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

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class AreaServiceImplTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private AreaServiceImpl areaServiceImpl;

	@Test
	public void getAreaList() {
		List<Area> areas = areaServiceImpl.getAreaList();
		logger.info("areas = {}", areas);
	}

	@Test
	public void getAreaById() {
		int areaId = 1;
		Area area = areaServiceImpl.getAreaById(areaId);
		logger.info("area = {}", area);
	}

	@Test
	public void addArea() {
		Area area = new Area();
		area.setAreaName("南苑");
		area.setPriority(3);
		boolean isAdd = areaServiceImpl.addArea(area);
		logger.info("isAdd = {}", isAdd);
	}

	@Test
	public void modifyArea() {
		Area area = new Area();
		area.setAreaId(2);
		area.setAreaName("南苑");
		area.setPriority(3);
		boolean isModify = areaServiceImpl.modifyArea(area);
		logger.info("isModify = {}", isModify);
	}

	@Test
	public void deleteArea() {
		int areaId = 1;
		boolean isDelete = areaServiceImpl.deleteArea(areaId);
		logger.info("isDelete = {}", isDelete);
	}
}