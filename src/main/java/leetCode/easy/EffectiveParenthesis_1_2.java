package leetCode.easy;

import java.util.Stack;

/**
 * @author ycc
 * @date 2020/5/6
 * @desc 有效的括号
 */
public class EffectiveParenthesis_1_2 {

    /**
     * 我的做法
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) {
                    return false;
                }
                if (c == ')' && stack.pop() != '(') {
                    return false;
                } else if (c == ']' && stack.pop() != '[') {
                    return false;
                } else if (c == '}' && stack.pop() != '{') {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    /**
     * 运行最快
     * @param s
     * @return
     */
    public static boolean isValid2(String s) {
        char[] chars = s.toCharArray();
        if (chars.length % 2 != 0) {
            return false;
        }
        int count = 0;
        char[] check = new char[chars.length];
        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                check[count++] = c;
            } else {
                if (count == 0) {
                    return false;
                }
                if (c == ')' && check[count - 1] == '(') {
                    count--;
                } else if (c == ']' && check[count - 1] == '[') {
                    count--;
                } else if (c == '}' && check[count - 1] == '{') {
                    count--;
                }
            }
        }
        if (count != 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("([])"));
        System.out.println(isValid2("}([)"));
    }

}
