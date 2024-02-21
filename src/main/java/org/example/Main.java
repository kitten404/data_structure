package org.example;

import linkedlist.DoublyLinkedList;
import linkedlist.LinkedList;
import linkedlist.Node;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("Hello world!");
        var linkedList = new LinkedList(4);
        linkedList.append(5);
        linkedList.append(90);
        linkedList.append(40);
        linkedList.print();
        System.out.println("-----// ------");
        System.out.println("removed Last: " + linkedList.removeLast().value);
        System.out.println("removed Last: " + linkedList.removeLast().value);
        //System.out.println("removed Last: " + linkedList.removeLast().value);
        //System.out.println("removed Last: " + linkedList.removeLast().value);
        linkedList.prepend(38);
        System.out.println("value: " + linkedList.get(0).value);
        linkedList.print();
        System.out.println("-----// ------");
        linkedList.removeFirst();
        linkedList.removeFirst();
        linkedList.append(41);
        linkedList.append(85);
        linkedList.set(2, 90);
        linkedList.insert(2, 45);
        //linkedList.remove(0);
        linkedList.print();
        System.out.println("-----// reverse ------");
        linkedList.reverse();
        linkedList.print();*/
        var dll = new DoublyLinkedList(5);
        dll.append(10);
        dll.append(14);
        System.out.println("initial list");
        dll.printList();
        dll.removeLast();
        dll.removeLast();
        System.out.println("final list");
        dll.prepend(199);
        dll.prepend(234);
        dll.prepend(75);
        dll.printList();
       // dll.removeFirst();
       System.out.println("list: ");
        dll.printList();
        System.out.println("get index of 2: " + dll.get(2).value);
        dll.set(2, 19909);
        dll.insert(2, 99);
        dll.remove(2);
        System.out.println("list: ");
        dll.printList();
    }
}