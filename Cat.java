import java.util.Scanner;

public class Cat {
    
    public static void main(String[] args) {
        //Integer legs;
        String name;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the name of your cat: ");
        name = in.nextString();
        //legs = 4;

        System.out.println(name);

        System.exit(0);

    }

    public static void Meow() {
        System.out.println("Meooowwww");
        System.exit(0);
    }

}
