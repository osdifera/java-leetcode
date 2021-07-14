package algo;

import java.util.Arrays;

public class L35_search_insert_pos {
    public int searchInsert(int[] nums, int target) {
        int i = Arrays.binarySearch(nums, target);
        return i >= 0 ? i : -i - 1;
    }
}
