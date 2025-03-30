import java.util.*;
class PartitionLabels1 {
     
    public static List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] lastIndex = new int[26]; 
        
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
       

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']); // Expand the partition

            if (i == end) { // When the current index reaches the end of partition
                result.add(end - start + 1);
                start = i + 1; // Update start for the next partition
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        List<Integer> partitions = partitionLabels(s);
        System.out.println(partitions); 
     }
}