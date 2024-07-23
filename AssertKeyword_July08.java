package july08programs;

public class AssertKeyword_July08 
{
  /* public static void main(String[] args) // this is something we generally do
  {
	int a=10;
	int b=20;
	assert a>5;
	int sum=a+b;
	System.out.println(sum);
  } */
  
  /* public static void main(String[] args) // syntax -> assert condition;
  {
	int a=10;
	int b=20;
	assert a>15;
	int sum=a+b;
	System.out.println(sum);
  } */
  
  public static void main(String[] args) // syntax -> assert condition:"Your Message";
  {
	int a=10;
	int b=20;
	assert a>15:"The condition is wrong";
	int sum=a+b;
	System.out.println(sum);
  }
}   