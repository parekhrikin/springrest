package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;


import com.springrest.springrest.entities.Load;

@Service
public class LoadServiceImpl implements LoadService {

	
	
	List<Load> list;
	
	public LoadServiceImpl() {
		
		list = new ArrayList<>();
//		list.add(new Load("Delhi", "Jaipur", "chemicals", "canter", 1, 100, "", 3456, "20-09-2021"));
//		list.add(new Course(4758, "Spring Boot Course", "creating REST API using Spring Boot"));
	}
	


	@Override
	public List<Load> getLoad() {
		// TODO Auto-generated method stub
		return list;
	}


	@Override
	public Load getLoadById(long shipperId) {
		// TODO Auto-generated method stub
		Load l = null;
		
		for(Load load: list) {
			if(load.getShipperId()==shipperId) {
				l = load;
				break;
			}
		}
		
		return l;
	}


	@Override
	public Load addLoad(Load load) {
		// TODO Auto-generated method stub
		list.add(load);
		return load;
	}


	@Override
	public Load updateLoad(Load load) {
		// TODO Auto-generated method stub

		list.forEach(e -> {
			if(e.getShipperId()==load.getShipperId()) {
				e.setLoadPoint(load.getLoadPoint());
				e.setUnloadPoint(load.getUnloadPoint());
				e.setProductType(load.getProductType());
				e.setTruckType(load.getTruckType());
				e.setNoOfTrucks(load.getNoOfTrucks());
				e.setWeight(load.getWeight());
				e.setComment(load.getComment());
				e.setShipperId(load.getShipperId());
				e.setDate(load.getDate());
			}
		});
		
		
		return load;
	}


	@Override
	public Load deleteLoadById(Long shipperId) {
		// TODO Auto-generated method stub
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			
			Load l = (Load)itr.next();
			if(l.getShipperId()==shipperId) {
				itr.remove();
			}
		}
		
		return (Load) list;
	}






	
}
