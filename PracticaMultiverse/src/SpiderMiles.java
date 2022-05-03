public class SpiderMiles extends Spiderhero implements SpiderMilesPowers {
    boolean SuperRegeneracion = true;

    public SpiderMiles(String name, String file, int fuerza, int resistencia, int inteligencia) {
        super(name, file, fuerza, resistencia, inteligencia);
    }

    @Override
    public void run() {
        spider.setTitle(name);
        spider.changeStyle("Georgia bold", 20, Colors.PrestigeBlue);
        spider.out("\n\n!" + name + " Ataca!");
        try{
            Thread.sleep(1500);
            Camuflaje();
            Thread.sleep(1000);
            ElectroShock();
            Thread.sleep(1000);
            ElectroGolpe();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

    }

    public void Camuflaje() {
        spider.out("\nMiles se ha hecho invisible y ataca por sorpresa\n");
        System.out.println("Miles se ha hecho invisible y ataca por sorpresa");
    }

    public void ElectroShock() {
        spider.out("Miles lanza un rayo eléctrico\n");
        System.out.println("Miles lanza un rayo eléctrico");
    }

    public void ElectroGolpe() {
        spider.out("Miles da un golpe eléctrico\n");
        System.out.println("Miles da un golpe eléctrico");
    }
}
