package com.springboottest.coe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class COEService {

	@Autowired
	List<COE> coeList;

	public List getCOEList()
	{
		return coeList;
	}

	
	public COE getCOE(String name){


		return coeList.stream().filter(e -> e.getName().equals(name)).findFirst().get();
	}


	public boolean addCOE(COE coe) {
		// TODO Auto-generated method stub
		return coeList.add(coe);
	}


	public boolean updateCOE(COE coe, String name) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < coeList.size(); i++) {
			
			if(name.equals(coeList.get(i).getName()))
			{
				coeList.set(i, coe);
				return true;
			}
			
		}
		
		return false;
		
	}


	public boolean deleteCOE(String name) {
		
		return coeList.removeIf(t -> t.getName().equals(name));
	}

}
