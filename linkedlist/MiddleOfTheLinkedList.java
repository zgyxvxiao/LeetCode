package linkedlist;


public class MiddleOfTheLinkedList {

    class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode dummy1 = new ListNode(-1);
            ListNode dummy2 = new ListNode(-1);

            ListNode head1 = dummy1;
            ListNode head2 = dummy2;
            ListNode head3 = head;
            int n = 0;
            while(true){
                n++;
                for (int i = 0; i < n*2; i++) {
                    head2.next = head;
                    if(head != null){
                        head = head.next;
                    }else{
                        break;
                    }

                }
                if(head2 != null && head3!=null){
                    head1.next = head3;
                    head3 = head3.next;
                }else{
                    break;
                }
            }
            return head1;
        }
    public static void main(String[] args) {
	// write your code here
    }
}
