package leetCode.easy;

/**
 * @author wangbingyan
 * @date 2020/6/23
 * @desc 删除排序链表中的重复元素
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 */
public class Easy_1_15 {

    public static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) { val = x; }
   }

    /**
     * 我的做法，非递归实现
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode now = head;
        ListNode next = head;
        // 标记是否替换指针
        boolean flag = false;
        while (next != null) {
            if (now.val == next.val) {
                flag = true;
            } else {
                if (flag) {
                    // 替换指针
                    now.next = next;
                }
                now = next;
                flag = false;
            }
            next = next.next;
        }
        if (flag) {
            now.next = next;
        }
        return head;
    }

    /**
     * 官网做法，递归实现
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 递归获得当前节点的下一节点
        head.next = deleteDuplicates2(head.next);
        // 判断当前节点和下一节点的值是否相同，如果相同则将下一节点作为当前节点
        if (head.val == head.next.val) {
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
//        head = deleteDuplicates(head);
        head = deleteDuplicates2(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

}
