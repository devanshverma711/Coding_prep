class fibonaccinumber1{
    public static void main(String[] args) {
        int ans =fibo(4);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n<2){
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}