package person.classes;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



        People peeps = new People();

        Person per1 = new Person(5688);

        Person per2 = new Person(4567);

        Person per3 = new Person(2354);


        per1.setName("Jonaa");

        per2.setName("Black Surgar");

        per3.setName("Crab Cake");


        per1.getname();

        per2.getname();

        per3. getname();

        peeps.add(per1);

        peeps.remove(per1);

        peeps.finfById(5688);

        peeps.add(per2);

        peeps.getCount();

        peeps.remove(5688);

        peeps.getCount();

        peeps.removeAll();

        Student stu1 = new Student(54567);

        stu1.getTotalStudytime();

        Instructor Charels = new Instructor(27283 );

        Student stu2  = new Student(734836);

        Student stu3 = new Student(948595);

        Student[] kitkat = {stu2,stu3};











    }
}
