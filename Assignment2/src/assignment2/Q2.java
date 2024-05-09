/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;
import java.util.*;
/**
Lab task
__________________________________________________________

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
class classRoom{
int grade,studentNo;
String name;

    public classRoom(int grade, int studentNo, String name) {
        this.grade = grade;
        this.studentNo = studentNo;
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "classRoom{" + "grade=" + grade + ", studentNo=" + studentNo + ", name=" + name + '}';
    }

}
class compareGrade implements Comparator<classRoom>{

    @Override
    public int compare(classRoom o1, classRoom o2) {
return Integer.compare(o1.getGrade(), o2.getGrade());
    }
    
}
public class Q2 {
        public static void main(String[] args) {
        TreeMap <classRoom,Integer>T=new TreeMap<>(new compareGrade());
        T.put(new classRoom(20,20002,"mo"), 2);
                T.put(new classRoom(40,20342,"ah"), 4);
        T.put(new classRoom(90,20122,"pe"), 1);
        T.put(new classRoom(60,20392,"po"), 2);
for(Map.Entry<classRoom,Integer>entry:T.entrySet()){
    System.out.println(entry.getValue()+" "+entry.getKey());
}
        }
}
