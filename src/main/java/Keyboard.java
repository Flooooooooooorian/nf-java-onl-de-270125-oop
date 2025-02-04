public class Keyboard {

    String color;
    String layout;
    boolean light;
    String connection;

    public Keyboard() {
    }

    public Keyboard(String keyboardColor) {
        color = keyboardColor;
    }

    public Keyboard(String keyboardColor, String keyboardLayout, boolean light, String connection) {
        color = keyboardColor;
        layout = keyboardLayout;
        this.light = light;
        this.connection = connection;
    }
}
