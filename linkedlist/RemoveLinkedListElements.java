package linkedlist;


public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next =  head;
        head = dummy;
        while(head != null && head.next != null){
            if(head.next.val == val){
                head.next = head.next.next;
            }else{
                head =  head.next;
            }
        }
        return dummy.next;

    }

    public static void main(String[] args) {
	// write your code here
    }
}
