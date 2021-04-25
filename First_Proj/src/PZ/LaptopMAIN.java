package PZ;

import java.util.List;

public class LaptopMAIN {
    public static void main(String[] args) {

        Laptop mac = new Laptop("MAC1", 12.0D);
        Laptop xiaomi = new Laptop("Xiaomi2", 3131.0D);
        Laptop asus = new Laptop("Asus RTX", 2.0D);
        LaptopLocalDAO laptopDAO = new LaptopLocalDAO();
        laptopDAO.addLaptop(mac);
        laptopDAO.addLaptop(asus);
        laptopDAO.addLaptop(xiaomi);
        /*List<Laptop> localList = laptopDAO.getAllLaptops();
        localList.forEach((laptop) -> {
            System.out.println(laptop);
        });*/
        List<Laptop> localList = laptopDAO.getAllLaptopsFromFile();

    }
}
