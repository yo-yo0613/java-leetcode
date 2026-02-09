# LeetCode 021. Merge Two Sorted Lists

### 核心知識點 (Java)
1. **Dummy Node (虛擬節點)**:
   - 用於解決「回傳頭節點」的問題。
   - 避免在迴圈內頻繁檢查 `if (head == null)` 的繁瑣邏輯。
2. **Short-circuit (短路邏輯)**:
   - 最後的 `curr.next = (list1 != null) ? list1 : list2;` 可以直接把剩下的一整串接過來。

### 解題策略
- **迭代法 (Iterative)**: 
    - 像拉拉鍊一樣一個一個比對。
    - 時間複雜度: $O(n + m)$，n 和 m 分別為兩條鏈結串列的長度。
    - 空間複雜度: $O(1)$。
- **遞迴法 (Recursive)**: 
    - 代碼更精簡，但要注意 Stack Overflow。

### 常見陷阱
- **指標遺失**: 忘了移動 `curr = curr.next` 導致原地打轉。
- **邊界問題**: 其中一個 list 為空時的處理。