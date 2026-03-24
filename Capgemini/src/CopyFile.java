import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("data.txt");
        FileOutputStream fout = new FileOutputStream("dataCopy.txt");
        int ch = 0;
        boolean skip = true;
        while ((ch = fin.read()) != -1) {
            if (skip) {
                fout.write(ch);
            }
            skip = !skip;
        }
        fin.close();
        fout.close();
        System.out.println("File Copied");
    }
}
