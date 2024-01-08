package mainpack;

import expack.Ex1;
import java.util.function.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Ex1 x = new Ex1();

        // use F -> C
        double res1 = x.fehToCel.apply(40.0);
        System.out.println("Result F -> C = " + res1);

        // use C -> F
        double res2 = x.celToFeh.apply(40.0);
        System.out.println("Result C -> F = " + res2);

        // Create input
        List<Integer> inputList = new ArrayList<Integer>();
        inputList.add(1);
        inputList.add(0);
        inputList.add(-16);

        // Create returned result
        List<Double> result = new ArrayList<Double>();

        // calculate the result
        result = x.solveQuad.apply(inputList);

        // print result
        System.out.println(result);

    }
}
