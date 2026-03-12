package DSa;
public class DateFormatingg {
    public static String formatting(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            int ch = str.charAt(i)-'0';
            if(ch>=0 && ch<10){
                ans+=str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "12.04.4";
        System.out.println(formatting(s));
    }
}
