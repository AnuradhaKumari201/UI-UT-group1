package com.knoldus;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Write a lambda expression that accepts two integer and returns max of them.
public class MaxMimum {

  public void takingTwoInteger( Integer firstInteger,  Integer secondInteger){
   
        List<Integer> list = new ArrayList<>();
          list.add(firstInteger);
          list.add(secondInteger);
          
      Optional<Integer> maxNumber = list.stream().max((i,j) -> i.compareTo(j));
    

      System.out.println(maxNumber.get());
             
    
    }

} 
    
