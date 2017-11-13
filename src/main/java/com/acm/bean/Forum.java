package com.acm.bean;
/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2017年11月13日 下午5:49:42
* 类说明  板块
*/

import java.util.HashSet;
import java.util.Set;

public class Forum {
	private int id;
	private String name;
	private String description;// 描述
	private int topicCount;// 贴子数量
	private int position;// 板块排序用
	private Set<Topic> topics = new HashSet<Topic>();

	public Forum() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getTopicCount() {
		return topicCount;
	}

	public void setTopicCount(int topicCount) {
		this.topicCount = topicCount;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public Set<Topic> getTopics() {
		return topics;
	}

	public void setTopics(Set<Topic> topics) {
		this.topics = topics;
	}

	@Override
	public String toString() {
		return "Forum [id=" + id + ", name=" + name + ", description=" + description + ", topicCount=" + topicCount
				+ ", position=" + position + "]";
	}

}
