/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment2;
import java.util.*;


/**
 *
 * @author ahmed
 */
public class Q4 {
        public static double findAvg(List<Integer> numbers)

{

return numbers.stream().mapToDouble(val -> Math.pow(val, 3)).filter(val -> val > 500).average()

.getAsDouble();

}

 

public static void main(String[] args)

{

List<Integer> numbers = new ArrayList<>();

numbers.add(10);

numbers.add(9);

numbers.add(5);

numbers.add(2);

numbers.add(1);

System.out.println(findAvg(numbers));
                }
}
