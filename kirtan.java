class LL {
        Node head;
        int size;

        LL(){
            this.size = 0;
        }

        class Node{
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
                size++;
            }
        }

        public void addFirst(int data){
            Node newNode = new Node(data);

            if(head == null)
            {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }

            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = newNode;
        }

	/*

	public void deletFirst(){
		if(head == null){
			System.out.println("The list is empty");
			return;
		}
		head = head.next;
	}


	public void deletLast(){
	if(head == null){
			System.out.println("The list is empty");
			return;
		}
	if(head.next == null){
		head = null;
		return;
	}
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null){
			lastNode = lastNode.next;
			secondLast = secondLast.next;

		}
		secondLast.next = null;
	}
	*/


        public void printList(){
            if(head == null){
                System.out.println("List is empty");
                return;
            }
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data + " -> ");
                curr = curr.next;
            }
            System.out.println("NULL");

        }


        public int search(int n){
            if (head == null) {
                return -1;
            }
            int index = 0;
            Node temp = head;
            while (temp != null) {
                if (temp.data == n) {
                    return index;
                }
                index++;
                temp = temp.next;
            }
            return -1;
        }

        public static void main(String args[]){
            LL list = new LL();
            list.addLast(1);
            list.addLast(5);
            list.addLast(7);
            list.addLast(3);
            list.addLast(8);
            list.addLast(2);
            list.addLast(3);
            list.printList();

            int a = list.search(7);

            if (a == -1) {
                System.out.println("Element not found in the Linked List");
            }
            else
                System.out.println("Element found in the Linked List at "+ a);

            int b = list.search(4);

            if (b == -1) {
                System.out.println("Element not found in the Linked List");
            }
            else
                System.out.println("Element found in the Linked List at "+ a);
        }
    }