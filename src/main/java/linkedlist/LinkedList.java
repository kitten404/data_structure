package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public void setHead(Node head) {
        this.head = head;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void print() {
        Node temp = head;
        while (temp!= null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        var node = new Node(value);
        if(length == 0) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
        length++;
    }

    public Node removeLast() {
        if(length == 0) {
            return null;
        }
        Node temp = head;
        Node pre = head;
        while(temp.next != null) {
            pre = temp;
            temp = temp.next;
        }
        tail = pre;
        tail.next = null;
        length--;
        if(length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if(length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        length++;
    }

    public Node removeFirst() {
        if(length == 0) {
           return null;
        }
        var removedElem = head;
        head = head.next;
        length--;

        if(length == 0) {
            tail = null;
        }
        return removedElem;
    }

    public Node get(int index) {
        if(index < 0 || index >= length) {
            return null;
        }
        var temp = head;
        for(int i = 0; i< index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        var temp = get(index);
        if(temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index > length) {
            return false;
        }
        if(index == 0) {
            prepend(value);
            return true;
        }

        if(index == length) {
            append(value);
            return true;
        }
        var node = new Node(value);
        var temp = get(index - 1);
        node.next = temp.next;
        temp.next = node;
        length++;
        return true;
    }

    public Node remove(int index) {
        if(index < 0 || index >= length) {
            return null;
        }

        if(index == 0) {
            return removeFirst();
        }

        if(index == length - 1) {
            return removeLast();
        }

        var prev = get(index - 1);
        var temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length --;

        return temp;
    }

    public void reverse() {
        var temp = head;
        head = tail;
        tail = temp;
        var after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
