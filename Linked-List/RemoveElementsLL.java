class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        ListNode current=dummy;
        while(current.next!=null){
            if(current.next.val==val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return dummy.next;
    }
}

public class RemoveElementsLL {
    public static void main(String[] args) {

        // 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int val = 6;

        Solution obj = new Solution();
        ListNode result = obj.removeElements(head, val);

        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}