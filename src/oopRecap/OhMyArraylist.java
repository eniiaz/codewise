package oopRecap;

import java.util.ArrayList;

public class OhMyArraylist {

    public static void main(String[] args) {

        ArrayList<String> carModels = new ArrayList<>();
        carModels.add("Camry");
        carModels.add(0, "Bugatti");
        System.out.println(carModels);
        carModels.add("Tesla");
        carModels.add("Kia");
        carModels.add("Lexus");
        carModels.add("Audi");
        System.out.println(carModels);

        if(carModels.size() < 25){
            carModels.add("Pagani");
        }
        System.out.println(carModels);

        if (!carModels.contains("Audi")){
            carModels.add("Audi");
        }
        System.out.println(carModels);

        // carModels.add(0, carModels.get(carModels.size()-1));
        String save = carModels.get(carModels.size() - 1);


        carModels.set(carModels.size() - 1, "Mercedes");

        System.out.println(carModels);

        carModels.set(0, save);
        System.out.println(carModels);

        String saveTheCar = carModels.get(0);
        carModels.set(0, carModels.get(carModels.size()-1));
        carModels.set(carModels.size()-1, saveTheCar);

        System.out.println(carModels);



    }

}
