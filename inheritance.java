class A{
    void s(){
        System.out.println("I am Uday");
    }
}
class B extends A{
    void k(){
        System.out.println("I am partha");
    }
}
public class inheritance {
    public static void main(String[] args) {
        A ob1 = new A();
        ob1.s();
        B ob2 = new B();
        ob2.k();
        
    }
}