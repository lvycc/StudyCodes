package leetCode.easy;

/**
 * @author wangbingyan
 * @date 2020/6/3
 * @desc 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。前五项如下：
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 */
public class Easy_1_9 {

    /**
     * 我的做法
     * @param n
     * @return
     */
    public static String countAndSay(int n) {
        String str = "1";
        for (int i = 1; i < n; i++) {
            int num = 1;
            char temp = str.charAt(0);
            StringBuilder builder = new StringBuilder();
            for (int j = 1; j < str.length(); j++) {
                if (temp == str.charAt(j)) {
                    num++;
                } else {
                    builder.append(num)
                            .append(temp);
                    num = 1;
                    temp = str.charAt(j);
                }
            }
            builder.append(num)
                    .append(temp);
            str = builder.toString();
        }
        return str;
    }

    /**
     * 官网递归做法
     * @param n
     * @return
     */
    public static String countAndSay2(int n) {
        if (n == 1) {
            return "1";
        }
        String str = countAndSay2(n - 1);
        StringBuilder builder = new StringBuilder();
        int num = 1;
        char temp = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (temp == ch) {
                num++;
            } else {
                builder.append(num)
                        .append(temp);
                num = 1;
                temp = ch;
            }
        }
        builder.append(num)
                .append(temp);
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay2(5));
    }

}
