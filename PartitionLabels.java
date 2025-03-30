import java.util.*;


class PartitionLabels {
    
    public static List<Integer> partitionLabels(String s) {
        List<Integer> arr = new ArrayList<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            String part=s.substring(j,i+1);
            String rest=s.substring(i+1,s.length());
            if(areTotallyDifferent(part,rest)==true){
                arr.add(part.length());
                j=i+1;
            }
        }
        return arr;
    }
    static boolean areTotallyDifferent(String part, String rest) {
        int maskS = 0, maskT = 0;
        
        // Create bitmask for s
        for (char c : part.toCharArray()) {
            maskS |= (1 << (c - 'a'));
        }

        // Create bitmask for t
        for (char c : rest.toCharArray()) {
            maskT |= (1 << (c - 'a'));
        }

        // Check if the masks have common bits
        return (maskS & maskT) == 0;
    }
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> partitions = partitionLabels(s);
        System.out.println(partitions); // Output: [9, 7, 8]
     }
}