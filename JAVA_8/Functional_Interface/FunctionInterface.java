package JAVA_8.Functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

//function is done some work , it returned a result
public class FunctionInterface {
    public static void main(String[] args) {
        Function<String, Integer> fun1 = (s) -> s.length();
        Function<String, String> fun2 = (s1) -> s1.substring(0, 3);
        Function<List<Student>, List<Student>> fun3 = (s) -> {
            List<Student> result = new ArrayList<>();
            for (Student i : s) {
                if (fun2.apply(i.getName()).equalsIgnoreCase("avi")) {
                    result.add(i);
                }
            }
            return result;
        };


        Student s1 = new Student(2, "Avinash");
        Student s2 = new Student(2, "avi");
        Student s3 = new Student(2, "mahesh");
        List<Student> list = Arrays.asList(s1, s2, s3);

        List<Student> filteredStudent =fun3.apply(list);
        System.out.println(filteredStudent);
    }
//        System.out.println(fun1.apply("Avinash"));
//        System.out.println(fun2.apply("AVINASH"));

    private static  class Student{
        private int id;
        private String name;

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
