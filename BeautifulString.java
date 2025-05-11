class BeautifulString{
    public static void main(String[] args) {
        String str="0010";
        System.out.println(makeBeautiful(str));
    }
    public static int makeBeautiful(String str) {
       int count1 = 0; // Count for the pattern starting with '0'
        int count2 = 0; // Count for the pattern starting with '1'
        int n = str.length();

        // Check against the pattern starting with '0' (0101...)
        for (int i = 0; i < n; i++) {
            char expected = (i % 2 == 0) ? '0' : '1';
            if (str.charAt(i) != expected) {
                count1++;
            }
        }

        // Check against the pattern starting with '1' (1010...)
        for (int i = 0; i < n; i++) {
            char expected = (i % 2 == 0) ? '1' : '0';
            if (str.charAt(i) != expected) {
                count2++;
            }
        }

        // Return the minimum number of changes required
        return Math.min(count1, count2);
    }
}