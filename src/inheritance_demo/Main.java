package inheritance_demo;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("From v2");// checking what methods are accessable
		WhatsAppV2 v2 = new WhatsAppV2();
		v2.textMessage();
		v2.voiceMessage();
		System.out.println("It gives the path... " +v2.getClass());
		System.out.println("It gives the unique id.. " +v2.hashCode());
		v2.groupMessages();
		v2.voiceCalling();
		System.out.println("From v3");
		WhatsAppV3 v3 = new WhatsAppV3();
		v3.textMessage();
		v3.voiceMessage();
		v3.voiceCalling();
		v3.groupMessages();
		v3.videoCalling();
		System.out.println("Path" +v3.getClass());
		System.out.println("Unique ID" +v3.hashCode());
	}

}
