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
       public void insertNode(String data,String element) {
           Node node=new Node(data);
            if(head==null)
            head=tail=node;
            else
            {
                Node a=find(element);
                if(a!=null)
                {
                    node.setNext(a.getNext());
                    a.setNext(node);
                    if(a==tail)
                    tail=node;
                }
                else
                System.out.println("Element not found");
            }
       }
       public void delete(String data) {
		if (this.head == null)
			System.out.println("List is empty");
		else {
			Node node = this.find(data);
			if (node == null)
				System.out.println("Node not found");
			else if (node == this.head) {
				this.head = this.head.getNext();
				node.setNext(null);
				if (node == this.tail)
					tail = null;
			} else {
				Node nodeBefore = null;
				Node temp = this.head;
				while (temp != null) {
					if (temp.getNext() == node) {
						nodeBefore = temp;
						break;
					}
					temp = temp.getNext();
				}
				nodeBefore.setNext(node.getNext());
				if (node == this.tail)
					this.tail = nodeBefore;
				node.setNext(null);
			}
		}
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
        list.insertNode("Prague","Munich");
        list.display();
        list.delete("Venice");
		list.display();
	}

}