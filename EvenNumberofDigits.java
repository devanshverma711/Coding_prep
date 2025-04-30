class EvenNumberofDigits{
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            String ss = Integer.toString(nums[i]);
            int n = ss.length();
            if(n%2==0){
                count++;
            }
        }
        return count;
    }
}