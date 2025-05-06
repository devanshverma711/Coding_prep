
import java.util.Arrays;

class QuickSort{
    public static void main(String[] args){
        int[] arr = {4,6,2,7,9,1,5};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] arr,int s,int e){
        if(s>=e){
            return;
        }   
        int start = s;
        int end=e;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];

        while(start<end){
            if(arr[start]<pivot){
                start++;
            }
            if(arr[end]>pivot){
                end--;
            }
            if(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        quick(arr,s,end);
        quick(arr,start,e);


    }
}