class TotalCharactersinStringAfterTransformationsIEasy{
    public static void main(String[] args) {
        String s = "cu";
        int t = 5;
        System.out.println(lengthAfterTransformations( s, t) );
    }
    public static int lengthAfterTransformations(String s, int t) {
        int j=0;
        for(int i=0;i<s.length();i++){
            int count='z'-s.charAt(i);
            if(count<t){
                j++;
            }
        }
        return s.length()+j;
    }
}