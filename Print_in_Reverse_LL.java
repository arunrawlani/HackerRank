/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    if(head == null){ // base case
    }
    else{
        ReversePrint(head.next); //carry it forward and recurse till it reaches the end
        System.out.println(head.data); //start print from the back
    }
    

}