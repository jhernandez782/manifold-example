package com.ptc.solutions.core.joborder.services;

public interface JobOrderEndPoint  {

	Object ImportJobOrder_END( String JobOrderList);

	void NotifyJobOrderStatusChange_END(String JobOrders, String ProcessType);

	static void getInstance(String thingName) {
		System.out.println(String.format("instance of thingName : %s",thingName));
	}

}