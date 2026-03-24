public class StringPosition {
    public static void main(String[] args) {
        String str = "this is line. Line contains few words. Line is in java";
        String str2 = str.toLowerCase();
        String word = "line";
        int index = str2.indexOf(word);
        while(index  != -1) {
            System.out.println(index);
            index = str2.indexOf(word, index+1);
        }
    }
}
