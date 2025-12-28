public class Day1{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next =null;
        }
    }
    public static void main(String[] args) {
         Node firstNode = new Node(5);
         Node secondNode = new Node(10);
         Node thirdNode = new Node(15);
         Node fourtNode = new Node(20);
         firstNode.next = secondNode;
         secondNode.next = thirdNode;
         thirdNode.next = fourtNode;
         Node currNode = firstNode;
         while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
         }
         System.out.println("null");
    }
}