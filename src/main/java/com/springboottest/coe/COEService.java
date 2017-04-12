package com.springboottest.coe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class COEService {

	List<COE> coeList =  new ArrayList<COE>(Arrays.asList( new COE("java", "100","COE For Java Projects", "java/jee"),
			new COE("dotnet", "50","COE For .net Projects", ".net/c#"),
			new COE("mainframe", "100","COE For MainFrame Projects", "cobol"),
			new COE("tibco", "10","COE For tibco Projects", "tibco")));

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

}
