
package testcollections;        //ALT + INSERT a getter,setter beszúrás
import java.util.Comparator;    //12. Lambda és Comparator

public class Person {
    
    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    
     @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name=" + name + '}';
    }
    
   /* public static Comparator<Person> NameComparator = new Comparator<Person>{}) {
    @Override
    public int compare(Person p1, Person p2) {
        String PersonName1 = p1.getName();
        String PersonName2 = p2.getName();
        
        return PersonName1.compareTo(PersonName2);
        
    });*/
    
}

    
  