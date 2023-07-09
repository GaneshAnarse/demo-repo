public class Kingdom{
	private String name;
	
	public String getName(){
		return name;
	}
	
	public void setName(String N){
		this.name=N;
	}
	
}

class Ssp{
	
	public static void main(String []args){
		Kingdom obj = new Kingdom();
		obj.setName("Saurabh S Patil");
		System.out.println("Print the name "+getName());
		
	}
}