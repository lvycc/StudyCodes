package leetCode.easy;

/**
 * @author wangbingyan
 * @date 2020/5/26
 * @desc 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 *       不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 */
public class RemoveElement_1_6 {

    /**
     * 我的做法
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        if (nums.length < 1) {
            return 0;
        }
        int nowIndex = 0;
        int nextIndex = 0;
        while (nextIndex < nums.length) {
            if (nums[nextIndex] == val) {
                nextIndex++;
            } else {
                nums[nowIndex++] = nums[nextIndex++];
            }
        }
        return nowIndex;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 1, 2, 1, 2};
        System.out.println(removeElement(nums, 1));
        for (int a : nums) {
            System.out.print(a + "->");
        }
    }

}
