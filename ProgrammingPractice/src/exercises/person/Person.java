package exercises.person;

public class Person implements Comparable<Person>{
    private String lastName;
    private String firstName;

    public Person (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    public int compareTo  (Person o) {

         if (lastName.equals(o.getLastName())) {
             return firstName.compareTo(o.getFirstName());
         } else {
             return lastName.compareTo(o.getLastName());
         }
    }

    public static void main (String[] args) {
        Person pete = new Person("Peter", "Lane");
        Person mary = new Person("Mary", "Lane");
        Person lana = new Person("Lana", "Abbott");

        System.out.println(pete.compareTo(lana));
        System.out.println(lana.compareTo(mary));
        System.out.println(pete.compareTo(mary));
    }
}
