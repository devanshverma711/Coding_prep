
import java.util.ArrayList;
import java.util.List;

class FindAllDuplicatesinanArray{
    public static void main(String[] args) {
        int [] nums={1,2,4,3,5,5,6,7};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                result.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }

        return result;
    }
}
