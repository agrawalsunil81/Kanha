package com.java.io.operation;

class Node<T> implements Comparable<T>{

	private T value;
	private Node<T> next;
	
	
	
	public T getValue() {
		return value;
	}



	public void setValue(T value) {
		this.value = value;
	}



	public Node<T> getNext() {
		return next;
	}



	public void setNext(Node<T> next) {
		this.next = next;
	}



	@Override
	public int compareTo(T arg) {
		if(arg == this.value){
            return 0;
        } else {
            return 1;
        }
	}
	
}

public class SinglyLinkedListImpl<T> {

	private Node<T> head;
	
	public void add(T element){
        
        Node<T> nd = new Node<T>();
        nd.setValue(element);
        System.out.println("Adding: "+element);
        Node<T> tmp = head;
        while(true){
            if(tmp == null){
                //since there is only one element, both head and 
                //tail points to the same object.
                head = nd;
                break;
            } else if(tmp.getNext() == null){
                tmp.setNext(nd);
                break;
            } else {
                tmp = tmp.getNext();
            }
        }
    }
	
	public void traverse(){
        
        Node<T> tmp = head;
        while(true){
            if(tmp == null){
                break;
            }
            System.out.print(tmp.getValue()+"\t");
            tmp = tmp.getNext();
        }
    }
	
	 public void reverse(){
         
	        System.out.println("\nReversing the linked list\n");
	        Node<T> prev = null;
	        Node<T> current = head;
	        Node<T> next = null;
	        while(current != null){
	            next = current.getNext();
	            current.setNext(prev);
	            prev = current;
	            current = next;
	        }
	        head = prev;
	    }
	 
	public static void main(String[] args) {
		 SinglyLinkedListImpl<Integer> sl = new SinglyLinkedListImpl<Integer>();
	        sl.add(3);
	        sl.add(32);
	        sl.add(54);
	        sl.add(89);
	        System.out.println();
	        sl.traverse();
	        System.out.println();
	        sl.reverse();
	        sl.traverse();

	}

}
