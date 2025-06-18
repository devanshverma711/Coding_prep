
import java.util.HashSet;

class Pangram{
    public static void main(String [] args){
        String str = "TheQuickBrownFoxJumpsOverTheLazyDog";
        System.out.println(ninjaGram(str));
    }
    public static boolean ninjaGram(String str) {

		// Write your code here
		if(str.length()<26){
			return false;
		}
		HashSet<Character> alphabet = new HashSet<>();
		for(int i=0;i<str.length();i++){
			alphabet.add(Character.toLowerCase(str.charAt(i)));
		}
		if(alphabet.size()==26){
			return true;
		}
		return false;

	}
}
