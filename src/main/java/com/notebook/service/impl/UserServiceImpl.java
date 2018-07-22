package com.notebook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.notebook.entity.user;
import com.notebook.service.UserService;
import com.ssh.repository.userRepository;

/**
 * Created by XRog
 * On 2/2/2017.2:40 PM
 */
@Service
public class UserServiceImpl implements UserService {
	
@Autowired
private userRepository userRepository;
	@Override
	public long savaUser() {
		user user = new user();
		user.setName("zhangqi");
		user.setAge(23);
		return (Long) userRepository.save(user);
	}

   /* @Autowired
    private PersonRepository personRepository;

    public Long savePerson() {
        Person person = new Person();
        person.setUsername("XRog");
        person.setPhone("18381005946");
        person.setAddress("chenDu");
        person.setRemark("this is XRog");
        return personRepository.save(person);
    }*/
}