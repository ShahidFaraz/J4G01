package Assignment5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class problem5{
 
public static void main(String [] a)  {
 
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
  System.out.println("Print odd numbers:");
condition(list, (n)-> n%2 == 1 );
  }
 
public static void condition(List<Integer> list, Predicate<Integer> predicate) {
for(Integer n: list)  {
if(predicate.test(n)) {
System.out.println(n + " ");
}
}
}
}
