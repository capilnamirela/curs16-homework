package org.fasttrackit;

import java.util.ArrayList;
import java.util.List;

import static org.fasttrackit.PersonService.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Andrei", "Popescu", 22, "Oradea"));
        personList.add(new Person("Andrei", "Ionescu", 15, "Oradea"));
        personList.add(new Person("Alexandra", "Popa", 25, "Cluj"));
        personList.add(new Person("Cristina", "Dumitru", 32, "Brasov"));
        personList.add(new Person("George", "Dobre", 17, "Cluj"));
        personList.add(new Person("Alexandra", "Popa", 15, "Oradea"));

        System.out.println(personList);
        System.out.println("First and last name: " + firstNameLastName(personList));
        System.out.println("All major persons: " + allMajorPersons(personList));
        System.out.println("Persons from Oradea: " + personsFromOradea(personList));
        System.out.println("Persons from Oradea and Cluj: " + personsFromOradeaCluj(personList));
        System.out.println("First names capitalized: " + firstNameCapitalized(personList));
        System.out.println("First name + first letter from last name: " + firstNameFirstLetterFromLastName(personList));
        System.out.println("Persons with first names starting with A: " + firstNameStratingWithA(personList));
        System.out.println("First names uniquely: " + firstNameUniquely(personList));
        System.out.println("Sort by first name: " + sortByFirstName(personList));
        System.out.println("Sort by last name: " + sortByLastName(personList));
        System.out.println("Sort by first name, last name, age: " + sortByFirstNameLastNameAge(personList));

    }
}