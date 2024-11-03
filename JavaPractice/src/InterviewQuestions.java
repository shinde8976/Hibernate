public class InterviewQuestions {

    public boolean hasCycle(LL head){
        LL fast = head;
        LL slow = head;

        while (fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                return true;
            }
        }
        return false;
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
