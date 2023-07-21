package com.products.controller;

import com.products.service.EndUserReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NewClassForEndUserReportService {

    // this is the new class

    // here i am autowiring the EndUserReport service to call the methods in it
    @Autowired
    private EndUserReportService endUserReportService;


    public void callingMethod1(){
        // I am calling the EndUserReportService methods
        System.out.println(endUserReportService.method1());

    }

    public void callingMethod2(){
        System.out.println(endUserReportService.method2());

    }
    public void callingMethod3(){
        System.out.println(endUserReportService.method3());

    }
    public void callingMethod4(){
        System.out.println(endUserReportService.method4());

    }


}
