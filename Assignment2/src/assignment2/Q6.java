/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;


/**
 *
 * @author ahmed
 */

public class Q6 {
   public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
head.next.next.next.next=null;
        Node reversedHead = reverse(head);

        System.out.println("Reversed list:");
        printList(reversedHead);
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next;
        }

        return prev;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
