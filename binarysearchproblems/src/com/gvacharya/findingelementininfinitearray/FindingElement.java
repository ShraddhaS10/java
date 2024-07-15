package com.gvacharya.findingelementininfinitearray;

public class FindingElement {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 6, 8, 10, 14, 15, 16, 18};
        int target = 18;

        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = 1;

        // Expanding the range
        while (end < nums.length && target > nums[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        // Adjust end if it goes out of bounds
        if (end >= nums.length) {
            end = nums.length - 1;
        }

        return binarySearch(nums, target, start, end);
    }

    static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
