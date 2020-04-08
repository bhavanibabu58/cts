package cts.tm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cts.tm.entity.Login;
import cts.tm.pojo.LoginPojo;
import cts.tm.repository.LoginRepository;

@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginRepository loginRepository;
	@Override
	public LoginPojo save(LoginPojo loginPojo) {
		Login login = new Login();
		
		login.setUname(loginPojo.getUname());
		login.setPw(loginPojo.getPw());
		

		loginRepository.save(login);

		loginPojo.setId(login.getId());

		return loginPojo;
	}

}
