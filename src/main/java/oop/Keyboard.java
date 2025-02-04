package oop;

import java.util.Objects;

public class Keyboard {

    private String color;
    private String layout;
    private boolean light;
    private String connection;

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

    public String getColor() {
        return color;
    }

    public String getLayout() {
        return layout;
    }

    public String getConnection() {
        return connection;
    }

    public boolean isLight() {
        return light;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public void setLight(boolean light) {
        this.light = light;
    }

    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Keyboard keyboard = (Keyboard) o;
        return light == keyboard.light && Objects.equals(color, keyboard.color) && Objects.equals(layout, keyboard.layout) && Objects.equals(connection, keyboard.connection);
    }

    public int hashCode() {
        return Objects.hash(color, layout, light, connection);
    }

    public String toString() {
        return "oop.Keyboard{" +
               "color='" + color + '\'' +
               ", layout='" + layout + '\'' +
               ", light=" + light +
               ", connection='" + connection + '\'' +
               '}';
    }
}
