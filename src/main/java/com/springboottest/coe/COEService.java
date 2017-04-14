package com.springboottest.coe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class COEService {

	/*@Autowired
	List<COE> coeList;
	 */

	@Autowired
	private COERepositry coeRepositry;

	public List getCOEList()
	{
		//		return coeList;
		List coeList = new ArrayList<COE>();

		coeRepositry.findAll().forEach(coeList::add);

		return coeList;

	}


	public COE getCOE(String name){


		//		return coeList.stream().filter(e -> e.getName().equals(name)).findFirst().get();

		return coeRepositry.findOne(name);

	}


	public boolean addCOE(COE coe) {

		//		return coeList.add(coe);

		coeRepositry.save(coe);

		return true;
	}


	public boolean updateCOE(COE coe, String name) {
		// TODO Auto-generated method stub

		/*for (int i = 0; i < coeList.size(); i++) {

			if(name.equals(coeList.get(i).getName()))
			{
				coeList.set(i, coe);
				return true;
			}

		}
		 */

		coeRepositry.save(coe);

		return true;

	}


	public boolean deleteCOE(String name) {

		//		return coeList.removeIf(t -> t.getName().equals(name));

		coeRepositry.delete(name);

		return true;
	}

}
