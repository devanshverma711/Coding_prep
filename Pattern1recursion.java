class Pattern1recursion{
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        int i=n;
        if(i==0){
            return;
        }
        while(i>0){
            System.out.print('*');
            i--;
        }
        System.out.println();
        pattern(n-1);

    }
}