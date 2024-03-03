/*
 * LinkedList - FunnyCode 
 * Đăng kí khoá Tổng Ôn DBI202 - WED201c chỉ 200k/cources
 */
class LinkedList<T>{
	Node head;

	public void insertLast(T data){
		Node<T> newNode=new Node<T>(data,null);
		if(head==null){
			head=newNode;
		}
		else{
			Node currentNode=head;
			while(currentNode.next!=null){
				currentNode=currentNode.next;
			}
			currentNode.next=newNode;
		}
		
	}

	public void insertFirst(T data){
		Node<T> newNode=new Node<T>(data,null);
		if(head==null){
			head=newNode;
		}
		else{
			newNode.next=head;
			head=newNode;
		}
	}

	public int size(){
		int size=0;
		Node currentNode=head;
		while(currentNode.next!=null){
			size++;
			currentNode=currentNode.next;
		}
		return ++size;
	}


	public void deleteLast(){
		Node currentNode=head;
		Node preNode=head;
		while(currentNode.next!=null){
				preNode=currentNode;
				currentNode=currentNode.next;
		}
		preNode.next=null;
	}

	public void deleteFirst(){
		head=head.next;
	}

	public void deleteAt(int index){
		Node currentNode=head;
		Node preNode=head;
		for(int i=0;i<index;i++){
			preNode=currentNode;
			currentNode=currentNode.next;

		}
		preNode.next=currentNode.next;

	}

	public boolean search(T value){
		Node currentNode=head;
		boolean isContains=false;
		while(currentNode.next!=null){
			if(currentNode.data==value){
				isContains=true;
				break;
			}
			else{
				isContains=false;
			}
			currentNode=currentNode.next;
		}
		if(currentNode.data==value){
				isContains=true;
			}
			else{
				isContains=false;
		}

		return isContains;
	}

	public void printList(){
		Node currentNode=head;
		System.out.println();
		System.out.print("[");
		while(currentNode.next!=null){
				System.out.print(currentNode.data+",");
				currentNode=currentNode.next;
		}
		System.out.print(currentNode.data+",");
		System.out.print("\b]");
	}



}