//给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
//
// 示例 1： 
//
// 输入: s1 = "abc", s2 = "bca"
//输出: true 
// 
//
// 示例 2： 
//
// 输入: s1 = "abc", s2 = "bad"
//输出: false
// 
//
// 说明： 
//
// 
// 0 <= len(s1) <= 100 
// 0 <= len(s2) <= 100 
// 
// Related Topics 哈希表 字符串 排序 
// 👍 36 👎 0

package leetcode.editor.cn;

//给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
class CheckPermutationLcci {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "abc";
        String s2 = "abd";
        boolean aa = solution.checkPermutation(s1, s2);
        System.out.println(aa);
    }

    /**
     * 处理逻辑
     * 1.s1倒叙遍历得到结果
     * 2.s1与s2比较
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public boolean checkPermutation(String s1, String s2) {
            StringBuilder stringBuilder = new StringBuilder(s1);
            String ss1 = stringBuilder.reverse().toString();  //字符串反转
            if (ss1.equals(s2)) {
                return true;
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}