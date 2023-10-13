package chapter14.collection_;

public class LinkedList01 {
    public static void main(String[] args) {
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node rose = new Node("rose");

        jack.next = tom;
        tom.next = rose;

        rose.pre = tom;
        tom.pre = jack;

        Node first = jack; //头节点
        Node last = rose; //尾节点

        while (true){
            if(first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

    }
}
class Node{
    public Object item;
    public Node next;
    public Node pre;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "node name = " + item;
    }
}