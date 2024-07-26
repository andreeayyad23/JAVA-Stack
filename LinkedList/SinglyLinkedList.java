public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList(){
        this.head = null;
    }

    public void add(int value){
        Node newNode = new Node(value);
        if (head == null || head.value >= newNode.value) {
            newNode.next = head;
            head = newNode;
    } else {
        Node current = head;
        while (current.next != null && current.next.value < newNode.value) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    }

    public void displayData(){
        if (head == null) {
            System.out.println("The is NULL!!");
        }else{
            
            Node current = head;
            while (current!= null) {
                System.out.print(current.value + "->");
                current = current.next;
            }
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(20);
        
        list.displayData();
    }
}