package inheritance_demo;

public class WhatsAppV2 extends WhatsAppV1{

	public void voiceCalling() {
		System.out.println("Voice calling feature from V2");
	}
	
	public void groupMessages() {
		
		System.out.println("Group Messages feature from V2");
	}

	public WhatsAppV2() {
		System.out.println("v2");
	}
	
}
