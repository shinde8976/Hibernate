public class LL {


    private Node head;
    private Node tail;
    private int size;

    public void insert(int value, int index){
        if (index == 0){
            insertFirst(value);
            return;
        }
        if (index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);

        temp.next = node;
        size +=1;
    }

    public void removeDuplicates(){
        Node node = head;
        while (node.next!=null){

            if (node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public void insertLast(int value){

        if (tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;

        size +=1;


    }
    public void insertFirst(int val){
      Node node = new Node(val);
      node.next = head;
      head = node;

      if (tail == null){
          tail = head;
      }
      size +=1;
    }

    public LL() {
        this.size = 0;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value +" -> ");
            temp = temp.next;
        }
    }
    private class Node{

       private int value;

        private Node next;

       public Node(int value) {
           this.value = value;
       }
        public Node(int value, Node next) {
           this.value = value;
           this.next = next;
       }
   }
}
