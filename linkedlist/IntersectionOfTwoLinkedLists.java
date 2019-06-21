package linkedlist;


public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while (headA != null){
            while(headB != null){
                if(headA != headB){
                    headB = headB.next;
                }else{
                    return headA;
                }

            }
            headA = headA.next;
        }
        return headA;
    }
    public static void main(String[] args) {
	// write your code here
    }
}
