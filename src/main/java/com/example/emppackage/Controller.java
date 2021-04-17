package com.example.emppackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.CommandLineRunner;

import java.net.URI;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/employee")
public class Controller {

//@Autowired


    public Controller() {
        System.out.println("*****************************************************");
        System.out.println("This is Second Controller");
        System.out.println("I am inside Rest Controller ");
        System.out.println("*****************************************************");

    }

    //
//    @GetMapping(path = "/singleempl")
//    public String getAllEmployees(){
//        String name = empl_Info.getEmployeeName();
//        return name;
//    }
//
///*

    @GetMapping(path = "/All_list")
    public List<String>  GetEmployeeList()
    {
//        @Autowired
        employee empl_Info  = new employee();
//        List<String> empl_list = empl_Info.getEmployeeList();

    List<String> empl_list;
    empl_list= empl_Info.getEmployeeList();
    System.out.println(empl_list);
    return empl_list ;

//        String test = "Hiiiii";
//        return test;
    }

    @GetMapping(path = "/Hi")
    public String getHi()
    {
        String test = "Hiiiii";
        return test;
    }

    @PostMapping(path = "/addName")
    public List<String> addEmployeeName(@RequestBody String empName) {
        employee empl_Info  = new employee();
//        List<String> empl_list = empl_Info.getEmployeeList();

        //List<String> empl_list;
        List<String> empl_list= empl_Info.getEmployeeList();
        System.out.println("Before inserting employee name list size is: "+empl_list);
        empl_list.add(empName);
        System.out.println("Final list size after inserting employee name is: "+empl_list);
        return empl_list;
    }

    @PostMapping(path = "/addCustName")
    public ResponseEntity<CustDetails> createCustDetails(@RequestBody CustDetails custDetails)
    {

       System.out.println(" I am inside addCustName");
       System.out.println("Customer Details are: ID is : "+ custDetails.getId()+ " First Name : "+ custDetails.getName().firstName);
       // return custDetails;
        return ResponseEntity.ok(custDetails);
        //URI location = URI.create(String.format("/persons/%s", custDetails.getName().firstName));
        //return ResponseEntity.created(location).build();
    }

    @PostMapping(path = "/addCustName1")
    public ResponseEntity<CustDetails1> createCustDetails(@RequestBody CustDetails1 custDetails1)
    {

        System.out.println(" I am inside addCustName");
        System.out.println("Customer Details are: ID is : "+ custDetails1.getId()+ " First Name : "+ custDetails1.getName1().firstName);
        // return custDetails;
        return ResponseEntity.ok(custDetails1);
        //URI location = URI.create(String.format("/persons/%s", custDetails.getName().firstName));
        //return ResponseEntity.created(location).build();
    }

//*/
//
//    @GetMapping(path = "/all_list")
//
//
//    public employee empMain;
//    public List<String> empl_list = new List<String>;
//    empl_list() = empMain.getEmployeeList();
//    System.out.println(empl_list);

    //    public List<String> GellEmployeeList(){
//        empl_list = empl_Info.getEmployeeList();
//        return empl_list;
//    }
    public String nameTOPrint = "Sagar";

//   @Component
//   public class MyRunner implements CommandLineRunner {
//
//       @Override
//       public void run(String... args) throws Exception {
////           System.out.println("Enter word!");
////           nameTOPrint = (String) empl_list.get(0);
//           empl_list.
//           System.out.println(empl_list);
//       }
//
//    };
}
