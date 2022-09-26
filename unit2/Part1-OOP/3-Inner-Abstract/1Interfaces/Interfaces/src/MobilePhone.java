public class MobilePhone implements ITelephone {

    // fields
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    // constructor
    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powering up");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is off");
        }
        System.out.println("Now ringing " + phoneNumber + " on mobile phone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn) {
            isRinging = true;
            System.out.println("Melody ring playing");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}

