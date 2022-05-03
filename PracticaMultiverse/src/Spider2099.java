public class Spider2099 extends Spiderhero implements Spider2099Powers{
    boolean SuperRegeneracion = true;
    boolean SuperVision = true;
    String img = "spiderman2099.jpg";
    Screen screen2 = new Screen();

    public void Combo(){
        screen2.setBounds(0, 0, 1820, 1000);
        screen2.setVisible(true);
        screen2.out("Spider-man 2099 \n");
        screen2.showImage(img);
        GolpeDesgarrador();
        MordidaVeneno();
        Rasguno();

    }
    public void GolpeDesgarrador() {
        screen2.out("\nMiguel golpea con el antebrazo\n");
        System.out.println("Miguel golpea con el antebrazo");

    }

    public void MordidaVeneno() {
        screen2.out("Miguel muerde al enemigo con un veneno paralizado\n");
        System.out.println("Miguel muerde al enemigo con un veneno paralizador");

    }

    @Override
    public void Rasguno() {
        screen2.out("Miguel ataca con las garras de sus manos\n");
        System.out.println("Miguel ataca con las garras de sus manos");
    }
}
