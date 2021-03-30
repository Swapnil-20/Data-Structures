import java.util.*;
     class Node{
         String data;
     Node next;
        public Node(String data)
        {
            this.data=data;
        }

        public String getData() {
            return this.data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

    }

class LinkedList{
         Node head;
         Node tail;

        public Node getHead() {
            return this.head;
        }

        public Node getTail() {
            return this.tail;
        }
        public void addNode(String data) {
            Node node=new Node(data);//create node
            if(head==null)
            {
                head=tail=node;
            }
            else{
                tail.next=node;
                tail=node;
            }
        }
     public  void display() {
         Node temp=head;
         while(temp!=null)
         {
             System.out.println(temp.getData());
             temp=temp.getNext();
         }
     }   
       public Node find(String data)
       {
           Node temp=head;
           while(temp!=null)
           {
               if(temp.getData().equals(data))
               return temp;
               temp=temp.getNext();
           }
           return null;
       } 

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
		list.addNode("Milan");
		list.addNode("Venice");
		list.addNode("Munich");
		list.addNode("Vienna");
		System.out.println("Adding an element to the linked list ");
        list.display();
        if (list.find("Munich") != null)
        System.out.println("Node found");
    else
        System.out.println("Node not found");
	}
}