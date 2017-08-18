package entity;

import java.util.Date;

/**
 * 网站系统 用户
 *
 * @author HL 2017-06-26 15:37:24
 */
public class SysUser {

	private Integer id;

	/**
	 * 登录账号
	 */
	private String loginName;

	/**
	 * 登录密码
	 */
	private String password;

	/**
	 * 用户真实称谓
	 */
	private String realName;

	/**
	 * 用户简称
	 */
	private String callName;

	/**
	 * 用户类型
	 */
	private String type;

	/**
	 * 添加人 id-添加时名称
	 */
	private String adderName;

	/**
	 * 添加时间 数据库自动插入时间戳
	 */
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getCallName() {
		return callName;
	}

	public void setCallName(String callName) {
		this.callName = callName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAdderName() {
		return adderName;
	}

	public void setAdderName(String adderName) {
		this.adderName = adderName;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
}
