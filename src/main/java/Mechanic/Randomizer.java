package Mechanic;

import CRUD.DataBaseSelected;
import org.hibernate.SessionFactory;

import java.util.*;

public class Randomizer {

    public List<String> drawIdForRead(SessionFactory sessionFactory, DataBaseSelected dataBaseSelected, AddValueToDateBase addValueToDateBase, int howMuchElement){
        List<String> read = new ArrayList<>();
        Set<Integer> integers = new LinkedHashSet<>();
        while (integers.size() <= howMuchElement){
            integers.add(getRandomNumber(addValueToDateBase.getPl().size()));
        }
        List<Integer> random = new ArrayList<>(integers);
        for (int i = 0; i <= howMuchElement; i++) {
            read.add(dataBaseSelected.read(sessionFactory, random.get(i)));
        }
        return read;
    }

    private int getRandomNumber(int max) {
        Random random = new Random();
        return random.nextInt(max);
    }
}
