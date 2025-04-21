class Sortedarray{
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,2};
        System.out.println(checksorted(arr,0,1));
    }

    static int checksorted(int[] arr,int i,int j) {
        if(j==arr.length){
            return 1;
        }
        if(arr[i]<arr[j]){
            return checksorted(arr, i+1, j+1);
        }
        return 0;
    }
}