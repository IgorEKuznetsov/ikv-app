package com.homework_9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Student> s = Arrays.asList(
                new Student("Ivan", new Course[]{new Course("Math"), new Course("Java")}),
                new Student("Pavel", new Course[]{new Course("Math"), new Course("CSS")}),
                new Student("Andrey", new Course[]{new Course("Music"), new Course("Biology"), new Course("BigData")}),
                new Student("Masha", new Course[]{new Course("Art"), new Course("CSS"), new Course("SQL"), new Course("JavaScript")}),
                new Student("Vera", new Course[]{new Course("Biology"), new Course("Math"), new Course("SQL"), new Course("Music")}));

        System.out.println("All: " + s);

        List<List<Course>> allCourses = s.stream()
                .map(student -> Arrays.asList(student.courses))
                .collect(Collectors.toList());
        List<Course> flatMappedCourses = allCourses.stream()
                .flatMap(element -> element.stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println("All courses: " + flatMappedCourses);

        List<String> interestingList = s.stream()
                .filter(student -> Arrays.stream(student.courses).count() >= 3)
                .map(student -> student.name)
                .collect(Collectors.toList());
        System.out.println("The most inquisitive students: " + interestingList);

        Course course1 = new Course("Math");
        System.out.println("The " + course1 + " course visit: " + showStudentsMatchCourse(s, course1));
    }

    public static List<String> showStudentsMatchCourse(List<Student> studentList, Course course) {
        return studentList.stream()
                .filter(student -> Arrays.toString(student.courses).contains(course.getName()))
                .map(student -> student.name)
                .collect(Collectors.toList());

    }
}
