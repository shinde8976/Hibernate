public class Main {
    public static void main(String[] args) {
        LL list1 = new LL();
        list1.insertLast(1);
        list1.insertLast(2);
        list1.insertLast(40);


        LL list2 = new LL();
        list2.insertLast(30);
        list2.insertLast(56);
        list2.insertLast(70);

         LL ans = LL.merge(list1,list2);

        ans.display();


        System.out.println("Hello world!");
    }

    public int lengthCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                ListNode temp = slow;
                int length =0;

                do {
                    temp = temp.next;
                    length++;
                }while(temp!=slow);
                    return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head){
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!= null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                ListNode temp = slow;

                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                break;
            }
        }

        //Find the start Node
        ListNode f= head;
        ListNode s =head;

        while(length>0){
            s = s.next;
            length--;
        }

        //Keep Moving both forward and they will meet at cycle start
        while(f!=s){
            f = f.next;
            s= s.next;
        }
        return s;
    }

    public ListNode middleNode(ListNode Head){
        ListNode s= head;
        ListNode f = head;

        while(f!=null && f.next!=null){
            f= f.next.next;
            s = s.next;
        }
        return s;
    }

    public boolean isHappy(int n){
        int slow = n;
        int fast = n;

        do{
            slow = findsquare(slow);
            fast = findsquare(findsquare(fast));
        }while(slow!=fast);

        if(slow == 1){
            return true;
        }
        return false;
    }

    private int findsquare(int number){
        int ans = 0;
        while(number>0){
            int rem = number%10;
            ans += rem*rem;
            number /= 10;
        }
        return ans;
    }

    //Merge Sort
    public ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode mis = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2){

        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while(list1 != null && list2 !=null){
            if(list1.val <list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else{
                tail.next = list2;
                list2 = list2.next;
                tail =tail.next;
            }
        }

        tail.next = (list1!=null) ? list1:list2;
        return dummyHead.next;
    }

    ListNode getMid(ListNode head){
        ListNode midPrev = null;

        while(head!= null && head.next != null){
            midPrev = (midPrev == null)? head:midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x) {
            val = x;
            next = null;
        }
}