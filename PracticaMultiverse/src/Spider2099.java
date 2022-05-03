public class Spider2099 extends Spiderhero implements Spider2099Powers{
    boolean SuperRegeneracion = true;
    boolean SuperVision = true;


    public Spider2099(String name, String file, int fuerza, int resistencia, int inteligencia) {
        super(name, file, fuerza, resistencia, inteligencia);
    }
    public void run() {
        spider.setTitle(name);
        spider.changeStyle("Georgia bold", 20, Colors.RoyalBlue);
        spider.out("\n\n!" + name + " Ataca!");
        try{
            Thread.sleep(1500);
            GolpeDesgarrador();
            Thread.sleep(1000);
            MordidaVeneno();
            Thread.sleep(1000);
            Rasguno();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

    }

    public void GolpeDesgarrador() {
        spider.out("\nMiguel golpea con el antebrazo\n");
        System.out.println("Miguel golpea con el antebrazo");

    }

    public void MordidaVeneno() {
        spider.out("Miguel muerde al enemigo con un veneno paralizado\n");
        System.out.println("Miguel muerde al enemigo con un veneno paralizador");

    }

    public void Rasguno() {
        spider.out("Miguel ataca con las garras de sus manos\n");
        System.out.println("Miguel ataca con las garras de sus manos");
    }
}
