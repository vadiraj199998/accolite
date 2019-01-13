package com.accolite.au.pratice;

import java.util.Comparator;

class MySalaryComp implements Comparator<Employee>{
	 
    @Override
    public int compare(Employee e1, Employee e2) {
        if(e1.getAge() > e2.getAge()){
            return 1;
        } else {
            return -1;
        }
    }
}