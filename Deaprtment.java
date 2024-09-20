package com.model;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deaprtment {
    public static void main(String[] args) {
        
        Map<String, List<String>> departmentEmployees = new HashMap<>();
        departmentEmployees.put("Sales",Arrays.asList("panda", "swap","Bob"));
        departmentEmployees.put("computer operator",Arrays.asList("oggy","akshu","davin"));
        departmentEmployees.put("IT",Arrays.asList("jack","kiran","Kevin"));
      for (Map.Entry<String,List<String>> 
      entry:departmentEmployees.entrySet()) 
      {
            String department = entry.getKey();
            List<String> employees = entry.getValue();
            System.out.println("Department:"+ department);
            for (String employee : employees) {
                System.out.println(" "+employee);
            }
        }
    }
}
