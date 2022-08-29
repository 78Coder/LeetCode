
public class SolutionMid {



    // 递增数组arr，查找数字num，找到返回下标，否则返回-1
// 要求：写出查找函数，并列举出全部单测用例

    // arr = [1, 2, 3, 6, 8, 10, 14, 16], num = 1;  ret = 0
// arr = [1, 2, 3, 6, 8, 10, 14, 16], num = 16;  ret = 0
// arr = [1, 2, 3, 6, 8, 10, 14, 16], num = 0;  ret = -1
// arr = [1, 2, 3, 6, 8, 10, 14, 16], num = 17;  ret = -1
// arr = [1, 2, 3, 6, 8, 10, 14, 16], num = Integer.MAX_VALUE;  ret = -1
// arr = [1, 2, 3, 6, 8, 10, 14, 16], num = Integer.MIN_VALUE;  ret = -1
// arr = [1, 2, 3, 6, 8, 10, 14, 16], num = 15;  ret = -1
// arr = [1, 2, 3, 6, 8, 10, 14, 16], num = 4;  ret = -1
// arr = [], num = 1;  ret = -1
// arr = null, num = 1;  ret = -1
// arr = [1], num = 1;  ret = -1
// arr = [2], num = 1;  ret = -1
// arr = [1, 2, 3, 6, 8, 10, 14, 16......Integer.MAX_VALUE - 2个元素], num = 1;  ret = 0
    public int mid(int[] input, int num) {
        if(input == null || input.length == 0 || num < input[0] || num > input[input.length - 1]) {
            return -1;
        }
        int left = 0;
        int right = input.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(input[mid] == num) {
                return mid;
            }
            if(input[mid] < num) {
                left = mid + 1;
                continue;
            }
            right = mid - 1;
        }
        return -1;
    }

// arr = [14, 16, 1, 2, 3, 6, 8, 10], num = 1;  ret = 0
// arr = [6, 8, 10, 14, 16, 1, 2, 3], num = 1;  ret = 0


    public int mid2(int[] input, int num) {
        if(input == null || input.length == 0) {
            return -1;
        }
        int left = 0;
        int right = input.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if(input[mid] == num) {
                return mid;
            }
            if(num <= input[right] && num > input[mid]) {
                left = mid + 1;
            }
            right = mid - 1;
        }
        return -1;
    }
}


