class ReverseNumber{
    public static void main(String[] args) {
        int num = 1342;
        reverse(num);
        System.out.println(sum);
    }
    static int sum =0;
    static void reverse(int num){
        if(num==0){
            return;
        }
        int rem = num%10;
        sum = sum*10+rem;
        reverse(num/10);
    }
}