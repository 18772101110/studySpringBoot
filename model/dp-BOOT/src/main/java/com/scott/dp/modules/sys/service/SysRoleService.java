package com.scott.dp.modules.sys.service;

import com.scott.dp.common.entity.Page;
import com.scott.dp.common.entity.R;
import com.scott.dp.modules.sys.entity.SysRoleEntity;

import java.util.List;
import java.util.Map;

/**
 * 系统角色
 * @author Mr.薛
 */
public interface SysRoleService {

	/**
	 * 分页查询角色列表
	 * @param params
	 * @return
	 */
	Page<SysRoleEntity> listRole(Map<String, Object> params);

	/**
	 * 新增角色
	 * @param role
	 * @return
	 */
	R saveRole(SysRoleEntity role);

	/**
	 * 根据id查询角色
	 * @param id
	 * @return
	 */
	R getRoleById(Long id);

	/**
	 * 修改角色
	 * @param role
	 * @return
	 */
	R updateRole(SysRoleEntity role);

	/**
	 * 删除角色
	 * @param id
	 * @return
	 */
	R batchRemove(Long[] id);

	/**
	 * 所有角色集合：用户角色选择数据源
	 * @return
	 */
	List<SysRoleEntity> listRole();

	/**
	 * 操作权限
	 * @param role
	 * @return
	 */
	R updateRoleOptAuthorization(SysRoleEntity role);

	/**
	 * 数据权限
	 * @param role
	 * @return
	 */
	R updateRoleDataAuthorization(SysRoleEntity role);

	/*根据用户Id查询角色id集合*/
	public List<Long> listUserRoleId(Long userId);
}
