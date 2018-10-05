package person.classes;

import person.Interfaces.Learner;

public class Student extends Person implements Learner {

   double totalStudytime;

    public Student(long id ) {
        super(id);

    }


    public void  learn(double nuberOfHours) {

      nuberOfHours =  nuberOfHours + totalStudytime;

    }




    public double getTotalStudytime() {

    return totalStudytime;

    }



    public void setTotalStudytime(String study){

                this.setTotalStudytime(study);
    }





}
