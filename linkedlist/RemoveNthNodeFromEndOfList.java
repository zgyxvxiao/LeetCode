package linkedlist;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode high = head;
        ListNode dummy = new ListNode(-1);
        ListNode prev = new ListNode(-1);
        dummy.next = head;
        ListNode low = dummy;
        int k = 1;
        while(high != null ){
            if(k!=n){
                high=high.next;
                k++;
            }else{
                prev = low;
                low = low.next;
                high = high.next;
            }
        }
        prev.next = prev.next.next;
        return dummy.next;

    }
}
