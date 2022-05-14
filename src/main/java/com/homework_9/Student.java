package com.homework_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student {
   String name;
   Course[] courses;

   public Student(String name, Course[] courses) {
      this.name = name;
      this.courses = courses;
   }

   @Override
   public String toString(){
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Student: " + name + ", ");
      stringBuilder.append("Course: " + Arrays.toString(courses));
      return stringBuilder.toString();
   }
}
