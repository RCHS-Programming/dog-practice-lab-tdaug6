//(c) A+ Computer Science
//www.apluscompsci.com

public class Dog
{
  private int age;
  private String name;
	
  public Dog( String n )  
  {
    age = 1;
    name = n;
  }
  
  public Dog( String n, int a )  
  {
    age = a;
    name = n;
  }
  
  public void increaseAgeByOne()
  {
  	 age++;
  }
  
  public int getDogYears( int scale )
  {
  	 int dogYears = scale * 7;
  	 return dogYears;
  }
	
  public int getAge()    {
    return age;
  }
	
  public String getName()    {
    return name;
  }
	
//   public String toString()    {
//     return "Dog - " + name + " " + age;
//   }
}
