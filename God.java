public class God {

	public static God instance = null;
	
	private God(){}
	
	public static God getInstance(){
		if(instance == null);
			instance = new God();
		return instance; 
	}
	
	public void sayHelloToMankind(){
		System.out.println("Hello Humans");
	}

}
