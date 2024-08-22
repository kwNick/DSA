class Node {
    int data;         // Data stored in the node
    Node next;        // Reference to the next node in the linked list
    // Constructor
    public Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }
    // Constructor
    public Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}
public class Main {
    // Function to print the linked list
    public static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    // Function to insert a new node at the head of the linked list
    public static Node insertHead(Node head, int val) { //O(1) time complexity
        Node temp = new Node(val, head);
        return temp;
    }

    //Function to delete a node at the tail of the linked list, only using a head Node
    public static Node deleteTail(Node head){
        // Check if the linked list is empty or has only one node
        if (head == null || head.next == null)
            return null;
        // Create a temporary pointer for traversal
        Node temp = head;
        // Traverse the list until the second-to-last node
        while (temp.next.next != null) {
            temp = temp.next;
        }
        // Nullify the connection from the second-to-last node to delete the last node
        temp.next = null;
        // Return the updated head of the linked list
        return head;
    }

    //function to delete a node NOT at the tail of the linked list and linkedList.length > 1
    public void deleteNode(Node node) { //O(1) time complexity
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static int lengthOfList(Node head){ //O(N) time complexity
        int cnt = 0;
        Node tmp = head;
        while(tmp != null){
            head = tmp.next;
            cnt++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        // Sample array and value for insertion
        List<Integer> arr = Arrays.asList(12, 8, 5, 7);
        int val = 100;

        // Creating a linked list with initial elements from the array
        Node head = new Node(arr.get(0));
        head.next = new Node(arr.get(1));
        head.next.next = new Node(arr.get(2));
        head.next.next.next = new Node(arr.get(3));

        // Inserting a new node at the head of the linked list
        head = insertHead(head, val);

        // Delete the tail of the linked list
        head = deleteTail(head);

        // Print the length of the linked list
        System.out.println(lengthofList(head));
        
        // Printing the linked list
        printLL(head);
    }
}