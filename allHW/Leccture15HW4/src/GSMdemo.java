
public class GSMdemo {
	public static void main(String[] args) {
		GSM motorola = new GSM();
		GSM nokia = new GSM();

		nokia.insertSimCard("0883131929");
		motorola.insertSimCard("0899546234");
		nokia.call(motorola, 2);
		nokia.printInfoForLastOutgoingCall();
		System.out.println(nokia.getSumForCalls());
	}

}
