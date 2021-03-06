package com.hiphop.common.base.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiphop.common.base.dao.SysUserMenuDao;
import com.hiphop.common.base.domin.SysUserMenu;
import com.hiphop.common.base.service.SysUserMenuSerivce;

@Service
public class SysUserMenuSerivceImpl implements SysUserMenuSerivce {

	@Autowired
	private SysUserMenuDao dao;

	@Override
	public List<SysUserMenu> list(Long userID) {
		return dao.list(userID);
	}

}
