package org.example;

import com.ptc.solutions.core.joborder.services.ProcessJobOrderEndPoint;
//import com.ptc.solutions.extensions.core.joborder.services.ProcessJobOrderEndPoint.JobOrderEndPointExtension;

public class Main {
    public static void main(String[] args) {
        ProcessJobOrderEndPoint jobOrderEndPoint = new ProcessJobOrderEndPoint();
        var json = "new joblis";
        jobOrderEndPoint.processImportJobOrder(json);

        System.out.println("Hello world!");
    }
}