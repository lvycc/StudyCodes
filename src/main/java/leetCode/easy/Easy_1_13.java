package leetCode.easy;

/**
 * @author wangbingyan
 * @date 2020/6/22
 * @desc 二进制求和
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */
public class Easy_1_13 {

    /**
     * 我的做法，对位相加
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {
        int aIdx = a.length() - 1;
        int bIdx = b.length() - 1;
        StringBuilder builder = new StringBuilder();
        int upFlag = 0;
        while (aIdx >= 0 || bIdx >= 0) {
            int tmp = (aIdx < 0 ? 0 : a.charAt(aIdx) - '0')
                    + (bIdx < 0 ? 0 : b.charAt(bIdx) - '0')
                    + upFlag;
            if (tmp > 1) {
                builder.append(tmp - 2);
                upFlag = 1;
            } else {
                builder.append(tmp);
                upFlag = 0;
            }
            aIdx--;
            bIdx--;
        }
        if (upFlag > 0) {
            builder.append(1);
        }
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

}
