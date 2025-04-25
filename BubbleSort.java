
import java.util.Arrays;

class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {5,7,2,24,7,8,9,6};
        bubblesort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubblesort(int[] arr,int n,int i){
        if(n==0){
            return ;
        }
        if(i<n){
            bubblesort(arr, n, i+1);
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            
        }
        else{
             bubblesort(arr, n-1, 0);
        }
    }
}