package com.handsome.wechatappletspringboot.controller;

import com.handsome.wechatappletspringboot.pojo.Area;
import com.handsome.wechatappletspringboot.service.impl.AreaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * AreaController
 *
 * @author handsome
 * @date 2020年 02月18日 22:55:39
 */
@RestController
@RequestMapping("/superadmin")
public class AreaController {

	@Autowired
	private AreaServiceImpl areaServiceImpl;

	@RequestMapping(value = "/listarea", method = RequestMethod.GET)
	private Map<String, Object> listArea() {
		Map<String, Object> modelMap = new HashMap<>();
		List<Area> areaList = areaServiceImpl.getAreaList();
		modelMap.put("areaList", areaList);
		return modelMap;
	}

	@RequestMapping(value = "/getareabyid", method = RequestMethod.GET)
	private Map<String, Object> getAreaById(int areaId) {
		Map<String, Object> modelMap = new HashMap<>();
		Area area = areaServiceImpl.getAreaById(areaId);
		modelMap.put("area", area);
		return modelMap;
	}

	@RequestMapping(value = "/addarea", method = RequestMethod.POST)
	private Map<String, Object> addArea(@RequestBody Area area) {
		Map<String, Object> modelMap = new HashMap<>();
		modelMap.put("success", areaServiceImpl.addArea(area));
		return modelMap;
	}

	@RequestMapping(value = "/modifyarea", method = RequestMethod.POST)
	private Map<String, Object> modifyArea(@RequestBody Area area) {
		Map<String, Object> modelMap = new HashMap<>();
		modelMap.put("success", areaServiceImpl.modifyArea(area));
		return modelMap;
	}

	@RequestMapping(value = "/removearea", method = RequestMethod.POST)
	private Map<String, Object> removeArea(int areaId) {
		Map<String, Object> modelMap = new HashMap<>();
		modelMap.put("success", areaServiceImpl.deleteArea(areaId));
		return modelMap;
	}
}
