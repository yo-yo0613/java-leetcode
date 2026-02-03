# LeetCode 125. Valid Palindrome

### 核心知識點 (Java)
1. **Character 類別**: 
   - 提供豐富的靜態方法處理 `char`，如 `isLetterOrDigit`, `toLowerCase` 等。
2. **String.charAt(i)**: 
   - Java 字串無法使用 `s[i]` 訪問，必須使用這個方法。
3. **雙指標法 (Two Pointers)**:
   - 空間複雜度 $O(1)$：不需要額外建立過濾後的字串。
   - 時間複雜度 $O(n)$：只需遍歷一次字串。

### 常見陷阱
- **String 不可變性**: 不要嘗試在迴圈內頻繁做字串拼接（`s += ...`），那會產生大量垃圾物件，影響效能。
- **邊界檢查**: `left < right` 是迴圈停止的條件。