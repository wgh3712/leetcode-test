
public class FindTargetSumWays {

	int sum = 0;

	public int findTargetSumWays(int[] nums, int S) {
		helper(nums, S, 0);
		return sum;
	}

	private void helper(int[] nums, int target, int i) {
		if (i >= nums.length) {
			if (target == 0) {
				sum++;
			}
			return;
		}
		helper(nums, target - nums[i], i + 1);
		helper(nums, target + nums[i], i + 1);

	}
}
