class LL{
	Node tail;
	Node head;
	int size;
	public LL(){
		this.size = 0;
	}

	void addAtStart(int val){
		Node n = new Node(val);
		n.next = head;
		head = n;
		if(tail== null){
			tail =head;
		}
		size++;
	}
	void addAtEnd(int val){
		Node n = new Node(val);
		tail.next = n;
		tail = n;
		if(tail==null){
			addAtStart(val);
		}
		size++;
	}

	void addAtIndex(int val,int index){
		if(index==0){
			addAtStart(val);
			return;
		}
		if(index==size){
			addAtEnd(val);
			return;
		}
		Node temp = head;
		for(int i = 1;i<index ;i++){
			temp = temp.next;
		}
		Node n = new Node(val , temp.next);
		temp.next = n;
		size++;

	}

	void displayList(){
		Node temp = head;
		while(temp!=null){
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.println("End");
	}
	int deleteAtStart(){
		int val = head.val;
		head = head.next;
		if(head==null){
			tail = null;
		}
		size--;
		return val;
		
	}
	int deleteAtEnd(){
		if(size<=1){
			return deleteAtStart();
		}
		Node secondLast = get(size-2);
		int val = tail.val;
		tail = secondLast;
		tail.next = null;
		return val;

	}
	int deleteAtIndex(int index){
		if(index==0){
			return deleteAtStart();
		}
		if(index==size){
			return deleteAtEnd();
		}
		Node prev  = get(index-1);
		int val = prev.next.val;
		prev.next = prev.next.next;
		return val;
	}
	Node get(int index){
		Node node = head;
		for(int i = 0 ; i<index ; i++){
			node = node.next;
		}
		return node;
	}
	Node search(int value){
		Node node = head; 
		while(node!=null){
			if(node.val == value){
				return node;
			}
			node= node.next;
		}
		return null;
	}
	class Node{
		int val ; 
		Node next;
		Node(int val){
			this.val = val;			
		}
		Node(int val ,Node next){
			this.val = val;
			this.next = next;
		}
	}
}
class Client{
	public static void main(String[] args){
	LL list = new LL();
	list.addAtStart(20);
	list.addAtStart(40);
	list.addAtStart(30);
	list.addAtEnd(40);
	list.addAtIndex(60,2);
	System.out.println(list.size);
	list.displayList();
	/*System.out.println(list.deleteAtStart());
	list.displayList();
	System.out.println(list.deleteAtEnd());
	list.displayList();
	System.out.println(list.deleteAtIndex(2));
	list.displayList();*/
	System.out.println(list.search(20));
}}

