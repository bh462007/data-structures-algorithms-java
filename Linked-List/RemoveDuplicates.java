class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }
    
}
class Solution{
    public ListNode removeDuplicate(ListNode node){
        ListNode current=node;
        while(current!=null && current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }
            else{
                current=current.next;
            }
        }
        return node;
    }
}

class RemoveDuplicates{
    public static void main(String[] args) {
        ListNode node=new ListNode(1);
        node.next=new ListNode(1);
        node.next.next=new ListNode(2);
        node.next.next.next=new ListNode(3);
        node.next.next.next.next=new ListNode(4);
        node.next.next.next.next.next=new ListNode(4);

        Solution obj=new Solution();
        ListNode rd=obj.removeDuplicate(node);

        while(rd!=null){
            System.out.print(rd.val+" -> ");
            rd=rd.next;
        }
        System.out.print("null");
    }
}