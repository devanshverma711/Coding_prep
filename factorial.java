class factorial{
    public static void main(String[] args) {
        int n=5;
        int facto =1;
        System.out.println(fact(n,facto));
    }
    static int fact(int n,int facto){
        if(n==0){
           return facto;
        }
        facto*=n;
        return fact(n-1,facto);
    }
}