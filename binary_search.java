class binary_search{
    public static void main(String[] args) {
        int[]  arr ={1,2,4,5,7,8,9,42,56};
        int target=7;
        System.out.println(BinarySearch(arr, target));
    }

    static int BinarySearch(int[] arr,int target){
        int start =0;
        int end = arr.length-1;

        while(end>start){
            int mid = start +(end-start)/2 ;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
       }
       return -1;
    }
}