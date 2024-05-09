/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;
import java.util.*;
/**
 *
 * @author ahmed
 */
public class Q3 {
            public static void main(String[] args) {
            Queue<Integer> q=new ArrayDeque<>();
            //It is not possible
            q.add(-4);
            q.add(0);
                        q.add(10);
            q.add(44);
            q.add(99);
            q.add(122);
            Queue<Integer> sortedq=new ArrayDeque<>();
while(!q.isEmpty()){
    int min =q.poll();
    if(!q.isEmpty()&&q.peek()<min){
        min=q.poll();
    }
    sortedq.add(min);
}
System.out.print(sortedq);
            
            }
}
