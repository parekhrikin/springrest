package com.springrest.springrest.entities;

public class Load {

	private String loadPoint;
	private String unloadPoint;
	private String productType;
	private String truckType;
	private int noOfTrucks;
	private Long weight;
	private String comment;
	private Long shipperId;
	private String date;
	
	
	
	
	public Load(String loadPoint, String unloadPoint, String productType, String truckType, int noOfTrucks, Long weight,
			String comment, Long shipperId, String date) {
		super();
		this.loadPoint = loadPoint;
		this.unloadPoint = unloadPoint;
		this.productType = productType;
		this.truckType = truckType;
		this.noOfTrucks = noOfTrucks;
		this.weight = weight;
		this.comment = comment;
		this.shipperId = shipperId;
		this.date = date;
	}




	public Load() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getLoadPoint() {
		return loadPoint;
	}




	public void setLoadPoint(String loadPoint) {
		this.loadPoint = loadPoint;
	}




	public String getUnloadPoint() {
		return unloadPoint;
	}




	public void setUnloadPoint(String unloadPoint) {
		this.unloadPoint = unloadPoint;
	}




	public String getProductType() {
		return productType;
	}




	public void setProductType(String productType) {
		this.productType = productType;
	}




	public String getTruckType() {
		return truckType;
	}




	public void setTruckType(String truckType) {
		this.truckType = truckType;
	}




	public int getNoOfTrucks() {
		return noOfTrucks;
	}




	public void setNoOfTrucks(int noOfTrucks) {
		this.noOfTrucks = noOfTrucks;
	}




	public Long getWeight() {
		return weight;
	}




	public void setWeight(Long weight) {
		this.weight = weight;
	}




	public String getComment() {
		return comment;
	}




	public void setComment(String comment) {
		this.comment = comment;
	}




	public Long getShipperId() {
		return shipperId;
	}




	public void setShipperId(Long shipperId) {
		this.shipperId = shipperId;
	}




	public String getDate() {
		return date;
	}




	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
}
