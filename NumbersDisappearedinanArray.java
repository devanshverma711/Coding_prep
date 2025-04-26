import java.util.*;
class NumbersDisappearedinanArray{
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,7,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }
        public static List<Integer> findDisappearedNumbers(int[] nums) {
            ArrayList<Integer> result = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                int Index = Math.abs(nums[i])-1;
                if(nums[Index]>0){
                    nums[Index]=-nums[Index];
                }
            }   
            for(int j=0;j<nums.length;j++){
                if(nums[j]>0){
                    result.add(1+j);
                }
            }
        return result;
    }
}