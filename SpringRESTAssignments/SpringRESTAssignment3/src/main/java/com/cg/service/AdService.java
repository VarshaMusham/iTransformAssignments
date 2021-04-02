package com.cg.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.entity.Address;

@Service
public class AdService {
	
	public List<Address> getall(){
		List<Address> al=new ArrayList();
		al.add(new Address(1001,"Karnataka","Bangalore","IN"));
		al.add(new Address(47,"Telangana","Hyderabad","IN"));
		
		return al;
	}
	
	public Address getone(int a) {
		List<Address> al=getall();
		Address ad = null;
		for(Address i:al) {
			if(i.getZipcode()==a) {
				ad=i;
			}
		}
		return ad;
	}

}
