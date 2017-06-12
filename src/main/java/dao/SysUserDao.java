package dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import entity.SysUser;

public interface SysUserDao {

	@Select("select * from sys_user where id = #{id}")
	public SysUser findUserById(Integer id);

	public List<SysUser> findUserList(SysUser user);
}
