package com.handsome.wechatappletspringboot.service.impl;

import com.handsome.wechatappletspringboot.dao.AreaDao;
import com.handsome.wechatappletspringboot.pojo.Area;
import com.handsome.wechatappletspringboot.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * AreaServiceImpl
 *
 * @author handsome
 * @date 2020年 02月17日 22:35:04
 */
@Service
public class AreaServiceImpl implements AreaService {

	@Autowired
	private AreaDao areaDao;

	@Override
	public List<Area> getAreaList() {
		return areaDao.queryAll();
	}

	@Override
	public Area getAreaById(int areaId) {
		return areaDao.queryAreaById(areaId);
	}

	@Override
	public boolean addArea(Area area) {
		if (area.getAreaName() != null && !area.getAreaName().equals("")) {
			area.setCreateTime(new Date());
			area.setLastEditTime(new Date());
		}
		return false;
	}

	@Override
	public boolean modifyArea(Area area) {
		return false;
	}

	@Override
	public boolean deleteArea(int areaId) {
		return false;
	}
}
