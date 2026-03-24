import java.io.*;

public class SkipWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("skipWord.txt"));

        String line;
        while((line = br.readLine()) != null){
            String[] words = line.split(" ");
            boolean writeWord = true;
            for(String word: words){
                if(writeWord) {
                    bw.write(word);
                }
                writeWord = !writeWord;
            }
            bw.newLine();
        }
        br.close();
        bw.close();
        System.out.println("File Copied");
    }
}
