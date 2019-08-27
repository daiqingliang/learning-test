package com.daiql.learning.arraylist;

/**
 * Author daiql
 * Date 2019/8/26 14:04
 * Description 测试 System.arrayCopy()是浅拷贝，
 */
public class SystemArrayCopyIsShallowCopy {
    public static void main(String[] args) {
        Student grade = new Student("One");
        Person person = new Person("tom", 18);
        person.grade = grade;
        Person[] people1 = new Person[10];
        people1[0] = person;
        Person[] people2 = new Person[10];
        System.arraycopy(people1, 0, people2, 0, 1);
        System.out.println("people1.grade = " + people1[0].getGrade().grade);
        System.out.println("people2.grade = " + people2[0].getGrade().getGrade());
        grade.setGrade("two");
        System.out.println("people1.grade = " + people1[0].getGrade().grade);
        System.out.println("people2.grade = " + people2[0].getGrade().getGrade());
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
    }
}
