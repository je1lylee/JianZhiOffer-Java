## 剑指 Offer 03. 数组中重复的数字

#### 解法01-双循环

​		只需要嵌套两层循环即可。需要注意的是内层循环的角标需要比外层循环+1。缺点是这种解法需要`2739ms`才能完成计算，需要的时间较长。

````java
class Solution03_01 {
    public int findRepeatNumber(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]) return nums[i];
            }
        }
        return 0;
    }
}
````

#### 解法02-排序

​		需要先排序再通过判断`n`和`n+1`的值，判断出是否是重复的元素。排序直接用的`Arrays.sort()`方法。

````java
class Solution03_02 {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if (nums[i] == nums[i+1]) return nums[i];
        }
        return 0;
    }
}
````

------

#### 解法03-交换（书上的解法）

> ​		现在让我们重排这个数组。从头到尾依次扫描这个数组中的每个数字。当扫描到下标为i的数字时,首先比较这个数字(用m表示)是不是等于i如果是,则接着扫描下一个数字;如果不是,则再拿它和第m个数字进行比较。如果它和第m个数字相等,就找到了一个重复的数字(该数字在下标为i和m的位置都出现了);如果它和第m个数字不相等,就把第i个数字和第m个数字交换,把m放到属于它的位置。接下来再重复这个比较、交换的过程,直到我们发现一个重复的数字。

````java
class Solution03_03 {
    public int findRepeatNumber(int[] nums) {
        //扫描整个数组
        for(int i = 0;i<nums.length;i++){
            //如果下标存储的值和下标不相等 就进入循环 开始准备交换
            while (nums[i] != i){
                //如果对应下标的数字重复了 就返回
                if(nums[i] == nums[nums[i]]) return nums[i];
                //如果没有重复 就交换这两个数字 直到nums[i] == i
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return 0;
    }
}
````

