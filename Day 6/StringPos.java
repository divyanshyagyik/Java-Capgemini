package DSa;

import java.util.ArrayList;
import java.util.List;
public class StringPos {
    public static void pos(String str,String word){

        str=str.toLowerCase();

        int index=str.indexOf(word);

        while(index!=-1){
            System.out.println("Found at index "+index);
            index=str.indexOf(word,index+word.length());

        }

    }
    public static void main(String[] args) {
        String str = "this is line. Line contains few words. Line is in java";
        pos(str,"line");
    }
}
