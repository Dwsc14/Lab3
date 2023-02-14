package view;

import java.util.ArrayList;
import java.util.List;

import model.*;
import controller.*;

public class Menu {
    public static List<CentralBank> centralList = new ArrayList<CentralBank>();
    public static List<NorthBank> norhtlList = new ArrayList<NorthBank>();

    public static void main(String[] args) {
        centralList.add(Controller.createCentralUser());

        System.out.println(centralList.get(0).toString());
        System.out.println("Ahahah");

    }

}
