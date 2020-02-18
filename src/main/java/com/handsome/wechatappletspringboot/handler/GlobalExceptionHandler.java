package com.handsome.wechatappletspringboot.handler;

import com.handsome.wechatappletspringboot.exception.AppletException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 异常捕获处理
 *
 * @author handsome
 * @date 2020年 02月18日 22:48:40
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = AppletException.class)
	@ResponseBody
	private Map<String, Object> appletExceptionHandler(HttpServletRequest req, AppletException e) {
		Map<String, Object> modelMap = new HashMap<>();
		modelMap.put("success", false);
		modelMap.put("errMsg", e.getMessage());
		return modelMap;
	}
}
