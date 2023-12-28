package com.neotric.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class InMemory {
    static Predicate<Student> countrypredicate = (Student) -> Student.getCountry().equals("india");

    public List <Student>getCurrentStudent() {


        List<Student> names = new ArrayList<Student>();
        Student s = new Student("india", "appu");
        Student s1 = new Student("us", "chandu");
        Student s2 = new Student("india", "sravs");
        Student s3 = new Student("pakisthan", "shiva");
        names.add(s);
        names.add(s1);
        names.add(s2);
        names.add(s3);
        List<Student> streamsamecountryStudents = names.stream()
                .filter(name -> countrypredicate.test(name))
                .collect(Collectors.toList());
        System.out.println("stream same country students" + streamsamecountryStudents);
             return streamsamecountryStudents;
    }
}






