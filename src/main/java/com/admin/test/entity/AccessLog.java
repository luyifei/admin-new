package com.admin.test.entity;

import java.util.Date;

public class AccessLog {
	private Integer id;
	private String ip;
	private String url;
	private String param;
	private Date createTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url == null ? null : url.trim();
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param == null ? null : param.trim();
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
	public String toString() {
		return "AccessLog [id=" + id + ", ip=" + ip + ", url=" + url + ", param=" + param + ", createTime=" + createTime
				+ "]";
	}
}