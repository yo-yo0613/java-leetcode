package PointerAndLinkedList.MergeTwoSortedLists;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1. 建立 Dummy Node 和移動指標 curr
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // 2. 
        return dummy.next;
    }
}