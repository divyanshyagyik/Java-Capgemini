package DSa;

public class TitleCase {
    public static  String convert(String s){
        String [] strings = s.split("\\s+");
        String ans="";
        for(int i=0;i<strings.length;i++){
            String word = strings[i];
            char c = word.charAt(0);
            c=Character.toUpperCase(c);
            strings[i]=c+word.substring(1);
            ans+=strings[i]+" ";
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "This is java lang";
        System.out.println(convert(s));
    }
}
