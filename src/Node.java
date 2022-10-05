import java.io.*;
import java.util.List;

import java.util.LinkedList;

public class Node {

    Node next;
    int data;

    public Node(int newData){

        data = newData;
        next = null;

        //we do not know what the next node will be since it is not in constructor. need add'l constructor
    }

    public Node(int newData, Node nextNode){
        data = newData;
        next = nextNode;
    }


    public Node getNext(){
        return this.next;
    }
    public void setNext(Node next){

    this.next = next;}

    public void setData(int newData){

        data = newData;
    }

    public int getData(){
        return this.data;
    }
}
