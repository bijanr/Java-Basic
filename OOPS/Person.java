package OOPS;

public class Person {
    String name;
    int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String Name()
    {
        return name;
    }
    public int Age()
    {
        return age;
    }





    public static void main(String[] args) {
    

        Person p1=new Person("Bijan",52); 
        Person p2=new Person("Batman",40);
        System.out.println(p1.Name()+" "+p1.Age());
        System.out.println(p2.Name()+" "+p2.Age());
        

    }
}
