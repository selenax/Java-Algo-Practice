package linkedlist;

class Node<T> {

    T data; // element in the list
    Node<T> next; // link to next node

    Node(T data) {
        this.data = data;
    }

    Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }
}

