# LeetCode 104. Maximum Depth of Binary Tree

### 核心知識點 (Java)
1. **Recursion (遞迴)**: 
   - 函數呼叫自身來解決子問題。
   - 必須要有 **Base Case**，否則會發生 `StackOverflowError`。
2. **Math.max()**: 
   - Java 內建的工具類，用於取出兩數中的最大值。

### 解題策略
- **DFS (Depth First Search)**: 
    - 這種從上到下、深入到底再回傳的邏輯屬於「深度優先搜尋」。
- **時間複雜度**: $O(n)$，每個節點都會被訪問一次。
- **空間複雜度**: $O(h)$，h 為樹的高度（來自遞迴呼叫的 Stack 空間）。

### 為什麼這在後端很重要？
- **樹狀結構處理**: 無論是處理 JSON 物件導航、檔案系統路徑，還是資料庫中的「父子分類關係」，遞迴都是最直覺的寫法。