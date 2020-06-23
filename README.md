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
## 1.5 删除排序数组中的重复项
* 我的做法
    * 使用两个快慢指针，一个标记去除重复数据后当前数组的下标，一个标记数组下一遍历位置的下标
    * 当快指针数据与慢指针数据相同时快指针+1
    * 当两者指针数据不相同时慢指针+1并且将快指针的结果赋值给慢指针，快指针+1
    * 当快指针遍历完数组时结束循环
* 官网做法，与之类似
## 1.6 删除数组中的指定元素
* 我的做法
    * 采用数组下标双标记的方式，一个标记进行判断数组下标位置的元素是否为要删除的元素
    * 如果为要删除的元素则判断标记+1，新数组长度标记不动
    * 如果判断标记的元素不是要删除的元素，则新数组长度标记的值为判断标记元素的值，两个标记都+1
    * 当判断标记大于等于数组长度时结束循环
## 1.7 实现字符串查找
* 我的做法
    * 确定外层for循环长度是源字符串长度-匹配字符串长度
    * 先确定外层for循环与源字符串第一个字符匹配的位置
    * 再对匹配字符串进行循环，判断是否一一匹配，若全部匹配则返回当前遍历源字符串的位置
    * 否则继续进行循环，循环结束返回-1
* 官网最快
    * 使用String类的indexOf()方法
## 1.8 搜索插入位置
* 我的做法
    * 采用二分查找的思想，low=0，high=nums.length-1当low<high时进行循环
    * 每次循环计算low和high的平均值mid处元素的位置进行比较
    * 如果mid处元素与目标值相等则直接返回mid，小于目标值则high=mid-1，大于目标值low=mid+1
    * 如果没有查询到则返回low的值既是要插入的位置
* 官网做法，同理也是二分查找
## 1.9 外观数列
* 我的做法
    * 设置初始值字符串为1，然后从1到n开始遍历，循环中再遍历初始字符串
    * 遍历字符串中依次取字符串的值与最初的值比较，如果相同的计数+1
    * 不同则按照该数字计数和该数字的顺序写入新的字符串，并将初始值设置为当前值计数设置为1继续循环
    * 字符串遍历完毕将初始字符串赋值为当前新的字符串继续循环
* 官网1ms做法
    * 采用递归和一个for循环的做法
    * 当n==1的时候返回字符串1，否则将n-1进行递归
    * 递归完成后进行循环遍历字符串，遍历方式同上
## 1.10 最大子序和
* 我的做法
    * 暴力遍历的方式，两层for循环，第一层for循环遍历整个数组
    * 第二层for循环遍历第一层循环位置之后的所有连续数组，并比较最大值
    * 如果发现最大值则进行替换，继续遍历直到循环结束
* 官网做法（动态规划法）
    * 定义两个变量，一个表示最大连续序列和ans，一个表示当前元素前连续序列和pre
    * 一次遍历整个数组，pre取pre+当前遍历元素和当前遍历元素的最大值
    * 再和ans（ans存储上个元素的最大连续序列和）进行比较，取最大值作为ans直到循环结束
## 1.11 最后一个单词的长度
* 我的做法
    * 将字符串以空格split进行拆分，然后得到字符串数组
    * 取数组最后一个元素计算其长度
* 官网最快
    * 将字符串前后的空格去除然后转成字符数组
    * 对字符数组从后向前遍历，遇到空格则退出循环，否则计数+1
## 1.12 加一
* 我的做法
    * 定义一个数组下标标记值为-1，倒序遍历数组找到第一个小于9的数字的下标，如果数字大于等于9则置位0
    * 如果数组下标标记大于等于0则修改该处的值为原始值加1，返回该数组
    * 新建数组长度为原始数组长度+1，并设置第一个元素为1，返回该数组
* 官网做法，思路类似，但是官网做法代码更优美
    * 倒序遍历数组，对遍历的元素+1然后再对其进行10的取模，如果取模不为0则结束遍历返回数组
    * 如果取模为0则继续遍历，如果遍历完数组都没返回则新建数组长度为原始数组长度+1，并设置第一个元素为1，返回新数组
## 1.13 二进制求和
* 我的做法
    * 倒序遍历两个字符串，如果短的字符串遍历完则补0继续遍历直到两个字符串都遍历完毕
    * 遍历的两个字符串对位相加，并且加上进位变量的值，得到的结果如果大于1则表示需要继续进位
    * 当前位置保留为对位相加结果-2，进位值为1，对位相加不大于1则直接保留到当前位置
    * 使用StringBuilder保存为字符串，最后反转即得到最终结果
## 1.14 爬楼梯
* 官网做法
    * 动态规划实现，观察可发现n>2时所有的爬楼梯方式为前一个和前两个的和
    * 从1开始到n遍历，根据上述规律即可得到结果
