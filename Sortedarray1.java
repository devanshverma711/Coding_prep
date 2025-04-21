class Sortedarray1{
    public static void main(String[] args) {
        int[] arr={1,3,5,6,32};//,7,3,90};
        System.out.println(sorted(arr,0));
    }

    private static boolean sorted(int[] arr, int i) {
        if(i==arr.length-1){
            return true;
        }
        return arr[i]<arr[i+1] && sorted(arr,i+1);
    }
}