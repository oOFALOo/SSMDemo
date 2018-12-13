package com.fal.service;

import com.fal.entity.User;

public interface UserRoleService {
	public void setRoles(User user, long[] roleIds);
    public void deleteByUser(long userId);
    public void deleteByRole(long roleId);
}
