import java.io.*;

class Cr1 {
    public static void main(String[] args) throws IOException {
        File ob1 = new File("‪‪newfile.txt");
        if (ob1.createNewFile()) {
            System.out.println("File Is Created.");
        } else {
            System.out.println("File Is Not Created.");
        }
    }
}