import java.util.*;

import java.io.*;

public class LinkedList {

        //head references the zeroth node or element in linkedlist
        // while Node next in node class is a reference to the next element in list
        Node head;


        //count lets us know when we are at the end of a list or
        //when the next reference is null
        int count;

        //Constructors

       public LinkedList(){
          head=null;
            count=0;

           //represents an empty linked list so count will be zero
                //handled null heads in add function
                // also null lists cannot use getNext() functions
       }

        public LinkedList(Node newHead){

            head = newHead;
            count=1;
        }

        //lets add values to linked list
    public void add(int newData){
            //check for null head to remove contructor of empty list


        Node temp = new Node(newData); //this will be our node to add or reference to next node
        Node current = head; //this is starting node

        if(head == null){
            head = temp; //adds our only data value as a node to the linked list
            count = 1;
        }


        while(current.getNext() != null){

                current = current.getNext(); //allows us to iterate through the list
        }
        current.setNext(temp); //once next node is null, set it to newData.

        count++; //we added data to a linked list
    }

    public int get(int index){

            if(index <=0){
                return -1; //proper way is to return null but null is not an int. Best Best is to throw an exception
            }

            Node current = head; //allows us to iterate

        for(int i =1; i<index; i++){
            //start at one not zero
            //reason is cuz lowest index entered is one. if one is entered we can just return the head

            current = current.getNext();
        }
        return current.getData(); //return node's data once we are at the entered index number
    }
    public int size(){


        return count;
    }

    public boolean isEmpty(){
            return head == null; //uncomment null constructor since I handled null heads in add.
                                //need a remove function to reach a null head value
    }

    public void remove(){
           //remove from back of list
        Node current = head;

        while(current.getNext().getNext() != null){
            current = current.getNext();
        }
        current.setNext(null);
        count--;
    }
    public static void main(String[] args){




    }
}
