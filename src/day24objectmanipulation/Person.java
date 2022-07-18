package day24objectmanipulation;

public class Person {

    String name;
    String lastname;

    public Person(){
    }

    public Person(String name, String lastname){
        this.name = name;
        this.lastname = lastname;
    }

    public static void main(String[] args) {
//     datatype  name        constructor
        Person person1 = new Person();
        System.out.println(person1.name);//null
        System.out.println(person1.lastname);//null


        Person person2 = new Person("Orcun","Kadioglu");
        System.out.println(person2.name);//Orcun
        System.out.println(person2.lastname);//Kadioglu











    }


}
