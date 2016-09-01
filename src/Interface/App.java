package Interface;

import Main.DataManager;


public class App {

    public static void main(String[] args) {
        System.out.println("Carregando!");
        DataManager.getInstance();
        MenuInicial jan = new MenuInicial();
        jan.show();
    }
}