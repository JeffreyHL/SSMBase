package entity;

import java.util.Date;

/**
 * @Title SysUser
 * @Description 系统用户表
 * @Author HL
 * @Date 2017年6月12日 上午11:26:48
 */
public class SysUser {

	private Integer id;
	private String loginName;
	private String realName;
	private String password;
	private Date addTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

}
