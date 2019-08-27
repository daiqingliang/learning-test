package com.daiql.learning.arraylist;

import java.util.ArrayList;

/**
 * Author daiql
 * Date 2019/8/27 16:33
 * Description 证明ArrayList.clone()是浅拷贝
 */
public class ArrayListCloneIsShallowCopy {
    public static void main(String[] args) {
        ArrayList<Person> people1 = new ArrayList<>();
        Person person = new Person("tom", 18);
        Student grade = new Student("One");
        person.setGrade(grade);
        people1.add(person);
        ArrayList<Person> people2 = (ArrayList<Person>) people1.clone();
        System.out.println(people1.toString());
        System.out.println(people2.toString());
        grade.setGrade("two");
        System.out.println(people1.toString());
        System.out.println(people2.toString());

    }

    private static class Student {
        private String grade;
        public Student() {}
        public Student(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "grade='" + grade + '\'' +
                    '}';
        }
    }

    private static class Person {
        private String name;
        private int age;
        private Student grade;

        public Person() {}

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Student getGrade() {
            return grade;
        }

        public void setGrade(Student grade) {
            this.grade = grade;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", grade=" + grade +
                    '}';
        }
    }
}
