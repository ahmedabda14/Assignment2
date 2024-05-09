/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment2;
import java.util.*;

/**
Lab task
__________________________________________________________
Important Note: After completing each task, please copy the code to
the Word file and take a screenshot of the output. Then, submit the
assignment through the provided link.
Task 1) Write a generic method to find all the repeated object in the
range of a list.
Input: [1, 1, 2, 2, 3, 4, 5, 6, 6]
Output 1: Repeated Elements are: 1 , 2 , 6
Input: ["apple", "banana", "apple", "orange", "banana", "grape",
"orange"]
Output: Repeated elements : apple, banana, orange]
Task 2) Write a Java program to get all the element in a tree set which is
greater than and less than to the given element.
Input: 23, 44, 45, 46, 55, 100, 102,2222, 100000
•Given number: 100 (get from the user)
Output: Less than given element: 23, 44, 46, 55
Greater than given element: 102, 2222, 100000
Task 3 ) Write a Java program to add all the elements which is divisible
by both 3 and 5 of a priority queue to another priority queue.
Task 4) Create a class called Cinema with attributes (String Genre, double
revenue, String year). By using LinkedHashSet, write a program to
Implement the following
•Sort the cinema objects based on the Genre
•Find the movie that made highest profit
•Find the total revenue of the given year
Task 5) Write a Java program to find the greatest key and the least key
in a map.
Task 6) Write a Java program to display the values of a tree map whose
keys are less than a given key
Task 7) In a provided linked list, remove the node that is second from the
tail (the penultimate node), without utilizing any pre-defined methods.
Implement the logic independently.
Input: 3 – 5 – 5 – 6 – 78 – 7 – 44 - 9
Output: 3 – 5 – 5 – 6 – 78 – 7 – 9
**********************************************************
 * @author ahmed
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Random rand = new Random();
TreeSet<Integer>t= new TreeSet<>();
for(int i=0;i<10;i++){
    int n = rand.nextInt(0,200);
t.add(n);
}
    System.out.print("Default: "+t+" ");
System.out.println();
while(!t.isEmpty()){
        System.out.print("between 50 and 100: "+t.subSet(50, 100));
    break;
}
    }
    
}
