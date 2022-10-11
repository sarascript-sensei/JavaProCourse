package Lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ClassWork {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        // add() - добавление элементов
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        animals.add(2, "Elephant");
        System.out.println(animals);

        List<Integer> first = new ArrayList<>();
        first.add(2);
        first.add(3);
        first.add(5);
        first.add(7);
        first.add(11);
        System.out.println(first);

        List<Integer> second = new ArrayList<>(first);
        second.add(13);
        second.add(17);
        second.add(19);
        second.add(23);
        second.add(29);
        second.add(40);

        first.addAll(second);
        System.out.println(first);

        //isEmpty - пустой ли List
        //size - размер List
        //get - по индексу получить доступ к элементу
        //set - обновление элемента по индексу

        List<String> topCompanies = new ArrayList<>();
        System.out.println("Является ли topCompanies пустым? :" + topCompanies.isEmpty());
        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        System.out.println("Всего топовых компаний: " + topCompanies.size());
        System.out.println(topCompanies);

        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company: " + lastCompany);

        //Удаление

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Python");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Языки программирования: " + programmingLanguages);
        programmingLanguages.remove(5);
        System.out.println("После удаления 5 элемента: " + programmingLanguages);

        boolean isRemoved = programmingLanguages.remove("Kotlinq");
        System.out.println("После удаления Kotlin: " + programmingLanguages);
        System.out.println("Удален ли Котлин?"+isRemoved);

        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println(programmingLanguages);

        programmingLanguages.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("C");
            }
        });
        System.out.println("Удаление всех элементов, начинающихся на C: " + programmingLanguages);

        programmingLanguages.clear();
        System.out.println("После удаления: " + programmingLanguages);

        //contains() - содержится ли в данном ArrayList определенный элемент
        //indexOf() - индекс первого повторяющегося элемента
        //lastIndexOf() - индекс последнего повторяющегося элемента

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bill");
        names.add("Steve");
        names.add("John");
        names.add("Andrew");
        names.add("Steve");
        names.add("John");

        System.out.println("Содержится ли в справочнике Bob?:" +names.contains("Bob"));
        System.out.println("Индекс элемента Steve" + names.indexOf("Steve"));
        System.out.println("Индекс элемента Mark" + names.indexOf("Mark"));

        System.out.println("Индекс последнего элемента John " + names.lastIndexOf("John"));


        //
    }
}
