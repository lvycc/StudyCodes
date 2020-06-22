package leetCode.easy;

/**
 * @author wangbingyan
 * @date 2020/6/22
 * @desc 最后一个单词的长度
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 *
 * 如果不存在最后一个单词，请返回 0 。
 */
public class LengthOfLastWord_1_11 {

    /**
     * 我的做法
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        String[] arr = s.split(" ");
        if (arr.length < 1) {
            return 0;
        }
        return arr[arr.length - 1].length();
    }

    /**
     * 最快运行
     * @param s
     * @return
     */
    public static int lengthOfLastWord2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] chars = s.trim().toCharArray();
        int count = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord2("Hello World"));
    }

}
