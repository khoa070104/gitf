/*
 * Node - FunnyCode
 */
class Node<T>{
	Node next;
	T data;

	Node(T data,Node next){
		this.data=data;
		this.next=next;
	}
}