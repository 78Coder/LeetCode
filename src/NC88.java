public class NC88 {

    public int findKth (int[] a, int n, int K) {
        // write code here
        return doFindKth(a, 0, n, K);

    }

    public int doFindKth (int[] a, int start, int n, int K) {
        int tmp = a[start];
        int left = start;
        int right = n;
        while(left < right) {
            if(a[left] < tmp) {
                left++;
                continue;
            }
            if(a[right] > tmp) {
                right--;
                continue;
            }
            int swap = a[right];
            a[right] = a[left];
            a[left] = swap;
        }
        if(left == K) {
            return tmp;
        }
        a[left] = tmp;
        if(left >= K) {
            doFindKth(a, start, tmp - 1, K);
        }
        return doFindKth(a, tmp, n, K);
    }
}
