# LeetCode 217. Contains Duplicate

### 核心知識點 (Java)
1. **HashSet**:
   - `add(value)`: 加入元素。如果元素已存在，會回傳 `false`。
   - `contains(value)`: 檢查元素是否存在。
2. **For-each 迴圈**: `for (int num : nums)` 這是 Java 遍歷陣列最簡潔的寫法。

### 解題策略
- **方法一：Hash Set ($O(n)$)** - 最推薦。利用空間換取時間，只遍歷一次陣列。
- **方法二：排序法 ($O(n \log n)$)** - 先將陣列排序，再檢查相鄰元素是否相同。優點是空間複雜度 $O(1)$。

### 思考題
在 Java 中，如果你使用 `set.add(num)`，這個方法本身會回傳一個 `boolean`。你能試著利用這個特性把 `if` 判斷寫得更精簡嗎？