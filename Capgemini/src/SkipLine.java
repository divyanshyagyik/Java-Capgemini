import java.io.*;

public class SkipLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("skipLine.txt"));

        String line;
        boolean skip = true;
        while((line = br.readLine()) != null){
            if(skip){
                bw.write(line);
                bw.newLine();
            }
            skip = !skip;
        }
        br.close();
        bw.close();
        System.out.println("File Copied");
    }
}
