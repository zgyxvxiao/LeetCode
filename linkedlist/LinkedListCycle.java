package linkedlist;


public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (slow != null && fast != null){
            fast = fast.next;
            if(fast != null){
                slow = slow.next;
                fast = fast.next;
                if(slow == fast){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
	// write your code here
    }
}
