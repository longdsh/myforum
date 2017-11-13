package com.acm.bean;
/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2017年11月13日 下午5:48:47
* 类说明 贴子
*/

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Topic extends Article {
	private Forum forum;// 所属板块

	private Date lastUpDateTime;

	private int type;// 贴子类型

	private Set<Reply> replys = new HashSet<Reply>();

	public Topic() {
		// TODO Auto-generated constructor stub
	}

	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public Date getLastUpDateTime() {
		return lastUpDateTime;
	}

	public void setLastUpDateTime(Date lastUpDateTime) {
		this.lastUpDateTime = lastUpDateTime;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Set<Reply> getReplys() {
		return replys;
	}

	public void setReplys(Set<Reply> replys) {
		this.replys = replys;
	}

	@Override
	public String toString() {
		return "Topic [forum=" + forum + ", lastUpDateTime=" + lastUpDateTime + ", type=" + type + "]";
	}
	
	
	
	
}
