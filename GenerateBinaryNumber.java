import java.util.* ;

class GenerateBinaryNumber{
    public static void main(String[] args) {
        int n =5;
        System.out.println(generateBinaryNumbers(n));
        System.out.println(10 >>> 2);
    }
    
    public static List<String> generateBinaryNumbers(int n) {
        //Write your code here
		ArrayList<String> binary = new ArrayList<>();
		for(int i =1;i<=n;i++){
			String bin = Integer.toBinaryString(i);
			binary.add(bin);
		}
		return binary;
    }

}