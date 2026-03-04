# LeetCode 704. Binary Search

### 核心知識點 (Java)
1. **防止整數溢位 (Overflow)**:
   - `int mid = (left + right) / 2;` 當 `left` 和 `right` 很大時會變負數。
   - 推薦寫法：`int mid = left + (right - left) / 2;`。
2. **邊界條件**:
   - `while (left <= right)`: 注意這裡有等號，因為當 `left == right` 時，那個元素還沒被檢查過。

### 解題策略
- **分治法 (Divide and Conquer)**: 每次排除掉一半的可能性。
- **時間複雜度**: $O(\log n)$。這比 $O(n)$ 快非常多，在 100 萬筆資料中，最多只需要比對 20 次。
- **空間複雜度**: $O(1)$。

### 為什麼這在 Spring Boot 很重要？
- **效能優化**: 當你在處理已排序的緩存數據、版本號比較、或是大範圍的分頁查詢優化時，二元搜尋的思想無處不在。