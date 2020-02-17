package com.handsome.wechatappletspringboot.service.impl;

import com.handsome.wechatappletspringboot.dao.AreaDao;
import com.handsome.wechatappletspringboot.exception.AppletException;
import com.handsome.wechatappletspringboot.exception.UpdateErrorException;
import com.handsome.wechatappletspringboot.pojo.Area;
import com.handsome.wechatappletspringboot.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

	@Transactional
	@Override
	public Area getAreaById(int areaId) {
		return areaDao.queryAreaById(areaId);
	}

	@Override
	public boolean addArea(Area area) {
		if (area.getAreaName() != null && !area.getAreaName().equals("")) {
			area.setCreateTime(new Date());
			area.setLastEditTime(new Date());
			try {
				int addNum = areaDao.insertArea(area);
				if (addNum > 0) {
					return true;
				} else {
					throw new UpdateErrorException("插入区域信息失败！");
				}
			} catch (UpdateErrorException e) {
				throw new UpdateErrorException("插入区域信息失败：" + e.getMessage());
			} catch (Exception e) {
				throw new AppletException("其他错误");
			}
		} else {
			throw new NullPointerException("区域信息不能为空！");
		}
	}

	@Override
	public boolean modifyArea(Area area) {
		if (area.getAreaId() > 0) {
			area.setLastEditTime(new Date());
			try {
				int modifyNum = areaDao.updateArea(area);
				if (modifyNum > 0) {
					return true;
				} else {
					throw new UpdateErrorException("更新区域信息失败！");
				}
			} catch (UpdateErrorException e) {
				throw new UpdateErrorException("更新区域信息失败：" + e.getMessage());
			} catch (Exception e) {
				throw new AppletException("其他错误");
			}
		} else {
			throw new NullPointerException("区域信息不能为空！");
		}
	}

	@Override
	public boolean deleteArea(int areaId) {
		if (areaId > 0) {
			try {
				int deleteNum = areaDao.deleteArea(areaId);
				if (deleteNum > 0) {
					return true;
				} else {
					throw new UpdateErrorException("删除区域信息失败！");
				}
			} catch (UpdateErrorException e) {
				throw new UpdateErrorException("删除区域信息失败：" + e.getMessage());
			} catch (Exception e) {
				throw new AppletException("其他错误");
			}
		} else {
			throw new NullPointerException("区域id不能为空！");
		}
	}
}
