package leetCode.easy;

/**
 * @author wangbingyan
 * @date 2020/6/22
 * @desc 加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class PlusOne_1_12 {

    /**
     * 我的做法
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {
        int index = -1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                index = i;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (index >= 0) {
            digits[index] = digits[index] + 1;
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
    }

    /**
     * 官网做法
     * @param digits
     * @return
     */
    public static int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }

    public static void main(String[] args) {
        int[] ints = plusOne2(new int[]{1,9,9});
        for (int a : ints) {
            System.out.println(a);
        }
    }

}
