package java.neetcode150.linkedList;

public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode (3, new ListNode (2, new ListNode (0, new ListNode (-4))));
        ListNode head2 = new ListNode (1, new ListNode (2));

        System.out.println(hasCycle(head1));  // returns true
        System.out.println(hasCycle(head2));  // returns true
    }
}
