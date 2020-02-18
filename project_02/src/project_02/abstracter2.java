package project_02;

public class abstracter2 extends abstracter {
	
		public void second()
		{
			System.out.println("class2 has provided the body");
		}
		
	public static void main(String[] args) {
		abstracter2 obj=new abstracter2();
        obj.first();
        obj.second();
        abstracter2.thrid(); //static method call we can call but not create method in child
	
	
	}   
}
