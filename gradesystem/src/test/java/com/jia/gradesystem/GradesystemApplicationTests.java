package com.jia.gradesystem;

import com.jia.gradesystem.model.User;
import com.jia.gradesystem.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GradesystemApplicationTests {


	@Autowired
	UserService userService;

	@Test
	public void testUsers() {
		User user = new User();
		user.setUsername("jia");
		userService.create(user);
		List<User> userList = userService.findAll();
		assertTrue(userList.size()>0);
	}


}
