import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetClassNumber() {
        int a = this.getClassNumber();
        if (a >= 45) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

