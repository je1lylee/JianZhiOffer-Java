## 剑指 Offer 03. 数组中重复的数字

#### 解法01-双循环

​		只需要嵌套两层循环即可。需要注意的是内层循环的角标需要比外层循环+1。缺点是这种解法需要`2739ms`才能完成计算，需要的时间较长。

````java
class Solution01_01 {
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
class Solution01_02 {
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

