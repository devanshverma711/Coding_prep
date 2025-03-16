public class floor{
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12,14,15,18,19};
        int target=19;
        int ceiling = find_floor(arr,target);
        System.out.println(ceiling);
    }

    public static int find_floor(int[] arr,int target){
        int start =0;
        int end = arr.length-1;
        int answer=0;
        while(start<end){
            int mid = start +(end-start)/2;
            if(arr[mid]>=target){
                end=mid-1;
            }
            else{

                start=mid+1;
            }
        }
        return answer=arr[end];
    }
}