class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p1=headA;
        ListNode p2=headB;
        while(p1 != p2) {
            p1 = (p1 == null) ? headB : p1.next;
            p2 = (p2 == null) ? headA : p2.next;
        }
        return p1;
    }
}

public class IntersectionOfLinkedList {
    public static void main(String[] args) {

        // Common part: 8 -> 4 -> 5
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // List A: 4 -> 1 -> [8 -> 4 -> 5]
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // List B: 5 -> 6 -> 1 -> [8 -> 4 -> 5]
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        Solution obj = new Solution();
        ListNode result = obj.getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection at: " + result.val);
        } else {
            System.out.println("No intersection");
        }
    }
}