package PZ;

import java.util.ArrayList;
import java.util.List;

public class LaptopLocalDAO implements LaptopDAO{
    private List<Laptop> laptopList = new ArrayList<>();
    private FileLocalDAO fileLocalDAO = new FileLocalDAO();

    public LaptopLocalDAO() {
    }


    public List<Laptop> getAllLaptopsFromFile() {
       List<Laptop> laptop = fileLocalDAO.ReadFromFile();
        return laptop;
    }

    @Override
    public void addLaptop(Laptop laptop) {

        laptopList.add(laptop);
        fileLocalDAO.WriteIntoFile(laptopList);
    }

    @Override
    public List<Laptop> getAllLaptops() {
        return laptopList;
    }
}

