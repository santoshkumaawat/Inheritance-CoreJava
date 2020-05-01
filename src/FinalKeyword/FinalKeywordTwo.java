package FinalKeyword;

//class for testing override final method 
public class FinalKeywordTwo extends FinalKeywordOne {

    /*@Override
     public void add(int a, int b) {
     System.out.println(a + b);
     }*/
    
    //overload is possible
    public void add(int a) {
        System.out.println("Add From FinalKeywordTwo : " + a);
    }

    public static void main(String[] args) {
        FinalKeywordTwo ob = new FinalKeywordTwo();
        ob.add(10, 20);
        ob.add(20);
    }
}
