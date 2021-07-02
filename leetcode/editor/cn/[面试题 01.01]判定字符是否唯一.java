//实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
//
// 示例 1： 
//
// 输入: s = "leetcode"
//输出: false 
// 
//
// 示例 2： 
//
// 输入: s = "abc"
//输出: true
// 
//
// 限制： 
// 
// 0 <= len(s) <= 100 
// 如果你不使用额外的数据结构，会很加分。 
// 
// Related Topics 位运算 哈希表 字符串 排序 
// 👍 127 👎 0
package leetcode.editor.cn;

//实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
class IsUniqueLcci {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String astr = "asdcqw";
        boolean aaa = solution.isUnique(astr);
        System.out.println(aaa);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public boolean isUnique(String astr) {
            for (int i = 0; i < astr.length(); i++) {
                for (int j = i + 1; j < astr.length(); j++) {
                    int a1 = astr.charAt(i);
                    int a2 = astr.charAt(j);
                    if (a1 == a2) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}