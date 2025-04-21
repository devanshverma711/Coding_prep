
import java.util.ArrayList;

class targetArrayfind{
    public static void main(String[] args) {
        int[] arr = {1,3,6,8,8,9,10};
        System.out.println(target(arr,8,0));
    }
    static ArrayList<Integer> target(int[] arr, int tar, int i){
         ArrayList<Integer> list = new ArrayList<>();
        if(i==arr.length){
            return list;
        }
        if(arr[i]==tar){
            list.add(i);
        }
        ArrayList<Integer> ansfrombelow = target(arr, tar, i+1);
        list.addAll(ansfrombelow);
        return list;
    }
}