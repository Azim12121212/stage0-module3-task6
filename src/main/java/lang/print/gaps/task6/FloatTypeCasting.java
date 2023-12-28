package lang.print.gaps.task6;

public class FloatTypeCasting {
    public static void roundNumber(float numberToBeRounded) {
        int result = Math.round(numberToBeRounded);
        System.out.println(result);
    }
    public static void main(String[] args) {
        roundNumber(33.51f);
    }
}
