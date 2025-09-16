package JAVA_8.Stream.AssignmentCode;
//2	Group The employees By Department Names

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class employee{

    private String name;
    private String dep_name;
    private int emp_id;
    private int age;

    public employee(String name, String dep_name, int emp_id,int age) {
        this.name = name;
        this.dep_name = dep_name;
        this.emp_id = emp_id;
        this.age= age;
    }
    public String getName() {
        return name;
    }

    public String getDep_name() {
        return dep_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class AssignmentStream {
    public static void main(String[] args) {
        employee emp = new employee("Avinash","mech",1,23);
        employee emp2 = new employee("Avi","Entc",2,22);
        employee emp3 = new employee("mahesh","comp",3,25);
        employee emp4 = new employee("anil","mech",4,28);
        employee emp5 = new employee("vishal","comp",5,24);
        employee emp6 = new employee("rohit","comp",6,30);

        List<employee> listOfEmp = Arrays.asList(emp,emp2,emp3,emp4,emp5,emp6);
       // System.out.println(listOfEmp);

        //1	Find list of employees whose name starts with alphabet A
        System.out.println("list of employee start with A: ");
        List<employee> startWithA = listOfEmp.stream().filter(s->s.getName().toUpperCase().startsWith("A")).collect(Collectors.toList());
        System.out.println(startWithA);

        //2	Group The employees By Department Names
        System.out.println("Employee grouped by their department: ");
        Map<String,List<employee>> em= listOfEmp.stream().collect(Collectors.groupingBy(e->e.getDep_name()));
        em.forEach((dept, empList) ->
                System.out.println(dept + " -> " + empList));

        //3	Find the total count of employees using stream
        System.out.println("Total count of employee: "+ listOfEmp.stream().count());

        //4	Find the max age of employees
        System.out.println("Max age of employee is : "+listOfEmp.stream().mapToInt((a)->a.getAge()).max());

        //5	Find all department names
        List<String> dep_name = listOfEmp.stream().map(e->e.getDep_name()).distinct().collect(Collectors.toList());
        System.out.println("Department name: "+dep_name);

        //6	Find the count of employee in each department
        Map<String,Long> countOfEmpInDep = listOfEmp.stream().collect(Collectors.groupingBy(s->s.getDep_name(),Collectors.counting()));
        System.out.println("Emp present in each department: "+countOfEmpInDep);

        //7	Find the list of employees whose age is less than 30
        List<employee> AgeLessThan30 = listOfEmp.stream().filter(s->s.getAge()<30).collect(Collectors.toList());
        System.out.println("employee whoes age is  less than 30: "+AgeLessThan30);

        //8	Find the list of employees whose age is in between 26 and 31
        List<employee> AgeBetween26to31 = listOfEmp.stream().filter(s->s.getAge()<31&&s.getAge()>26).collect(Collectors.toList());
        System.out.println("employee whoes age is  between 26 and 31 : "+AgeBetween26to31);

        //9.find department who is having maximum number of employee
       // List<employee> maxEmpDep_name = listOfEmp.stream().collect()).

    }
}
