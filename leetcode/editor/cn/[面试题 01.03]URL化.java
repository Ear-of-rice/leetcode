//URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，
//请使用字符数组实现，以便直接在数组上操作。） 
//
// 
//
// 示例 1： 
//
// 
//输入："Mr John Smith    ", 13
//输出："Mr%20John%20Smith"
// 
//
// 示例 2： 
//
// 
//输入："               ", 5
//输出："%20%20%20%20%20"
// 
//
// 
//
// 提示： 
//
// 
// 字符串长度在 [0, 500000] 范围内。 
// 
// Related Topics 字符串 
// 👍 44 👎 0

//2021-07-02 14:01:57
package leetcode.editor.cn;

import com.sun.deploy.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

class StringToUrlLcci {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Mr John Smith   ";
        int length = 13;
        String result = solution.replaceSpaces(s, length);
        System.out.println(result);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    static class Solution {
        public String replaceSpaces(String s1, int length) {
//            String one = s1.substring(0, length);  取所需要的长度
//            String two = one.replace(" ", "%20");  将制定内容替换
            return s1.substring(0, length).replaceAll(" ", "%20");
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}