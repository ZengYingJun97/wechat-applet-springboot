package com.handsome.wechatappletspringboot.pojo;

import java.util.Date;

/**
 * Area
 *
 * @author handsome
 * @date 2020年 02月16日 11:37:30
 */
public class Area {

	//主键ID
	private int areaId;

	//名称
	private String areaName;

	//权重
	private int priority;

	//创建时间
	private Date createTime;

	//更新时间
	private Date lastEditTime;

	public int getAreaId() {
		return areaId;
	}

	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEDitTime) {
		this.lastEditTime = lastEDitTime;
	}

	@Override
	public String toString() {
		return "Area{" +
				"areaId=" + areaId +
				", areaName='" + areaName + '\'' +
				", priority=" + priority +
				", createTime=" + createTime +
				", lastEditTime=" + lastEditTime +
				'}';
	}
}
