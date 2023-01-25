package com.ptc.solutions.core.joborder.services;

public class ProcessJobOrderEndPoint implements JobOrderEndPoint {
    @Override
    public Object ImportJobOrder_END(String jobOrderList) {
        return new Object(){String json = jobOrderList;};
    }

    @Override
    public void NotifyJobOrderStatusChange_END(String JobOrders, String ProcessType) {
        System.out.println("Sent notification NotifyJobOrderStatusChange_END");
    }
}
