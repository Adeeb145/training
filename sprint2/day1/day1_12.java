interface D {
    default void foo() {
        System.out.println("D.foo");
    }
}
class C implements D {
    @Override
    public void foo() {
        System.out.println("C.foo");
        D.super.foo();
    }
}
public class day1_12 {
    public static void main(String[] args) {
        C c = new C();
        c.foo();
    }
}
