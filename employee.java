public class employee {

    int id;

    int salary;

    String ceo;

    public  void show(){

        System.out.println(id + " : " + salary + " : " + ceo );
    }
    public static void main(String[] args) {


        employee charels = new employee();
        charels.id=4562;
        charels.salary=6000;
        charels.ceo="scott";



        employee matt = new employee();

        matt.id=9890;
        matt.salary=7000;
        matt.ceo= "scott"; //once declared static we can now use the class name since : we dont need the object name

//        matt.ceo = "Smith";

       charels.show();
        matt.show();


    }
}






