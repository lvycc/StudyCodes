package leetCode;

/**
 * @author ycc
 * @date 2020/5/9
 * @desc 平方根
 */
public class SquareRoot_1_3 {

    /**
     * 个人做法 直接使用Math工具类的求平方根函数
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        double sqrt = Math.sqrt(x);
        return (int) sqrt;
    }

    /**
     * 官方方式 二分法计算
     * @param x
     * @return
     */
    public static int mySqrt2(int x) {
        int l = 0, r = x, ans = -1;
        // 循环查找平方根，当最小数大于最大数时循环结束，ans的值即为平方根
        while (l <= r) {
            // 计算中间的数
            int mid = l + (r - l) / 2;

            if ((long)mid * mid <= x) {
                // 如果中间数的平方小于等于求解数，则将该中间数赋值给ans，并且左边最小的数为中间数加一
                ans = mid;
                l = mid + 1;
            } else {
                // 如果中间数的平方大于求解数，表示中间数过大，将最大数赋值为中间数减一
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt2(4));
    }

}
