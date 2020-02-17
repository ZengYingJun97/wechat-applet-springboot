package com.handsome.wechatappletspringboot.service;

import com.handsome.wechatappletspringboot.pojo.Area;

import java.util.List;

/**
 * AreaService
 *
 * @author handsome
 * @date 2020年 02月17日 22:30:59
 */
public interface AreaService {

	/**
	 * 获取area列表 
	 * @date 2020/02/17 22:32:04
	 * @author handsome
	 * @param 
	 * @return java.util.List<com.handsome.wechatappletspringboot.pojo.Area>
	 */        
	List<Area> getAreaList();
	
	/**
	 * 通过id获取area
	 * @date 2020/02/17 22:32:51
	 * @author handsome
	 * @param areaId
	 * @return com.handsome.wechatappletspringboot.pojo.Area
	 */        
	Area getAreaById(int areaId);

	/**
	 * 添加area
	 * @date 2020/02/17 22:33:32
	 * @author handsome
	 * @param area
	 * @return boolean
	 */        
	boolean addArea(Area area);

	/**
	 * 修改area
	 * @date 2020/02/17 22:33:55
	 * @author handsome
	 * @param area
	 * @return boolean
	 */        
	boolean modifyArea(Area area);

	/**
	 * 删除area 
	 * @date 2020/02/17 22:35:18
	 * @author handsome
	 * @param areaId
	 * @return boolean
	 */        
	boolean deleteArea(int areaId);
}
