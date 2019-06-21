package linkedlist;

import java.util.LinkedList;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy =  new ListNode(-1);
        if(head != null && head.next != null){
            dummy.next = head.next;
        }else{
            return null;
        }

        while(head != null && head.next != null){
            ListNode tmp = head.next.next;
            head.next.next = head;
            head.next = tmp;
            head = tmp;
        }
        return dummy.next;
    }
}
