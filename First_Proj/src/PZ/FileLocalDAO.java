package PZ;

import java.io.*;
import java.util.List;

public class FileLocalDAO {
    private OutputStream outputStream = null;
    private ObjectOutputStream objectOutputStream = null;
    private InputStream inputStream = null;
    private ObjectInputStream objectInputStream = null;

    public FileLocalDAO() {
    }

    public void WriteIntoFile(List<Laptop> laptop) {
        try {
            outputStream = new FileOutputStream("LaptopsInfo.txt");
            objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(laptop);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.flush();
                outputStream.close();
                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    public List<Laptop> ReadFromFile() {
        List<Laptop> readLaptop = null;

        try {
            inputStream = new FileInputStream("LaptopsInfo.txt");
            objectInputStream = new ObjectInputStream(inputStream);
            readLaptop = (List<Laptop>) objectInputStream.readObject();
            System.out.println(readLaptop);
        } catch (FileNotFoundException var3) {
            System.out.println("a");
        } catch (IOException var4) {
            System.out.println("b");
        } catch (ClassNotFoundException var5) {
            System.out.println("c");
        }

        return readLaptop;
    }
}
