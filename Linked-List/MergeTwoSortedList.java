class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(-1);
        ListNode current=dummy;

        while(list1!=null && list2!=null){
            if(list1.val < list2.val)
            {
                current.next=list1;
                list1=list1.next;
                current=current.next;
            }
            else{
                current.next=list2;
                list2=list2.next;
                current=current.next;
            }
        }

        // if(list1!=null ){
        //     current.next=list1;
        // }
        // else{
        //     current.next=list2;
        // }
        current.next=(list1!=null)?list1:list2;

        return dummy.next;
    }
}

public class MergeTwoSortedList {
    public static void main(String[] args) {

        // create list1: 1 -> 2 -> 4
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // create list2: 1 -> 3 -> 4
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        Solution obj = new Solution();
        ListNode result = obj.mergeTwoLists(list1, list2);

        // print result
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}