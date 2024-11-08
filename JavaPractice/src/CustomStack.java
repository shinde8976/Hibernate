public class CustomStack {
    protected  int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;
    public CustomStack(int size){
        this.data = new int[size];
    }

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack Is full");
            return false;
        }
        ptr++;
        data[ptr] =item;
        return true;
    }

    public int peek() throws Exception {
        if (isEmpty()){
            throw  new Exception("Cannot pop from an Empty stack");
        }
        return data[ptr];
    }
    public int pop() throws Exception {
        if (isEmpty()){
            throw  new Exception("Cannot pop from an Empty stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public boolean isFull(){
        return ptr == data.length -1; //ptr is at last index
    }

    public boolean isEmpty(){
        return ptr == -1;
    }
}
