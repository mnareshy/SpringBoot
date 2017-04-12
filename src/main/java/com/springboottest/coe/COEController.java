package com.springboottest.coe;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class COEController {
	
	@Autowired
	private COEService coeService;
	
	@RequestMapping("/COES")
	public List<COE> getCOEs()
	{
		return coeService.getCOEList();
	}
	
	@RequestMapping("/COES/{name}")
	public COE getCOE(@PathVariable("name") String name)
	{
		return coeService.getCOE(name);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/COES")
	public boolean addCOE(@RequestBody COE coe){
		
		
		return coeService.addCOE(coe);
		
	}

}
