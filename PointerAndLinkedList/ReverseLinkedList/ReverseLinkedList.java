package PointerAndLinkedList.ReverseLinkedList;

// 這是 LeetCode 提供的節點定義
class ListNode {
    // 節點的值
    int val;
    // 指向下一個節點的指標
    ListNode next;
    // 建構子，不帶參數
    ListNode() {}
    // 建構子，帶有值
    ListNode(int val) { this.val = val;}
    // 建構子，帶有值和下一個節點指標
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        // 建立測試資料: 1 -> 2 -> 3
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));

        // 呼叫反轉函式
        Solution sol = new Solution();
        ListNode reversedHead = sol.reverseList(head);

        // 印出結果
        while (reversedHead != null) {
            System.out.print(reversedHead.val + " ");
            reversedHead = reversedHead.next;
        }
    }
}

class Solution {
    public ListNode reverseList(ListNode head) {
        // 初始化前一個節點為 null，當前節點為 head
        ListNode prev = null;
        // 當前節點不為 null 時，持續反轉鏈結串列
        ListNode curr = head;

        // 迴圈反轉鏈結串列
        while (curr != null) {
            ListNode nextTemp = curr.next; // 先存下一個，不然會斷掉
            curr.next = prev;              // 反轉箭頭
            prev = curr;                   // prev 往後移
            curr = nextTemp;               // curr 往後移
        }

        return prev; // 當 curr 走到 null，prev 就是新的頭

    }
}