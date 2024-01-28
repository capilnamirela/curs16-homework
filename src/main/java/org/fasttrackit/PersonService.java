package org.fasttrackit;

import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class PersonService {

    private List<Person> personService;

    public static List<String> firstNameLastName(List<Person> personService) {
        List<String> firstNameLastName = personService.stream()
                .map(person -> person.firstName() + " " + person.lastName())
                .toList();
        return firstNameLastName;

    }

    public static List<Person> allMajorPersons(List<Person> personService) {
        return personService.stream()
                .filter(person -> person.age() > 18)
                .toList();
    }

    public static List<Person> personsFromOradea(List<Person> personService) {
        return personService.stream()
                .filter(person -> person.city().equals("Oradea"))
                .toList();
    }

    public static List<Person> personsFromOradeaCluj(List<Person> personService) {
        return personService.stream()
                .filter(person -> person.city().equals("Oradea") || person.city().equals("Cluj"))
                .toList();
    }

    public static List<String> firstNameCapitalized(List<Person> personService) {
        List<String> capitalizedNames = personService.stream()
                .map(Person::firstName)
                .map(String::toUpperCase)
                .toList();
        return capitalizedNames;
    }

    public static List<String> firstNameFirstLetterFromLastName(List<Person> personService) {
        List<String> firstNameFirstLetter = personService.stream()
                .map(person -> person.firstName() + " " + person.lastName().charAt(0) + ".")
                .toList();
        return firstNameFirstLetter;

    }

    public static List<Person> firstNameStratingWithA(List<Person> personService) {
        List<Person> firstNameA = personService.stream()
                .filter(person -> person.firstName().startsWith("A"))
                .toList();
        return firstNameA;
    }

    public static Set<String> firstNameUniquely(List<Person> personService) {
        Set<String> uniqueNames = personService.stream()
                .map(Person::firstName)
                .collect(Collectors.toSet());
        return uniqueNames;
    }

    public static List<Person> sortByFirstName(List<Person> personService) {
        List<Person> sortByFirstName = personService.stream()
                .sorted(Comparator.comparing(Person::firstName))
                .toList();
        return sortByFirstName;
    }

    public static List<Person> sortByLastName(List<Person> personService) {
        List<Person> sortByLastName = personService.stream()
                .sorted(Comparator.comparing(Person::lastName))
                .toList();
        return sortByLastName;
    }

    public static List<Person> sortByFirstNameLastNameAge(List<Person> personService) {
        List<Person> sortByFirstNameLastNameAge = personService.stream()
                .sorted(Comparator.comparing(Person::firstName)
                        .thenComparing(Person :: lastName).
                        thenComparing(Person :: age))
               .toList();
        return sortByFirstNameLastNameAge;
    }

}
