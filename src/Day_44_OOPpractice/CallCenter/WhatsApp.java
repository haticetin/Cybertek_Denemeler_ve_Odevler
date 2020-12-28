package Day_44_OOPpractice.CallCenter;

public class WhatsApp extends MessagingApp implements VoiceCallable, VideoCallable{

	@Override
	public void videoCall() {
		System.out.println("Whatsapp - doing a video call Mr. Mike...");
	}

	@Override
	public void call(String contact) {
		System.out.println("Whatsapp - calling " + contact + "...");
	}

	@Override
	public void sendMessage(String msg) {
		System.out.println("Whatsapp - sending a message - " + msg + "...");
	}

//	default constructorla ayni olan constructor (no arg const.) var ise
//	 

	
}
