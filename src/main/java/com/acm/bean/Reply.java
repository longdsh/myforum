package com.acm.bean;

/**
 * @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
 * @version 创建时间：2017年11月13日 下午5:55:44 类说明 回复
 */
public class Reply extends Article{

	
	
	private Topic topic;
	private int floor;// 楼层

	public Reply() {
		// TODO Auto-generated constructor stub
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return "Reply [topic=" + topic + ", floor=" + floor + "]";
	}
	
	
}
