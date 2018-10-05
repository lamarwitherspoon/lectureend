package person.classes;

import java.util.ArrayList;

public class People {


    private Person person;

    ArrayList<Person> body = new ArrayList<Person>();

        public  void add(Person P){

            body.add(P);
        }

        public void finfById (long id){

            for ( Person p: body) {

                person.findid();
            }
        }


            public void remove(long i){

                if( person.id == i){

                    body.remove(person);
                }
            }


            public void remove(Person P){

            if (person == P)

                body.remove(P);

            }

             public void removeAll(){

                body.clear();

            }


            public int getCount(){

            return body.size();
            }









}
