package PointerAndLinkedList.LinkedListCycle;

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

public class LinkedListCycle {
    public static void main(String[] args) {
        // 建立一個有環的測試資料: 3 -> 2 -> 0 -> -4 -> (回到 2)
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // 形成環
        
        Solution sol = new Solution();
        System.out.println("Has Cycle: " + sol.hasCycle(head)); // 預期: true
    }
}

class Solution {
    public boolean hasCycle(ListNode head) {
        // 1. 基礎檢查：空串列或只有一個節點且沒環
        if (head == null || head.next == null) {
            return false;
        }

        // 2. 定義快慢指標
        ListNode slow = head;
        ListNode fast = head;

        // 3. 開始賽跑
        // 因為 fast 走得快，我們只需要檢查 fast 和 fast.next 是否為 null
        while (fast != null && fast.next != null) {
            slow = slow.next;           // 走一步
            fast = fast.next.next;      // 走兩步

            // 4. 如果相遇了，代表有環
            if (slow == fast) {
                return true;
            }
        }

        // 如果快指標跑到了盡頭，代表沒環
        return false;
    }
}