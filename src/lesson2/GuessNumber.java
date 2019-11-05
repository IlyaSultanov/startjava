public class GuessNumber {

    private int mystery = (int) (Math.random()*100);

    public int getMystery() {
        return mystery;
    }

    public boolean check(int num) {
        return num == mystery;
    }
}
