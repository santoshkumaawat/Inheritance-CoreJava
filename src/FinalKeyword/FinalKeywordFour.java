package FinalKeyword;

//class for final keyword with Parameter of method
public class FinalKeywordFour {

    public static void add(final int a, final int b) {
        //a++; //cant change final parameter
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        FinalKeywordFour ob = new FinalKeywordFour();
        ob.add(10, 20);
    }
}
