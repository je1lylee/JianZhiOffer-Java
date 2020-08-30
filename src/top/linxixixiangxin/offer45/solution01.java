package top.linxixixiangxin.offer45;

public class solution01 {
    public static void main(String[] args) {
        System.out.println(new Solution45_01().minNumber(new int[]{3,30,34,5,9}));
    }
}
class Solution45_01 {
    public String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        for(int i = 0; i < nums.length; i++)
            strs[i] = String.valueOf(nums[i]);
        //将int转成string 同时对字符串数组进行排序
        fastSort(strs, 0, strs.length - 1);
        //通过排序结果 构建数字
        StringBuilder res = new StringBuilder();
        for(String s : strs)
            res.append(s);
        return res.toString();
    }

    /**
     * 待排序数组 左侧指针 右侧指针
     * @param strs
     * @param l
     * @param r
     */
    void fastSort(String[] strs, int l, int r) {
        //左侧指针大于右侧指针 结束
        if(l >= r) return;
        int i = l, j = r;
        String tmp = strs[i];
        while(i < j) {
            //campareTo >0 则前大于后 否则 后大于前 =0时两者相等
            while((strs[j] + strs[l]).compareTo(strs[l] + strs[j]) >= 0 && i < j) {
                //向左移动右侧指针
                j--;
            }
            while((strs[i] + strs[l]).compareTo(strs[l] + strs[i]) <= 0 && i < j){
                //想右移动左侧指针
                i++;
            }
            //交换元素
            tmp = strs[i];
            strs[i] = strs[j];
            strs[j] = tmp;
        }
        strs[i] = strs[l];
        strs[l] = tmp;
        //右侧元素左移
        fastSort(strs, l, i - 1);
        //左侧元素右移
        fastSort(strs, i + 1, r);
    }
}