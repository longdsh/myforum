package com.acm.bean;
/**
* @author 计算机网络应用 路素飞 E-mail:2512977541@qq.com
* @version 创建时间：2017年11月13日 下午5:45:16
* 类说明
*/

import java.util.Date;

public class Article {
	private int id;
	private String title;//标题
	private String content;//内容包含html
	private Date postTime;//发表时间
	private User auther;//作者
	public Article() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPostTime() {
		return postTime;
	}
	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}
	public User getAuther() {
		return auther;
	}
	public void setAuther(User auther) {
		this.auther = auther;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", postTime=" + postTime + "]";
	}
	

}
