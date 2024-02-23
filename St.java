public class St {
    public void checks() {
        String a = "AAABBCC";
        int c = 1;
        int k = 0;
        int n = a.length();
        char arr[] = new char[n];
        char arr1[] = new char[6];
        for (int i = 0; i < n; i++) {
            arr[i] = (char) a.charAt(i);
        }
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            while (j < n && arr[i] == arr[j]) {
                c = c + 1;
                j++;
            }
            arr1[k] = (char) c ; // Convert integer to character
            k++;
            arr1[k] = arr[i];
            k++;
            i = j - 1; // Correct the index to the next non-repeating character
            c = 1;
        }
        for (int i = 0; i < 6; i++) { // Iterate till arr1 length
            System.out.println(arr1[i]);
        }
    }

    public static void main(String[] argc) {
        St s1 = new St();
        s1.checks();
    }
}
