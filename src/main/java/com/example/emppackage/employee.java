package com.example.emppackage;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class employee {
    public String name;
    //public List<String> empl_list;
    public List<String> empl_list = new ArrayList<String>();
    public String getEmployeeName() {
        name = "Chetan Pawarrrrrrrrrrrrrrrrr";
        return name;
    }


    public List<String> getEmployeeList() {
        empl_list.add("Name1");
        empl_list.add("Name2");
        empl_list.add("Name3");
        return empl_list;
    }
}
