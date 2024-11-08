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

    //Merge two linked List\
    public static LL merge(LL first, LL second){
        Node f = first.head;
        Node s = second.head;

        LL ans = new LL();

        while (f!= null && s!=null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }else{
                ans.insertLast(s.value);
                s= s.next;
            }

        }
        while (f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

  public void insertRec(int val, int index){
        head = insertRec(val, index, head);
  }

  private Node insertRec(int val, int index, Node node) {
	  if(index == 0) {
		  Node temp = new Node(val,node);
		  size++;
		  return temp;
	  }
	  node.next = insertRec(val, index -1, node.next);
      return node;
  }

  public void duplicates(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
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
