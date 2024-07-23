package july08programs;
class Google 
{
	
}
public class Classtc_July09 extends Google //upcasting & downcasting concept
{
   public static void main(String[] args) 
   {
	   Google g1=new Classtc_July09(); // upcasting - converting child class object to super class type. This is implicit execution
	   Google g2=(Google) new Classtc_July09(); // upcasting - converting child class object to super class type. This is explicit execution
	   Classtc_July09 c1=(Classtc_July09) g1; // downcasting - converting super class type to child class object. This is explicit execution
   }
}
