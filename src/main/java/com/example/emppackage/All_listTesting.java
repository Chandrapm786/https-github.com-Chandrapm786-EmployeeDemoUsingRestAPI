package com.example.emppackage;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class All_listTesting {

    List<String> empl_list = new ArrayList<String>();

    public All_listTesting() {
        System.out.println("Inside All_listTesting constructor .....");
        employee empl_Info = new employee();
        System.out.println("Employee name is: " +empl_Info.getEmployeeName());

       // empl_Info.getEmployeeList();
        empl_list = empl_Info.getEmployeeList();
        System.out.println("Number of elements in the list is: "+empl_list.size());
        System.out.println("I am coming out of constructor ...");
//        return empl_list ;
    }

}

//
//
//    @Autowired
//    employee empl_Info = new employee();
//
//    empl_list = empl_Info.getEmployeeList();
//    System.out.println(empl_list);
//    return empl_list ;
//}
