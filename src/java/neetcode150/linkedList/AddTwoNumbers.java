package java.neetcode150.linkedList;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int num1 = 0;
        int num2 = 0;

        int count1 = 1;
        int count2 = 1;

        while(l1 != null) {
            num1 += l1.val * count1;
            count1 *= 10;
            l1 = l1.next;
        }

        while(l2 != null) {
            num1 += l2.val * count2;
            count2 *= 10;
            l2 = l2.next;
        }

        int num3 = num1 + num2;

        // Special case if the result is zero
        if (num3 == 0) {
            return new ListNode(0);
        }

        ListNode answer = null;
        ListNode current = null;

        while(num3 > 0) {
            int digit = num3 % 10;

            if(answer == null) {
                answer = new ListNode(digit);
                current = answer;
            } else {
                current.next = new ListNode(digit);
                current = current.next;
            }
            num3 /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        ListNode listA = new ListNode (2, new ListNode (4, new ListNode (3)));
        ListNode listB = new ListNode (5, new ListNode (6, new ListNode (4)));

        ListNode listC = new ListNode (9, new ListNode (9, new ListNode (9, new ListNode (9, new ListNode (9, new ListNode (9, new ListNode (9)))))));
        ListNode listD = new ListNode (9, new ListNode (9, new ListNode (9, new ListNode (9))));

        System.out.println(addTwoNumbers(listA, listB));
        System.out.println(addTwoNumbers(listC, listD));
    }
}
