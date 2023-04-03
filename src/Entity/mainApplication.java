package Entity;

import java.io.*;

public class mainApplication {
    public static void main(String[] args) throws IOException {
        Employee employee1 = new HourlyEmployee("HS1", "Bui Quang", "Bach");
        Employee employee2 = new HourlyEmployee("HS2", "Nguyen Tien", "Cuong");
        Employee employee3 = new HourlyEmployee("HS3", "Doan Quoc", "Viet");
        PrintWriter writer = null;

        // attach the file to FileInputStream
        FileInputStream fin = new FileInputStream("data.txt");
// illustrating available method
        System.out.println("Number of remaining bytes:" + fin.available());
// illustrating skip method
        /*Original File content:
         * This is my first line
         * This is my second line*/
        fin.skip(5);
        System.out.println("FileContents :");
// read characters from FileInputStream and write them
        int ch;
        while ((ch = fin.read()) != -1)
            System.out.print((char) ch);
// close the file
        fin.close();
    }
}
