package chris.lambda.cis2.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
 
public class Main2 
{
    public static void main(String[] args) 
    {
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(
                            new Employee(1, "A", 100),
                            new Employee(2, "A", 200),
                            new Employee(3, "B", 300),
                            new Employee(4, "B", 400),
                            new Employee(5, "C", 500),
                            new Employee(6, "C", 600),
        					new Employee(44, null, 600)));
         
        Map<String, List<Employee>> employeesMap = employeeList.stream()
        						.filter(doc -> doc.getName() != null)
                                .collect(Collectors.groupingBy(Employee::getName));
         
        System.out.println(employeesMap);
    }
}