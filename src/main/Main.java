package main;

import Model.MenuFuncs_DAO;
import View.Splash_GUI;

public class Main {
    public static MenuFuncs_DAO menuFuncs = new MenuFuncs_DAO();
    public static void main(String[] args) {
        new Splash_GUI().setVisible(true);
    }
}
