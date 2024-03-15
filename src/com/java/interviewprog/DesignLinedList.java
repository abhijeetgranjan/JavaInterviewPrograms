package com.java.interviewprog;
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyLinkedList {
    Node head;
    int length ;

    public MyLinkedList() {
        head = null;
        this.length = 0;
    }

    public int get(int index) {
        if(index <0 || index >= this.length){
            return -1;
        }
        Node curr = this.head;
        int count =0;
        while(count <index){
            curr= curr.next;
            count++;
        }
        return curr.val;

    }

    public void addAtHead(int val) {
        if(this.length==0){
            Node firstNode= new Node(val);
            this.head = firstNode;
            this.length++;
        }else{
            Node firstNode= new Node(val);
            firstNode.next= head;
            this.head= firstNode;
            this.length++;
        }

    }

    public void addAtTail(int val) {
        if(this.length==0){
            addAtHead(val);
            return;
        }
        Node curr= this.head;
        while(curr.next!=null){
            curr=curr.next;
        }
        Node newNode = new Node(val);
        curr.next = newNode;
        this.length++;

    }

    public void addAtIndex(int index, int val) {
        if(index < 0 || index > length){
            return;
        }
        if(index==0){
            addAtHead(val);
            return;
        }
        int ctr=0;
        Node curr = head;
        while(ctr < index-1){
            curr= curr.next;
            ctr++;
        }
        Node newNode= new Node(val);
        newNode.next = curr.next;
        curr.next= newNode;
        this.length++;

    }

    public void deleteAtIndex(int index) {
        if(index <0 || index >=this.length ){
            return;
        }
        if(index==0){
            Node curr = head;
            head = head.next;
            this.length--;
            return;
        }
        int ctr=0;
        Node curr = head;
        while(ctr < index-1){
            curr= curr.next;
            ctr++;
        }
        curr.next = curr.next.next;
        this.length--;

    }
    public  void printList(){
        Node curr = this.head;
        while(curr!=null){
            System.out.print(curr.val +" --> ");
            curr = curr.next;
        }

    }
}
public class DesignLinedList {


    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addAtTail(1);
        myLinkedList.addAtTail(3);
        myLinkedList.printList();
    }
}
