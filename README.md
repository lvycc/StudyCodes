# StudyCodes
刷题以及学习代码
# 1. LeetCode简单题目
`注：代码类末尾的1_1代表对应的题目编号1.1`
## 1.1 最长公共前缀
* 我的做法
    * 遍历数组中第一个字符串的所有字符，并获取遍历索引处的字符
    * 每次循环中再对之后的数组进行遍历，并获取与第一个字符串相应位置的字符
    * 如果内层循环中有字符串长度超长了或者与外层循环获取的字符不同则结束循环
    * 截取第一个字符串到外层循环的索引位置即为最长公共前缀
* 耗时最短做法
    * 先假定第一个字符串为最长公共前缀
    * 遍历字符串数组，并在内层循环判断该字符串是否以假定的公共前缀开始
    * 如果不符合要求则截去该字符串的最后一位，剩余部分作为最长公共前缀继续进行比较
    * 直到全部循环结束或者字符串截取到长度为1都不能匹配
    * 此时的匹配字符串既是最长公共前缀
## 1.2 有效的括号
* 我的做法
    * 采用栈的数据结构进行括号的匹配，将字符串转成字符数组进行遍历
    * 如果是左括号则入栈，右括号则出栈并且判断出栈的字符是否与该右括号匹配
    * 如果出栈时栈为空或出栈括号不匹配则返回false，匹配则继续判断后续的字符
    * 最后栈为空则表示括号有效返回true，否则括号无效
* 耗时最短做法
    * 采用数组的方式进行括号的匹配，构造字符串长度的数组，将字符串转成字符数组进行遍历
    * 类似栈的操作，使用一个标记值作为数组的末尾索引（类似栈顶）
    * 如果是左括号则加入字符数组，右括号则判断该末尾的前一位置是否与之匹配
    * 如果数组越界或者索引前一位与该符号不匹配返回false，最后索引值为0表示括号有效
## 1.3 平方根
* 我的做法
    * 直接使用Math.sqrt()函数计算平方根，没什么技术含量
* 官方方法
    * 使用二分法进行查找计算平方根
## 1.4 合并两个有序链表
* 我的做法
    * 非递归实现合并两个有序链表，先判断特殊情况l1为空直接返回l2，否则返回l1
    * 判断l1和l2第一个节点中的最小的那个作为合并后链表的头节点
    * 当l1或l2不为空时进行循环遍历，遍历比较l1和l2的大小然后插入合并后的链表即可
* 官网做法
    * 采用递归实现合并两个有序链表，先判断特殊情况l1为空直接返回l2，否则返回l1
    * 判断l1和l2第一个节点中最小的那个作为合并后的头节点，并将该节点的指针下移开始递归
