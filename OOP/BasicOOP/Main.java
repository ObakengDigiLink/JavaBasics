public class Main {
    public static void main(String[] args) {
        
        Person person = new Person();
        String name = "Peter", city = "Lisbon";
        int age = 22;

        person.setName(name);
        person.setAge(age);
        person.setCity(city);

        person.speaking();
        System.out.println();

        //or you can use getters to display the same code
        System.out.println("Hello my name is "+person.getName());
        System.out.println("I am "+ person.getAge()+ " years old");
        System.out.println("I am from "+ person.getCity());
    }
}

