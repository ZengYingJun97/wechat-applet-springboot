package com.handsome.wechatappletspringboot.exception;

/**
 * 空数据异常
 *
 * @author handsome
 * @date 2020年 02月17日 22:46:13
 */
public class NullDataException extends AppletException {

	public NullDataException(String message) {
		super(message);
	}

	public NullDataException(String message, Throwable cause) {
		super(message, cause);
	}
}
