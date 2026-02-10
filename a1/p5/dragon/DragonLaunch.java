package dragon;

import java.util.Vector;

public class DragonLaunch {

    private Vector<Person> kidnapped;

    public DragonLaunch() {
        kidnapped = new Vector<>();
    }

    // добавить человека
    public void kidnap(Person p) {
        kidnapped.add(p);
    }

    // главный метод
    public boolean willDragonEatOrNot() {

        int boys = 0;
        int girls = 0;

        for (Person p : kidnapped) {

            if (p.getGender() == Gender.BOY) {
                boys++;
            }
            else {
                if (boys > 0) {
                    boys--;   // пара BG исчезла
                }
                else {
                    girls++;
                }
            }
        }

        return boys + girls > 0;
    }
}
