package leetCode;

/**
 * @author ycc
 * @date 2020/5/18
 * @desc 删除排序数组中的重复项
 */
public class RemoveDuplicates_1_5 {

    public static int removeDuplicates(int[] nums) {
        int nowIndex = 0;
        int nextIndex = 1;
        while (nextIndex < nums.length) {
            if (nums[nowIndex] == nums[nextIndex]) {
                nextIndex++;
            } else if (nums[nowIndex] < nums[nextIndex]) {
                nums[++nowIndex] = nums[nextIndex++];
            }
        }
        return nowIndex+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        for (int a : nums) {
            System.out.print(a);
            System.out.print(",");
        }
    }

}
