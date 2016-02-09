package generics;

/**
 * Created by yshybeka on 2/9/2016.
 */
public class BaseEntity implements BaseInterface {

    public void test() {
        System.out.println("Testing base");
    }

    public void test(int i) {
        System.out.println("Testing base int " + i);
    }
}
