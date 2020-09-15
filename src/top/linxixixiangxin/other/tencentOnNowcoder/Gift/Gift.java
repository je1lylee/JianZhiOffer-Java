package top.linxixixiangxin.other.tencentOnNowcoder.Gift;

import java.util.Arrays;

public class Gift {
    public int getValue(int[] gifts, int n) {
        Arrays.sort(gifts);
        int num = 0, curLength = 0;
        int ratio = n / 2;
        for (int i = 0; i < n; i++) {
            if (gifts[i] == num) {
                curLength++;
                if (curLength > ratio) break;
            } else if (gifts[i] != num){
                num = gifts[i];
                curLength = 1;
            }
        }
        if (curLength > ratio) return num;
        else return 0;
    }

    public static void main(String[] args) {
        System.out.println(new Gift().getValue(new int[]{
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297,
                5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 5297, 2174, 4144, 5386, 3224,
                1711, 8887, 6693, 2679, 6655, 6404, 9485, 3724, 7696, 1308, 6413, 2701, 7585,
                2391, 6193, 1645, 2077, 5970, 3988, 3132, 8402, 4179, 4915, 9164, 1461, 1948,
                8902, 1563, 4163, 5841, 4432, 573, 3819, 2157, 4500, 5961, 6523, 9154, 6619,
                1144, 824, 6527, 4819, 153, 5570, 1287, 5322, 2009, 1959, 5472, 8908, 8721,
                7462, 2537, 1657, 3376, 1207, 1248, 2011, 7290, 3385, 66, 6614, 1441, 5516,
                4084, 3616, 1779, 4753, 3202, 9011, 1493, 2895, 38, 2369, 8575, 6519, 8763,
                3528, 247, 4153, 8706, 1238, 4114, 7800, 4549, 7918, 5448, 6428, 5882, 6155,
                6647, 7223, 1163, 933, 9787, 1419, 8387, 6610, 1245, 9593, 6459, 4958, 2537,
                7101, 4919, 1406, 5285, 3272, 1722, 2130, 8895, 6925, 7377, 5129, 4422, 577,
                1535, 697, 4268, 5885, 3300, 1647, 6265, 6741, 3059, 1028, 7347, 670, 1988,
                2609, 5166, 1276, 887, 5700, 4287, 2233, 8523, 9139, 3461, 653, 1118, 2624,
                4425, 8602, 9157, 1918, 1685, 7863, 2702, 7172, 4804, 8400, 756, 4287, 4169,
                7756, 2035, 716, 7474, 8015, 3309, 1766, 6814, 9248, 1868, 8813, 8364, 4381,
                6937, 9960, 8742, 2702, 4093, 5612, 3230, 3112, 3222, 7805, 2104, 3715, 1307,
                6388, 2569, 5630, 3171, 5362, 3614, 9762, 2259, 149, 2991, 6564, 5047, 2488,
                853, 2174, 1604, 4815, 9706, 768, 4987, 7588, 6464, 4371, 1840, 9099, 1173,
                4447, 251, 1709, 8806, 8638, 1262, 7571, 850, 2064, 2505, 5489, 9248, 4240,
                251, 2422, 1106, 6727, 3098, 9744, 1644, 5167, 181, 1637, 5488, 8682, 8999,
                3999, 3356, 901, 8974, 8504, 199, 2199, 6893, 3575, 151, 2350, 4367, 9049,
                1783}, 508));
    }
}
