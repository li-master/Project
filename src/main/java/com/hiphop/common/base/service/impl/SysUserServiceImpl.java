package com.hiphop.common.base.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiphop.common.base.dao.SysUserDao;
import com.hiphop.common.base.domin.SysUser;
import com.hiphop.common.base.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService {

	@Autowired
	private SysUserDao dao;
	
	@Override
	public List<SysUser> list(Map<String, Object> map) {
		return dao.list(map);
	}

	@Override
	public SysUser doLog(SysUser sysUser) {
		// TODO Auto-generated method stub
		SysUser userLogin = dao.userLogin(sysUser);
		return userLogin;
	}

}
