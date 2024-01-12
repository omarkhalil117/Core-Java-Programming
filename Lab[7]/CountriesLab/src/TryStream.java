import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TryStream {

    public int id;
    public String name;
    public int age;
    public double salary;

    TryStream(int _id, String _name, int _age, float _salary) {
        id = _id;
        name = _name;
        age = _age;
        salary = _salary;
    }

    double getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(1,2,3,4,5,6);
        
        //List<Integer> res = 
        List<Object> res = arr.stream().filter(e->e%2==0).map(e -> e*2).collect(Collectors.toList());
        
        System.out.println("Result = " + res.toString());

        // TryStream emp1 = new TryStream(1, "Omar", 25, 1000);
        // TryStream emp2 = new TryStream(2, "Ali", 27, 2000);
        // TryStream emp3 = new TryStream(3, "Amr", 23, 3000);
        // TryStream emp4 = new TryStream(4, "Amr", 23, 4000);
        // List<TryStream> arr = Arrays.asList(emp1, emp2, emp3, emp4);
        // Map<String, List<TryStream>> company = new HashMap<>();
        // company.put("Sales", Arrays.asList(emp1, emp2));
        // company.put("HR", Arrays.asList(emp3, emp4));

        // List<TryStream> res = arr.stream().sorted((e1, e2) -> e1.name.compareTo(e2.name)).collect(Collectors.toList());

        // res.forEach((e) -> System.out.println("Name : " + e.name + " Salary " + e.salary));

        // company.values()
        // .stream()
        // .flatMap(List::stream)
        // .filter(e -> e.age > 23)
        // .forEach(e -> System.out.println("Name : " + e.name + " Age : " + e.age));
        // Map<String, TryStream> result = new HashMap<>();

        // company.forEach((k, v) -> {
        // TryStream emp = v.stream()
        // .max(Comparator.comparingDouble(TryStream::getSalary))
        // .orElse(null);

        // result.put(k, emp);
        // });

        // result.forEach((k, v) -> System.out.println(k + " " + v.name));

        // Stream st = Stream.of(company);
        // String[] ls = (String[]) st.peek(e -> e.toString()).toArray();
        // // Stream st = Stream.of(arr);

        // // long c = st.filter(e -> e.name.length() == 3).count();
        // // double c = arr.stream().filter(e -> e.name.length() == 3).mapToDouble(e ->
        // // e.salary).sum();
        // double c = arr.stream().filter(e -> e.name == "Amr").mapToDouble(e ->
        // e.salary).max().getAsDouble();
        // long c1 = arr.stream().map(e -> e.name).distinct().count();
        // // Optional c = st.filter(e -> ((String) e).length() > 3).findFirst();

        // System.out.println(c);
        // System.out.println(c1);




    }
}
