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
public class Q5 {
                    public static void main(String[] args) {
           Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        Queue<Integer> shiftedQueue = shift(queue);

        System.out.println(shiftedQueue);
    }

    public static Queue<Integer> shift(Queue<Integer> queue) {
 Queue<Integer> aux = new LinkedList<>();
        for (int i = 0; i < queue.size()+1 / 2; i++) {
            aux.add(queue.poll());
        }

        while (!aux.isEmpty()) {
            queue.add(aux.poll());
        }

        return queue;
    }
    }

