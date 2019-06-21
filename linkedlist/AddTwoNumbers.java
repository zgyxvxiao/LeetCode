package linkedlist;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num = 0;
        int sum = 0;
        ListNode dummy = new ListNode(-1);
        ListNode l3 = new ListNode(-1);
        dummy.next = l3;
        while (l1 != null || l2 != null) {
            if (l1 == null) {
                sum = (l2.val + num);
            } else if (l2 == null) {
                System.out.println("111" + l1.val + num);
                sum = (l1.val + num);
            } else {
                sum = (l1.val + l2.val + num);
            }

            if ((sum) >= 10) {
                num = 1;
                l3.val = sum - 10;
            } else {
                l3.val = sum;
                num = 0;
            }


            if ((l1 != null))
                l1 = l1.next;
            if ((l2 != null))
                l2 = l2.next;
            if ((l1 != null || l2 != null)) {
                ListNode l4 = new ListNode(-1);
                l3.next = l4;
                l3 = l3.next;
            }
        }
        if (num == 1) {
            ListNode l4 = new ListNode(1);
            l3.next = l4;
            l3 = l3.next;
        }
        return dummy.next;
    }

}
