## [剑指 Offer 21. 调整数组顺序使奇数位于偶数前面](https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/)

#### 解法1

  使用两个指针分别指向第一个元素和最后一个元素，然后两个指针分别中间遍历。

````java
class Solution21_01 {
    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int head = 0, butt = nums.length - 1;
        while (head < butt) {
            if (nums[head] % 2 != 0) {
                //是奇数的话，就不动了
                head++;
                continue;
            } else {
                //是偶数才进入循环
                while (nums[butt] % 2 == 0 && butt != head) {
                    //如果是奇数的话准备交换，否则就继续往前
                    butt--;
                }
                if (butt == head) {
                    break;
                } else {
                    int temp = nums[head];
                    nums[head] = nums[butt];
                    nums[butt] = temp;
                    head++;
                    butt--;
                }
            }
        }
        return nums;
    }
}
````

