package com.cg.service;

import java.util.ArrayList;
import java.util.List;



import org.springframework.stereotype.Service;

import com.cg.entity.User;

@Service
public class UserService {
	
	//@PersistenceContext	
	// EntityManager em;
	
	public List<User> allUsers(){
		List<User> ul=new ArrayList();
		ul.add(new User("varsha","123"));
		ul.add(new User("shreya","hello"));
		
		return ul;
		
	}
	
	public String login(String a,String b) {
		
		//String a=u.getUsername();
		//String b=u.getPassword();
		String c = null;
		List<User> ul=allUsers();
		
			for(User i:ul) {
				if(i.getUsername().equalsIgnoreCase(a) && i.getPassword().equalsIgnoreCase(b)) {
					System.out.println(a);
					c="valid user";
					break;
				}
				else {
					c="Invaid user";
				}
			}
		
		return c;
		
	}
	
	/*
	public String loginUser(User u) {
		String type = null;
		String flag = null;
	Query q=em.createQuery("select m.username,m.password from Userdata m where m.username=?1 and m.userPassword=?2");
	String a=u.getUsername();
	String b=u.getPassword();
	q.setParameter(1,a);
	q.setParameter(2,b);
	String s="admin";
	try
	{
		type=(String) q.getSingleResult();
		if(type.equalsIgnoreCase(s) && type!=null) {
			 flag=s;
		 }
		 else if(!type.equalsIgnoreCase(s) && type!=null)
			 flag="student";
		return flag;
	}catch(javax.persistence.NoResultException e)
    {
		
        e.printStackTrace();
    }
	return "no";
	}
	*/
	

}
