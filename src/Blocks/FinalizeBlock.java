package Blocks;

public class FinalizeBlock {
	
	
	//finalize() method is coming from Object Class
	//Object is the super class of all classes
	@Override
	public void finalize() {
		System.out.println("I'm into FinalizeBlock finalize method");
		
	}
	
	

	public static void main(String[] args) {
		
		FinalizeBlock obj = new FinalizeBlock();
		 obj = null;
		Hello h = new Hello();
		h = null;
		System.gc();//calling gc
		System.out.println("end of program");
		

	}

}
