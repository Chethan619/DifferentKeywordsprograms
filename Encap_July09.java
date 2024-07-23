package july08programs;
class auth
{
	private int age=18;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
public class Encap_July09 
{
    public static void main(String[] args) 
    {
    	auth a1=new auth();
    	a1.setAge(12);
    	System.out.println(a1.getAge());
	}
}
