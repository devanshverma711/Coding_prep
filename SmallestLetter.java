public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'd', 'g'};
        char target = 'a';
        char smallestLet = findSmallestLetter(arr, target);
        System.out.println(smallestLet);
    }
   
    public static char findSmallestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        // Modulus ensures circular array behavior
        return letters[start % letters.length];
    }
}
