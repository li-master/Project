package com.hiphop.common.base.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hiphop.common.base.service.SysUserService;
import com.hiphop.common.util.R;
import com.hiphop.common.util.ResultModel;

@Controller
@RequestMapping("/home/user")
public class SysUserController {

	@Autowired
	private HttpServletRequest request;

	@Autowired
	private HttpServletResponse respone;

	@Autowired
	private SysUserService sysUserService;

	@GetMapping()
	String home(String type,HttpServletRequest request) {
		request.setAttribute("type", type);
		return "home/user/list";
	}

	@GetMapping("/add")
	String add(Long id) {
		return "home/user/add";
	}

	@GetMapping("/update")
	String update() {
		return "home/user/update";
	}

	@GetMapping("/list")
	@ResponseBody
	ResultModel list(@RequestParam Map<String, Object> map) {
		return new ResultModel(R.OK, sysUserService.list(map));
	}
}
