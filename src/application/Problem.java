package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem {
    public static void main(String[] args) {
        
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
        
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        // A lista de origem é um caso de covariância (trablha com subtipos do informado), sendo possível o acesso aos elementos da mesma
        // A lista de destino é um caso de contravariância (trabalha com supertipos do informado), sendo possível a adição de elementos
        for (Number number : source){
            destiny.add(number);
        }
    }

    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
