package com.node.list;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add(7);
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(2);
        linkedList.add(3);

        System.out.print("Data before sorting : ");
        linkedList.printList();

        System.out.print("\nData after sorting : ");
        linkedList.sortData(linkedList::printList);
    }
}