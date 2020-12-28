package Day_44_OOPpractice.CallCenter;

public class CallCenter {

	public static void main(String[] args) {

		WhatsApp wa = new WhatsApp();
		wa.launch();
		wa.allOSCompatible = true;
		wa.isFree = true;
		wa.name = "WhatsApp";
		wa.call("Ozzy");
		wa.sendMessage("Thank you");
		wa.videoCall();
		wa.accept();
		
		VoiceCallable.decline();
		System.out.println(VoiceCallable.CAN_CALL);
		
		wa.getCount();
		wa.setCount(4);
		
		
		VoiceCallable obj = new WhatsApp();
		
		obj = new WhatsApp2();
//		obj.launch();	// go to VoiceCallable and find launch method and run it
		
		((MessagingApp)obj).launch();
		((MessagingApp)obj).allOSCompatible = false;
		obj.call("Mr Tom");
		((VideoCallable)obj).videoCall();
		
		
		
		
	}

}
