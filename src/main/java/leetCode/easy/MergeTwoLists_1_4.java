package leetCode.easy;

import java.util.Objects;

/**
 * @author ycc
 * @date 2020/5/10
 * @desc 合并两个有序链表
 */
public class MergeTwoLists_1_4 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    /**
     * 个人做法，非递归
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (Objects.isNull(l1)) {
            return l2;
        }
        if (Objects.isNull(l2)) {
            return l1;
        }
        ListNode result = null;
        if (l1.val <= l2.val) {
            result = l1;
            l1 = l1.next;
        } else {
            result = l2;
            l2 = l2.next;
        }
        ListNode temp = result;

        while (l1 != null || l2 != null) {
            if (Objects.isNull(l1)) {
                temp.next = l2;
                break;
            }
            if (Objects.isNull(l2)) {
                temp.next = l1;
                break;
            }
            if (l1.val <= l2.val) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        return result;
    }

    /**
     * 官方做法，递归操作
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        if (Objects.isNull(l1)) {
            return l2;
        }
        if (Objects.isNull(l2)) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists2(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists2(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode listNode = mergeTwoLists2(l1, l2);
        while (listNode != null) {
            System.out.print(listNode.val + "->");
            listNode = listNode.next;
        }
    }

}
