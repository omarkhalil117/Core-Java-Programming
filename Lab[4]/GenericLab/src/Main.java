import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Shapes Lab
        // create arraylist of type rectangles
        List<Rectangle> Rectangles = new ArrayList<>();

        // add new object of type rectangle
        Rectangles.add(new Rectangle());
        Rectangles.add(new Rectangle());
        Rectangles.add(new Rectangle());


        // create arraylist of type circles
        List<Circle> Circles = new ArrayList<>();

        // add new objects of circle
        Circles.add(new Circle());
        Circles.add(new Circle());
        Circles.add(new Circle());

        // create arraylist of integets for testing
        List<Integer> ints = new ArrayList<>();

        ints.add(5);
        ints.add(6);
        ints.add(7);

        // call the abstract Method and add Circles List
        Test.addShapes(Circles);

        // call the abstract Method and add Rectangles List
        Test.addShapes(Rectangles);

        // gives compiler Error
        //test.addShapes(List);

        
        // Complex Lab
        // create 2 complex numbers
        Complex<Double> num1 = new Complex<>(2.5, 4.5);
        Complex<Double> num2 = new Complex<>(4.0, 3.5);

        // use complex methods on the previous numbers
        Complex<Double> sum = num1.add(num2);
        Complex<Double> difference = num1.subtract(num2);
        Complex<Double> multiplication = num1.multiply(num2);

        // print the result
        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        System.out.println("Difference: " + difference.getReal() + " + " + difference.getImaginary() + "i");
        System.out.println("Multiplication: " + multiplication.getReal() + " + " + multiplication.getImaginary() + "i");
        
        // gives compiler error
        //Complex<String> cmplx = new Complex<String>("Hello", "World");
         
    }
}
