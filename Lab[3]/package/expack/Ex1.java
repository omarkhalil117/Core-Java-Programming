package expack;

import java.util.function.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex1 {

    // Fehrinhait to Clesius
    public Function<Double, Double> fehToCel = (Double temp) -> {
        return (double) ((temp - 32.0) / 1.8);
    };

    // Clesius to Fehrinhait
    public Function<Double, Double> celToFeh = (Double temp) -> {
        return (double) ((temp * 1.8) + 32);
    };

    // solve Quadratic function
    public Function<List<Integer>, List<Double>> solveQuad = (List<Integer> params) -> {

        // create List result with its iterator
        List<Double> res = new ArrayList<Double>();
        ListIterator<Integer> paramsIterator = params.listIterator();

        // store List elements in a,b,c
        int a = params.get(0);
        int b = params.get(1);
        int c = params.get(2);

        // if a equla 0
        if (a == 0) {
            System.out.println("Error division by zero");
            return res;
        }

        // Check if there is negative under square root
        if (Math.pow(b, 2) - (4 * a * c) < 0) {
            System.out.println("Error Negative under square root");
            return res;
        }

        // calculate x1 , x2
        double x1 = (double) (-b + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
        double x2 = (double) (-b - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);

        // add x1 , x2 to list
        res.add(x1);
        res.add(x2);

        // return result
        return res;
    };

}
