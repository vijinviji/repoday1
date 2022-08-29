package overloading;

public class Family {
	//same method 
	//same class
	//diff arguments>>>>>>>overloading method
	//parameter passing value change (diff datatype using)

	private void talkingStyle(int age,String   appa ) {
		System.out.println("age is "+ age );
		System.out.println(" speak care-"+appa);
	}
	
	private void talkingStyle(String Partner,int age) {
		System.out.println("he is speak love-"+Partner);
		System.out.println("age is "+ age);
	}
	
	private void talkingStyle(String  Friends) {
		System.out.println("always speak fun-"+Friends);
	}
	
	
	public static void main(String[] args) {
		
	Family talk = new Family() ;
	talk.talkingStyle(45, "appa");
	talk.talkingStyle("partner", 23);
	talk.talkingStyle("friends");
		
	
	
	
	
	
	
	
	
	
	
	
}}
