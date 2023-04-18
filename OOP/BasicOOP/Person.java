public class Person {
    private String name;
    private int age;
    private String city;

    //Setters
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }

    //Getters
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }

    //other methods
    public void speaking(){
        System.out.println("hello my name is "+ name);
        System.out.println("I am "+ age + " years old");
        System.out.println("I am from "+ city);
    }

}

