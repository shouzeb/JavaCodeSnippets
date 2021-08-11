/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SummerCourseWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 1.1 All numbers in a list (12 marks)
Let A be a list of length n. Write a function that returns true if A contains all
the numbers 1, . . . , n and each number occurs exactly once.
For example, the function should return true for A = [2, 1, 3] but f alse for
A = [2, 2, 1].
The runtime of the function must be O(n).
Remark: Function that takes more than O(n) but correct otherwise will
be worth 5 marks.
 */
public class Question1Part1 {

    
   static boolean findSingle(Integer  ar[]) 
     {
        Set<Integer> s =
           new HashSet<Integer>(Arrays.asList(ar));
 
        // If all elements are distinct, size of
        // HashSet should be same array.
        return (s.size() == ar.length) ;
    } 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        Integer  ar[] = {1,2,3,4,4}; 
       
        System.out.println("Element occurring once is " + 
                            findSingle(ar) + " "); 
    } 
    
}
