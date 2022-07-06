package com.company.behavioral.Iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String []skills = {"Java", "String", "Hibernate", "Maven", "PostgreSQL"};
        JavaDeveloper javaDeveloper = new JavaDeveloper("Syrym Khakimzhan", skills);
        Iterator iterator = javaDeveloper.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}
