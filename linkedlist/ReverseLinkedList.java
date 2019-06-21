package linkedlist;


public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode newHead = dummy;
        while (head != null) {
            ListNode node = new ListNode(head.val);
            node.next = newHead.next;
            newHead.next = node;
            head = head.next;
        }
        return dummy.next;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }


    public static void main(String[] args) {
        // write your code here
    }
}
