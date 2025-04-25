class Pattern2recursion{
    public static void main(String[] args) {
        pattern(4,0);
    }
    static void pattern(int n,int r){
        if(n==0){
            return;
        }
        if(r<n){
            pattern(n, r+1); 
            System.out.print('*');   
        }
        else{ 
            pattern(n-1, 0);
            System.out.println();
        }
    }
}