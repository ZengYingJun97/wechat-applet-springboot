package com.handsome.wechatappletspringboot.dao;

import com.handsome.wechatappletspringboot.pojo.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * AreaDao
 *
 * @author handsome
 * @date 2020年 02月16日 11:43:34
 */
@Mapper
public interface AreaDao {

	/**
	 * 查询所有area 
	 * @date 2020/02/16 18:42:30
	 * @author handsome
	 * @param 
	 * @return java.util.List<com.handsome.wechatappletspringboot.pojo.Area>
	 */
	List<Area> queryAll();

	/**
	 * 通过areaId查询area 
	 * @date 2020/02/16 18:42:54
	 * @author handsome
	 * @param areaId
	 * @return com.handsome.wechatappletspringboot.pojo.Area
	 */
	Area queryAreaById(int areaId);

	/**
	 * 插入area 
	 * @date 2020/02/16 18:43:33
	 * @author handsome
	 * @param area
	 * @return int
	 */
	int insertArea(Area area);

	/**
	 * 修改area 
	 * @date 2020/02/16 18:43:50
	 * @author handsome
	 * @param area
	 * @return int
	 */
	int updateArea(Area area);

	/**
	 * 删除area
	 * @date 2020/02/16 18:44:01
	 * @author handsome
	 * @param areaId
	 * @return int
	 */        
	int deleteArea(int areaId);
}
