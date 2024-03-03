/*
 * Stack using LinkedList - FunnyCode
 * Đăng kí khoá Tổng Ôn DBI202 - WED201c chỉ 200k/cources
 */

import java.util.EmptyStackException;

public class Stack<E> {

    private ListNode top;
    private int length;

    private class ListNode {
        private E data; 
        private ListNode next; 

        public ListNode(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public Stack() {
        top = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void push(E data) {
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public E pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        E result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public E peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
}
