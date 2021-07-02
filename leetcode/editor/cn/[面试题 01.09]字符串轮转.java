//字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。 
//
// 示例1: 
//
//  输入：s1 = "waterbottle", s2 = "erbottlewat"
// 输出：True
// 
//
// 示例2: 
//
//  输入：s1 = "aa", s2 = "aba"
// 输出：False
// 
//
// 
// 
//
// 提示： 
//
// 
// 字符串长度在[0, 100000]范围内。 
// 
//
// 说明: 
//
// 
// 你能只调用一次检查子串的方法吗？ 
// 
// Related Topics 字符串 字符串匹配 
// 👍 75 👎 0

//2021-07-02 15:45:24
package leetcode.editor.cn;

//s1 = "waterbottle", s2 = "erbottlewat"
class StringRotationLcci {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        boolean result = solution.isFlipedString(s1, s2);
        System.out.println(result);
    }

    /**
     * 解决思路
     * 1.首先判断两个长度是否一样
     * 2.长度相等时，若s2是s1旋转而成的，那么把s2和自身拼接一次，s1就会出现在其中
     * "erbottlewat" + "erbottlewat" = erbottle waterbottle wat
     * 如果s2不是s1旋转而成的，那么那么把s2和自身拼接一次，s1就肯定不会出现在其中
     */
    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public boolean isFlipedString(String s1, String s2) {
            if (s1.length() != s2.length()) return false;
//            return (s2 + s2).indexOf(s1) != -1;   //方式1   返回指定字符在字符串中第一次出现处的索引，如果此字符串中没有这样的字符，则返回 -1。
            return (s2 + s2).contains(s1);           //方式2   判断字符串str中是否有子字符串。如果有则返回true，如果没有则返回false
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}