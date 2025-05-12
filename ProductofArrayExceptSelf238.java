
import java.util.Arrays;

class ProductofArrayExceptSelf238{
    public static void main(String[] args) {
        int[] nums = {1,2,0,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
        int multiple=1;
        int pos=0,count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count++;
                pos=i;
            }
            else{
                multiple=multiple*nums[i];
            }
        } 
        if(count>1){
            for(int i=0;i<arr.length;i++){
                arr[i]=0;
            }
        }
        else if(count==1){
            for(int i=0;i<arr.length;i++){
                if(i==pos){
                    arr[i]=multiple;
                }
                else{
                    arr[i]=0;
                }
            }
        }
        else {
            for(int i=0;i<arr.length;i++){
                arr[i]=multiple/nums[i];
            }
        }
        return arr;
    }
}