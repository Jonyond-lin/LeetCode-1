class Solution
{
    public int[] searchRange(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;
        if (nums == null || nums.length == 0 || target < nums[left] || target > nums[right])
            return new int[]{-1, -1};
        while (left <= right)
        {
            int mid = (left + right) / 2;
            if (nums[mid] < target)
            {
                left = mid + 1;
            }
            else if (nums[mid] > target)
            {
                right = mid - 1;
            }
            else
            {
                int start = mid;
                while (start >= 0 && nums[start] == target)
                    start--;
                int end = mid;
                while (end < nums.length && nums[end] == target)
                    end++;
                return new int[]{start + 1, end - 1};
            }
        }
        return new int[]{-1, -1};
    }
}