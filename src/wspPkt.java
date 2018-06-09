import java.util.Scanner;

public class wspPkt {

    public static void main(String[] args) {
        Scanner wspol = new Scanner(System.in);
        System.out.println("Podaj X");
        int wspX = wspol.nextInt();
        System.out.println("Podaj Y");
        int wspY = wspol.nextInt();
        wspol.close();


        if (wspX > 0 && wspY > 0) {
            System.out.printf(("Punkt (%d,%d) leży w I ćwiartce układu współrzędnych."), wspX, wspY);
        } else if (wspX < 0 && wspY > 0) {
            System.out.printf(("Punkt (%d,%d) leży w II ćwiartce układu współrzędnych."), wspX, wspY);
        } else if (wspX > 0 && wspY < 0) {
            System.out.printf(("Punkt (%d,%d) leży w IV ćwiartce układu współrzędnych."), wspX, wspY);
        } else if (wspX < 0 && wspY < 0) {
            System.out.printf(("Punkt (%d,%d) leży w III ćwiartce układu współrzędnych."), wspX, wspY);
        } else if (wspX == 0 && wspY == 0) {
            System.out.printf(("Punkt (%d,%d) leży na początku układu współrzędnych."), wspX, wspY);
        }

    }
}

