package Printer;

import CRUD.DataBaseSelected;
import Mechanic.AddValueToDateBase;
import Mechanic.CheckAnswer;
import Mechanic.Randomizer;
import org.hibernate.SessionFactory;

import java.util.Scanner;

public class PrinterWords {
    public void print(SessionFactory sessionFactory){
        AddValueToDateBase addValueToDateBase = new AddValueToDateBase();
        DataBaseSelected dataBaseSelected = new DataBaseSelected();
        Randomizer randomizer = new Randomizer();
        dataBaseSelected.create(sessionFactory, addValueToDateBase.add());
        randomizer.drawIdForRead(sessionFactory, dataBaseSelected, addValueToDateBase, 15).forEach(s -> {
            System.out.print(s + ": ");
            String keyWord = new Scanner(System.in).nextLine();
            System.out.println(new CheckAnswer().check(sessionFactory, s, keyWord));
        });
    }
}
