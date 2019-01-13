package com.accolite.au.pratice;

import java.util.Comparator;

class Sortbyname implements Comparator<Employee> 
{
    
    public int compare(Employee a, Employee b) 
    { 
        return a.employname.compareTo(b.employname); 
    } 
} 