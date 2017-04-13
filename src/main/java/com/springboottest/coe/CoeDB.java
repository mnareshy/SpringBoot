package com.springboottest.coe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CoeDB {


	List<COE> coeList =  new ArrayList<COE>(Arrays.asList( new COE("java", "100","COE For Java Projects", "java/jee"),
			new COE("dotnet", "50","COE For .net Projects", ".net/c#"),
			new COE("mainframe", "100","COE For MainFrame Projects", "cobol"),
			new COE("tibco", "10","COE For tibco Projects", "tibco")));

	@Bean
	@Primary
	public List<COE> getCOEList()
	{

		return coeList;
	}

	@Bean
	public List<COE> getCOEListsss()
	{

		return coeList;
	}

}
