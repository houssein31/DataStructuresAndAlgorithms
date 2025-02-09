package java.neetcode150.linkedList;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while(head != null) {
            ListNode nextNode = head.next;
            head.next = prev;
            prev = head;
            head = nextNode;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode (1, new ListNode (2, new ListNode (3, new ListNode (4, new ListNode (5)))));

        ListNode node1 = new ListNode (1);
        ListNode node2 = new ListNode (2);
        ListNode node3 = new ListNode (3);
        ListNode node4 = new ListNode (4);
        ListNode node5 = new ListNode (5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        System.out.println (reverseList ( list1 ));
    }

}

