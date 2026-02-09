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
        // 建立測試資料
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        Solution sol = new Solution();
        ListNode result = sol.mergeTwoLists(l1, l2);

        // 印出結果
        while (result != null) {
            System.out.print(result.val + (result.next != null ? " -> " : ""));
            result = result.next;
        }
    }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 1. 建立 Dummy Node 和移動指標 curr
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        // 2. 當兩邊都還有節點時，進行比大小
        while (list1 != null && list2 != null) {
            // 比較兩個節點的值，將較小的節點接到 curr 後面，並移動對應的指標
            if (list1.val <= list2.val) {
                // list1 的值較小，接到 curr 後面，並移動 list1 的指標
                curr.next = list1;
                // 移動 list1 的指標到下一個節點
                list1 = list1.next;
            } else { // list2 的值較小，接到 curr 後面，並移動 list2 的指標
                // list2 的值較小，接到 curr 後面，並移動 list2 的指標
                curr.next = list2;
                // 移動 list2 的指標到下一個節點
                list2 = list2.next;
            }
            // 移動 curr 的指標到下一個節點
            curr = curr.next;
        }

        // 3. 處理剩下沒走完的那一串
        if (list1 != null) {
            // list1 還有剩，接到 curr 後面
            curr.next = list1;
        } else { // list2 還有剩，接到 curr 後面
            // list2 還有剩，接到 curr 後面
            curr.next = list2;
        }

        // 4. 回傳 dummy.next (真正的頭部節點)
        return dummy.next;
    }
}