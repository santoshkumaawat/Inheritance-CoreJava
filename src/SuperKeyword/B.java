package SuperKeyword;

public class B extends A {

    int data = 200;

    void display() {
        message();
        super.message();
        int data = 300;
        System.out.println(data);   //local
        System.out.println(this.data);  //instance
        System.out.println(super.data); //parent class
    }
    
    @Override
    void message(){
        System.out.println("Hello message from B");
    }

    public static void main(String[] args) {
        B ob = new B();
        ob.display();
    }
}
