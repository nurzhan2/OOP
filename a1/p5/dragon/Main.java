package dragon;

public class Main {

    public static void main(String[] args) {

        DragonLaunch d = new DragonLaunch();

        d.kidnap(new Person("A", Gender.BOY));
        d.kidnap(new Person("B", Gender.GIRL));
        d.kidnap(new Person("C", Gender.BOY));
        d.kidnap(new Person("D", Gender.GIRL));

        if (d.willDragonEatOrNot())
            System.out.println("Dragon will eat ");
        else
            System.out.println("Nobody left ");
    }
}
