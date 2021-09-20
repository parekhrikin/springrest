package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Load;

public interface LoadService {

	public List<Load> getLoad();

	public Load getLoadById(long shipperId);

	public Load addLoad(Load load);

	public Load updateLoad(Load load);

	public Load deleteLoadById(Long shipperId);
	
}
