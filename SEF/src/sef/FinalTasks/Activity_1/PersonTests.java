package sef.FinalTasks.Activity_1;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class PersonTests {

    @Test(expected =  StringContainsNumberException.class)
    public void stringContainNumberExceptionIncorrectObjectTest() {
           Person person = new Person("1", 18);
           String name = person.getName();
    }

    @Test(expected =  StringContainsNumberException.class)
    public void stringContainNumberExceptionIncorrectSetNameTest() {
        Person person = new Person("Daniils", 18);
        person.setName("1");
    }

    @Test()
    public void nameTest() {
        Person p = new Person();
        p.setName("Danik");
        assertEquals("Danik", p.getName());
    }

    @Test()
    public void nameSurname() {
        Person p = new Person();
        p.setSurname("Milka");
        assertEquals("Milka", p.getSurname());
    }

    @Test()
    public void nameAge() {
        Person p = new Person();
        p.setAge(10);
        assertEquals(10, p.getAge());
    }

    @Test
    public void introduceTest() {
        Person p = new Person();
        p.setAge(20);
        p.setName("Danik");
        assertEquals("My name is Danik and I am 20 years old", p.introducePerson());
    }
}
