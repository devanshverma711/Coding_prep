public class fibonaccinumber{
    public static void main(String[] args) {
        int first =0;
        int second = 1;
        int n=6;
        int p =0;
        fibonacci(first,second,n,p);   
    }
    static void fibonacci(int first , int second,int n,int p){
        if(p==n){
            return;
        }
        int third =first+second;
        first=second;
        second=third;
        p++;
        System.out.println(third);
        fibonacci(first, second,n,p);
    }
}