package $package;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void getMsg() {
		App app = new App();
        assertEquals("Hello World!", app.getMsg());
    }
}
