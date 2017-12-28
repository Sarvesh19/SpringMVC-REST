package com.springapp.constructorWay;

import org.springframework.beans.factory.annotation.Autowired;

public class Restaurant {
	
	IHotDrink iHotDrink;

	@Autowired
	private Tea teaBeain;
	
	public Restaurant(IHotDrink iHotDrink) {
		this.iHotDrink = iHotDrink;
	}
	
	public void RestaurantPrepareDrink(){
		this.iHotDrink.PrepareDrink();
		teaBeain.PrepareDrink();
	}
	
	

}
