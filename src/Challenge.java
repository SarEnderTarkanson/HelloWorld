public class Challenge  {
    public static void main(String[] args) {

        double myFirstVar = 20.00d;
        double mySecondVar = 80.00d;

        boolean isRemainder = ((((myFirstVar + mySecondVar) * 100.00d) % 40.00d)==0.00d) ? true: false;
        System.out.println(isRemainder);

        if (!isRemainder) {
            System.out.println("got some remainder");
        }
    }
}
