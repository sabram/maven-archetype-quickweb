package $package;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
		App app = new App();
        System.out.println(app.getMsg());
    }

	public String getMsg() {
		return "Hello World!";
	}
}
