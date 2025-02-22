package javaPrep.neetcode150.linkedList;

public class MergeTwoSortedLists {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode listA = new ListNode (1, new ListNode (2, new ListNode (4)));
        ListNode listB = new ListNode (1, new ListNode (3, new ListNode (4)));

        System.out.println (mergeTwoLists(listA, listB));
    }

}