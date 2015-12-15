
public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	int outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;

	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber != null) {
			if (simMobileNumber.length() == 10 && simMobileNumber.startsWith("08")) {
				this.simMobileNumber = simMobileNumber;
				this.hasSimCard = true;
			}
		}

	}

	void removeSimCard() {
		this.hasSimCard = false;
		this.simMobileNumber = "";
	}

	void call(GSM reciever, int duration) {
		if ((reciever != null) && (reciever.hasSimCard)) {
			if (duration > 0 && duration <= 60) {
				if (this.hasSimCard && this.simMobileNumber.equalsIgnoreCase(reciever.simMobileNumber)) {
					if (this != reciever) {
						Call newCall = new Call();
						newCall.caller = this;
						newCall.reciever = reciever;
						newCall.duration = duration;
						this.lastOutgoingCall = newCall;
						reciever.lastIncomingCall = newCall;
						this.outgoingCallsDuration += duration;

					}
				}
			}
		}
	}

	double getSumForCalls() {
		// return this.outgoingCallsDuration*new Call().priceForaMinute; i tova
		// stava
		if (lastOutgoingCall == null) {
			return 0.0;
		}
		return this.outgoingCallsDuration * this.lastOutgoingCall.priceForaMinute;
	}

	void printInfoForCall(Call call) {
		if (call != null) {
			System.out.println(call.caller.simMobileNumber + " se obajda na " + 
						call.reciever.simMobileNumber
					+ " za tolkova vreme " + call.duration);
		}
	}

	void printInfoForLastIncomingCall() {
		printInfoForCall(lastIncomingCall);
	}

	void printInfoForLastOutgoingCall() {
		printInfoForCall(lastOutgoingCall);
	}

}
