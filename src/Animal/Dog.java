package Animal;

public class Dog extends Animal {

        @Override
        public void doVoice() {
            super.doVoice();
            System.out.println("Hello i`m Dog");

        }

    @Override
    public int getbill() {
            int bill = super.getbill() * 10;
        return bill;
    }

    public void setLeg () {

    }
}
