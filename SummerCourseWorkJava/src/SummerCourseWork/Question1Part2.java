package SummerCourseWork;

public class Question1Part2 
{ 
    /*
 Given an n × n matrix B write a program that checks whether each row and
each column of B contains all the numbers 1, . . . , n and only one time each. For
example, the program must print ’YES’ for the following matrix
[ [1,2,3],
[2,3,1],
[3,1,2]]
and ’NO’ for the following one
[[1,2,3],
[3,2,1],
[2,1,3]]
because of the repetition of 2 in the second column and the repetition of 3 in
the third one.*/
    static String findSingle(int ar[][], int ar_size) 
     {
        
        int res;
        int res1;
        
        boolean checkrow;
        boolean checkcol; 
        for (int i = 0; i < ar.length; i++) {
            res = ar[i][0];
         for (int j = 1; j < ar[i].length; j++){
            checkrow = ar[i][0] == ar[i][j]; 
            if(checkrow)
             return "NO";
     }}
         for (int i = 0; i < ar.length; i++) {
            
         for (int j = 1; j < ar[i].length; j++){
             
            checkrow = ar[0][i] == ar[j][i]; 
          
            if(checkrow)
             return "NO";
     }
        
        }
        return "YES"; 
    } 
  
    // Driver code 
    public static void main (String[] args) 
    { 
        int ar[][] = {{1,2,3},
                     {3,2,1},
                     {3,1,2}};
        
        int n = ar.length; 
        
        System.out.println( findSingle(ar, n) ); 
    } 
} 