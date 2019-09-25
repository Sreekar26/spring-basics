package com.kiran.service.impl;

import org.springframework.stereotype.Service;

import com.kiran.bean.LoginBean;
import com.kiran.services.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	
	// validating user name and password
	// if Success return true else false
	@Override
	public boolean loginAuth(LoginBean loginBean) {
		if (loginBean != null && loginBean.getUserName() != null & loginBean.getPassword() != null) {

			if (loginBean.getUserName().equals("kiran") && loginBean.getPassword().equals("kiran123")) {

				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

}
