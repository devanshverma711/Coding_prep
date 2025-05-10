class MinZerosMax2ArraySum{
    public static void main(String[] args){
       int[] nums1 = {0,0,10,10,12,0,13,6,0,2,10};
       int[] nums2 = {24,5,12,22};
       System.out.println((int) minSum(nums1,nums2));
    }
     public static long minSum(int[] nums1, int[] nums2) {
      int sum1=0,count1=0;
      int sum2=0,count2=0;
     // Arrays.sort(nums1);
    //  Arrays.sort(nums2);

      for(int i=0;i<nums1.length;i++){
        if(nums1[i]==0){
            count1++;
        }
        sum1+=nums1[i];
      }  
      for(int i=0;i<nums2.length;i++){
        if(nums2[i]==0){
            count2++;
        }
        sum2+=nums2[i];
      }
    int diff = Math.abs(sum2-sum1);
      
      if(sum2>sum1){
        if(count1==0){
            return -1;
        }
        if((sum1+count1)>(sum2+count2)){
            return -1;
        }
        return sum2+count2;
      }

      if(sum1>sum2){
        if(count2==0){
            return -1;
        }
        if((sum2+count2)>(sum1+count1)){
            return -1;
        }
        return sum1+count1;
      }
      else{
        if(count1==0 || count2==0){
            return -1;
        }
       return sum1+Math.max(count1,count2);
      }
    }
}