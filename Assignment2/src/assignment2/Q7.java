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
public class Q7 {
       public static void main(String[] args) {
       String postfix = "abc++";
        String infix = convertToInfix(postfix);
        System.out.println(infix); 

        postfix = "ab*c+";
        infix = convertToInfix(postfix);
        System.out.println(infix); 

        postfix = "abc-+de-fg-h+/*";
        infix = convertToInfix(postfix);
        System.out.println(infix); 
       }
    public static String convertToInfix(String postfix) {
        Stack<String> stack = new Stack<>();
        for (char c : postfix.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                stack.push(String.valueOf(c));
            } else {
                String right = stack.pop();
                String left = stack.pop();
                stack.push("(" + left + c + right + ")");
            }
        }
        return stack.pop();
    }
       }

