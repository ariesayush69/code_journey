import java.util.*;

class fan {
    String colour, brand_name, type;
    int model;
    int flag = 1;

    void input() {
        System.out.println("Colour: " + colour);
        System.out.println("Brand name: " + brand_name);
        System.out.println("Type: " + type);
        System.out.println("Model: " + model);
    }

    boolean isRunning() {
        if (flag == 1) {
            System.out.println("running");
            return true;
        } else {
            System.out.println("not running");
            return false;
        }
    }

    void fanspeed(int speed) {
        System.out.println("Fan speed: " + speed);
    }
}

class light {
    String colour;
    int watt;

    void input() {
        System.out.println("Colour: " + colour);
        System.out.println("Watt: " + watt);
    }

    void turnOn() {
        System.out.println("Light is on");
    }
}

public class main
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        fan ob = new fan();
        System.out.print("Colour: ");
        ob.colour = kb.nextLine();

        System.out.print("Brand name: ");
        ob.brand_name = kb.nextLine();

        System.out.print("Type: ");
        ob.type = kb.nextLine();

        System.out.print("Model: ");
        ob.model = kb.nextInt();
        kb.nextLine(); // clear leftover newline

        ob.input();
        ob.isRunning();

        System.out.print("Enter fan speed: ");
        int sx = kb.nextInt();
        ob.fanspeed(sx);

        light l = new light();
        System.out.print("Light colour: ");
        l.colour = kb.nextLine();

        System.out.print("Light watt: ");
        l.watt = kb.nextInt();

        l.input();
        l.turnOn();
    }
}