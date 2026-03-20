
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val=val;
        this.next=null;
    }
}
class Solution{
    public ListNode detectCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode p1=head;
                ListNode p2=slow; //or ListNode p2=fast; either way it works
                while(p1!=p2){
                    p1=p1.next;
                    p2=p2.next;

                }
                return p1;
            }
        }
        return null;
    }
}
class LinkedListCycleII{
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);

        // create cycle: last node points to node with value 2
        head.next.next.next.next = head.next;

        Solution obj = new Solution();
        ListNode result = obj.detectCycle(head);

        if(result != null) {
            System.out.println("Cycle starts at: " + result.val);
        } else {
            System.out.println("No cycle");
        }
    }
}