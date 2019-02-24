package javaapplication1;

/**
 *
 * @author Admin
 */
public class Person {
    private static int id;
    private String name;
    private String add;
    private int age;

    public static void increase(){
        id++;   
          
    }
    public Person() {
        name = "";
        add = "";
        age = 0;
        id = 0;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public Person(String name, String add , int age){
        this.name = name;
        this.add = add;
        this.age = age;
    
    }
    
    
    void hienThi() {
        System.out.println("Ten: " + name + ",Dia chi: " + add + ",Tuoi :" + age);

    }

    public static void main(String[] args) {
        Person p1 = new Person("Nguyen Duy Toi","Hollywold",50);
        p1.hienThi();
        p1.setName("Tran Hai Yen");
        p1.hienThi();

    }

}
