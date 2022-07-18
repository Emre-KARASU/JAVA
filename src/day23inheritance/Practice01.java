package day23inheritance;

public class Practice01 {
    int a = 12;

    public void rest(){
        System.out.println("XXX");
    }
    public Practice01(){
        System.out.println("A");
    }
    public Practice01(int a){
        this();//By using "this();" you can do constructor call from inside class
        System.out.println("B");//"this();" must be the first statement in constructor body
                               //You can use just one constructor call in a constructor body
    }
}


class Practice02 extends Practice01{
    int a = 13;
    public void rest(){
        System.out.println("YYY");
    }
    public Practice02(){
        super(12);//super(); must be the first statement in the body
        System.out.println("C");//You can use just one super constructor call in a constructor body
    }
    public Practice02(int a){
        System.out.println("E");
    }
}

class Practice03 extends Practice02{
    int a = 14;
    public void rest(){
        System.out.println("ZZZ");
    }
    public Practice03(String s){
        super();
        System.out.println("D");
    }
}

class Runner{
    public static void main(String[] args) {
        Practice03 obj1 = new Practice03("Woow!");
        System.out.println(obj1.a);//14 ==> Java selects variables by looking at the data type of the object
//                                           If a class does not have "a" Java looks for "a" in parent classes
//                                           If there is no "a" in parent classes, it will give error

        obj1.rest();//ZZZ ==> Java selects methods by looking at the constructor of object


        Practice02 obj2 = new Practice03("Woow!");
        System.out.println(obj2.a);//13
        obj2.rest();

        Practice01 obj3 = new Practice03("Woow!");
        System.out.println(obj3.a);//12
        obj3.rest();


        Object obj4 = new Practice03("Woow!");
//When creating objects we can use parents class names for data types
    }
}