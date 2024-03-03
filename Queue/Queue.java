/*
 * Queue - FunnyCode
 * Đăng kí khoá Tổng Ôn DBI202 - WED201c chỉ 200k/cources
 */
import java.util.NoSuchElementException;

public class Queue<E> {

    private ListNode front;
    private ListNode rear;
    private int length;

    private class ListNode {
        private E data; 
        private ListNode next; 

        public ListNode(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        front = null;
        rear = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void enqueue(E data) {
        ListNode temp = new ListNode(data);
        if (isEmpty()) {
            front = temp;
        } else {
            rear.next = temp;
        }

        rear = temp;
        length++;
    }

    public E dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is already empty");
        }

        E result = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        length--;
        return result;
    }

    public void print() {
        if (isEmpty()) {
            return;
        }

        ListNode current = front;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
