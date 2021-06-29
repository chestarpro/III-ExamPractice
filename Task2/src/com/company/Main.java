package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Person> persons = new LinkedList<>();

        addPerson(persons, new Person("Баланчаев", "Баланча", "Баланчаевич"));
        addPerson(persons, new Person("Баланчаев", "Баланча", "Баланчаевич"));
        addPerson(persons, new Person("Иванов", "Иван", "Иванович"));
        addPerson(persons, new Person("Айтматов", "Чынгыз", "Торекулович"));
        addPerson(persons, new Person("Путын", "Владымыр", "Владымыровыч"));
        addPerson(persons, new Person("Путын", "Владымыр", "Владымыровыч"));

        System.out.println(persons);
    }

    public static void addPerson(LinkedList<Person> persons, Person person) {
        try {
            for (Person value : persons) {
                if (value.equals(person)) throw new Exception("Человек №" + value.getId() +
                        " и " + "Человек №" + person.getId() + " идентичны!\n");
            }
            persons.add(person);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
