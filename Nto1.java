class Nto1{
    public static void main(String[] args) {
        int n=10;
        nto1(n);
    }
    static void nto1(int n){
        if(n==1){
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        nto1(n-1);
    }
}