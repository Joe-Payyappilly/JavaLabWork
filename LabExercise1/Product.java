public class Product
{
String name;// default access specifier
protected int price;

public Product()//constructor overloading 1
{
this.name="";
this.price=0;
}

public Product(String s)//constructor overloading 2
{
this.name=s;
}

public Product(String s,int p)//constructor overloading 2
{
this.name=s;
this.price=p;
}

public void dis()
{
System.out.println("Name of product "+name);
System.out.println("Price of product "+price);
}

//Method overloading
public int discount(int offer)
{
 return (offer);
}

public int discount(int offer,int coupon)
{
return (offer+coupon);
}

public double discount(double offer)
{
return (offer);
}

}