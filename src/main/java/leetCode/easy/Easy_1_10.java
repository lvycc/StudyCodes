package leetCode.easy;

/**
 * @author wangbingyan
 * @date 2020/6/19
 * @desc 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */
public class Easy_1_10 {

    /**
     * 双重循环，不推荐
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i];
            if (tmp > max) {
                max = tmp;
            }
            for (int j = i + 1; j < nums.length; j++) {
                tmp += nums[j];
                if (tmp > max) {
                    max = tmp;
                }
            }
        }
        return max;
    }

    /**
     * 动态规划实现
     * @param nums
     * @return
     */
    public static int maxSubArray2(int[] nums) {
        if (nums == null || nums.length < 1) {
            return -1;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int pre = 0;
        int ans = nums[0];
        for (int i = 0; i < nums.length; i++) {
            pre = Math.max(pre + nums[i], nums[i]);
            ans = Math.max(ans, pre);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-1, 0, -2}));
        System.out.println(maxSubArray2(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

}
