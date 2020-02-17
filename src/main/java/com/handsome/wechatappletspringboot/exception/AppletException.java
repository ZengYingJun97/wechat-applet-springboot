package com.handsome.wechatappletspringboot.exception;

/**
 * 小程序相关异常
 *
 * @author handsome
 * @date 2020年 02月17日 22:41:28
 */
public class AppletException extends RuntimeException {

	public AppletException(String message) {
		super(message);
	}

	public AppletException(String message, Throwable cause) {
		super(message, cause);
	}
}
