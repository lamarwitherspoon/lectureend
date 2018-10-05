package person.classes;

public class Person {

final long id;

private People name;







    public Person(long id ) {
        this.id = id;

    }

public long getId(){

        return id;
    }

public People getname(){

        return this.name;
}

public void setName(String vaule){


}


public  void findid(){

    System.out.println(" Your ID is " + id);
}

}
