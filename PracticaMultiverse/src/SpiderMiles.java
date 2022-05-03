public class SpiderMiles extends Spiderhero implements SpiderMilesPowers {
    boolean SuperRegeneracion = true;
    Screen screen2 = new Screen();
    String img = "miles.jpg";
    public void Combo(){
        screen2.setBounds(0, 0, 1820, 1000);
        screen2.setVisible(true);
        screen2.out("Miles Morales\n");
        screen2.showImage(img);
        Camuflaje();
        ElectroShock();
        ElectroGolpe();

    }

    public void Camuflaje() {
        screen2.out("\nMiles se ha hecho invisible y ataca por sorpresa\n");
        System.out.println("Miles se ha hecho invisible y ataca por sorpresa");
    }

    public void ElectroShock() {
        screen2.out("Miles lanza un rayo eléctrico\n");
        System.out.println("Miles lanza un rayo eléctrico");
    }

    public void ElectroGolpe() {
        screen2.out("Miles da un golpe eléctrico\n");
        System.out.println("Miles da un golpe eléctrico");
    }
}
