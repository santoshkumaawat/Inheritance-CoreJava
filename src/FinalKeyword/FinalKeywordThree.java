package FinalKeyword;

//class for testing inherit class which is declaring final
public final class FinalKeywordThree {

    void show() {
        System.out.println("Hello from show in the class FinalKeywordThree");
    }
}

class Test {

    public static void main(String[] args) {
        FinalKeywordThree ob = new FinalKeywordThree();
        ob.show();
    }
}
