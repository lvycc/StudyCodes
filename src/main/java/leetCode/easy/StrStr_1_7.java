package leetCode.easy;

/**
 * @author wangbingyan
 * @date 2020/5/28
 * @desc 实现 strStr() 函数
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */
public class StrStr_1_7 {

    /**
     * 我的做法
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        }
        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        int max = haystackArray.length - needleArray.length;
        for (int i = 0; i <= max; i++) {
            while (i <= max && haystackArray[i] != needleArray[0]) {
                i++;
            }
            if (i <= max) {
                for (int j = 0; j < needleArray.length; j++) {
                    if (haystackArray[i + j] == needleArray[j]) {
                        if (j == needleArray.length - 1) {
                            return i;
                        }
                        continue;
                    } else {
                        break;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "a"));
    }

}
