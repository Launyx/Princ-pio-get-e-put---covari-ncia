package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        
        // COVARIÂNCIA
        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;

        Number x = list.get(0);

        list.add(20);   // O compilador não sabe se o parâmetroo atribuido à adição da lista é compativel com algum outro tipo Number


        // CONTRAVARIÂNCIA
        List<Object> myObjects = new ArrayList<>();
        myObjects.add("Maria");
        myObjects.add("Alex");

        List<? super Number> myNums = myObjects;

        myNums.add(10);
        myNums.add(3.14);

        Number y = myNums.get(0);   // O elemento de myNums pode ser um super tipo de Number, por isso não é permitida a atribuição a um tipo Number

    }
}
