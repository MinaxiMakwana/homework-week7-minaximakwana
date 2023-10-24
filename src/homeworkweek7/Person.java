package homeworkweek7;

public class Person {
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args) {
    Person obj = new Person();
    String firstName = obj.getFirstName();
    System.out.println(firstName);

    Person obj1 = new Person();
    String lastName = obj1.getLastName();
    System.out.println(lastName);

    Person obj2 = new Person();
    int age = obj2.getAge();
    System.out.println(age);

    }
    public String getFirstName() {
    return firstName;
    }
    public String getLastName(){
    return lastName;
    }

    public int getAge(){
    return age;
    }

    public String setFirstName(String name){
        return firstName = name;
    }

    public String setLastName(String name){
        return lastName = name;
    }

    public int setAge(int age){
        return age = age;
    }

}

