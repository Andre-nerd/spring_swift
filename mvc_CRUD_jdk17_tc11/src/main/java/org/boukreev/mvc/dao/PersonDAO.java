package org.boukreev.mvc.dao;

import org.boukreev.mvc.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT,"John"));
        people.add(new Person(++PEOPLE_COUNT,"Marry"));
        people.add(new Person(++PEOPLE_COUNT,"Smith"));
        people.add(new Person(++PEOPLE_COUNT,"Mercedes"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream().filter(p -> p.getId() == id).findAny().orElse(null);
    }
}
