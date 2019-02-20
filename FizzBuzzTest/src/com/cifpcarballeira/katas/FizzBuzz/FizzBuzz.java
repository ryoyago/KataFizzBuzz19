/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cifpcarballeira.katas.FizzBuzz;

/**
 *
 * @author dam210
 */
public class FizzBuzz {

    public String getFizzBuzz(int i) {
        
        String s=""+i;
        
        if ((i%3==0 || s.contains(""+3) )&& (i%5==0 || s.contains(""+5))) 
            return "FizzBuzz";
        if (i%3==0 || s.contains(""+3)) 
            return "Fizz";
        if (i%5==0 || s.contains(""+5))
            return "Buzz";
        
        return s;      
       
    }

    
    
}
