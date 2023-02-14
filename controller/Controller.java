package controller;

import model.*;

public class Controller {

    public static CentralBank createCentralUser() {
        CentralBank user = new CentralBank();
        user.setInfo();
        return user;
    }

    public static NorthBank createNorthUser() {
        NorthBank user = new NorthBank();
        user.setInfo();
        return user;
    }

}
