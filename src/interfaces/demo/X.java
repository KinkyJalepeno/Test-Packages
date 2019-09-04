package interfaces.demo;

public class X extends AbstractA implements A, B, C{

    @Override
    public void foo() {
        System.out.println("X: foo");
        System.out.println("VAL " + B.VAL);
    }

    @Override
    public void foobar() {

    }
}
