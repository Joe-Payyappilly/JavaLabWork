public class Supermarket 
{
// Data Members
private String employeeName;
public int age;


public void display() //Method to display
{
System.out.println(employeeName);
System.out.println(age);
}

public static void main(String args[])
{
Supermarket obj1=new Supermarket();
obj1.display();// compiler will create a default constructor

// Constructor overloading
Product product1=new Product();
Product product2=new Product("Milk");
Product product3=new Product("Milk",10);
product1.dis();
product2.dis();
product3.dis();


System.out.println(product1.discount(1));
System.out.println(product1.discount(1,2));
System.out.println(product1.discount(1.1));


}

}