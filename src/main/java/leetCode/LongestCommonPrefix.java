package leetCode;

/**
 * @author ycc
 * @date 2020/5/5
 * @desc 最长公共前缀
 */
public class LongestCommonPrefix {

    /**
     * 个人做法
     * @param strs
     * @return
     */
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        boolean end = false;
        String result = "";
        for (int i = 0; i < strs[0].length(); i++) {
            int flag = -1;
            for (String s : strs) {
                if (s.length() <= i) {
                    end = true;
                    break;
                }
                char c = s.charAt(i);
                if (flag == -1) {
                    flag = c - 'a';
                } else if (flag != c - 'a') {
                    end = true;
                    break;
                }
            }
            if (end) {
                result = strs[0].substring(0, i);
                break;
            }
            if (i == strs[0].length() - 1) {
                result = strs[0];
                break;
            }
        }
        return result;
    }

    /**
     * 运行最快做法
     * @param strs
     * @return
     */
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String reg = strs[0];
        for (String s : strs) {
            while (!s.startsWith(reg)) {
                if (reg.length() == 1) {
                    return "";
                }
                reg = reg.substring(0, reg.length() - 1);
            }
        }
        return reg;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix2(new String[]{"flower","flow","flight"}));
    }

}
