package com.handsome.wechatappletspringboot.exception;

/**
 * 插入区域数据异常
 *
 * @author handsome
 * @date 2020年 02月17日 22:43:22
 */
public class InsertErrorException extends AppletException {

	public InsertErrorException(String message) {
		super(message);
	}

	public InsertErrorException(String message, Throwable cause) {
		super(message, cause);
	}
}
