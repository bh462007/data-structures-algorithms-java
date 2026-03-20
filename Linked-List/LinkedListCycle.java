
//Fast & Slow Pointer (Floyd’s Cycle Detection)

/*
Used in:

-Cycle detection
-Finding middle
-Finding cycle start (LeetCode 142)
*/

class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val=val;
        this.next=null;
    }
}
class Solution{
    public boolean hasCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
}
class LinkedListCycle{
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // create cycle: last node points to node with value 2
        head.next.next.next.next = head.next;

        Solution obj = new Solution();
        boolean result = obj.hasCycle(head);

        System.out.println(result);
    }
}