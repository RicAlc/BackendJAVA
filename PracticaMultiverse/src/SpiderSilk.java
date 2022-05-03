public class SpiderSilk extends Spiderhero implements SpiderSilkPowers{
    boolean superFlexibilidad = true;
    Screen screen2 = new Screen();
    String img  =  "silk.jpg";
    public void Combo(){
        screen2.setBounds(0, 0, 1820, 1000);
        screen2.setVisible(true);
        screen2.out("SpiderSilk \n");
        screen2.showImage(img);
        TrampaSeda();
        CorteTelarana();
        AtaqueRapido();
    }

    public void TrampaSeda() {
        System.out.println("Silk lanza una telaraña que inmobiliza a oponente");
        screen2.out("\nSilk lanza una telaraña que inmobiliza a oponente\n");
    }

    public void CorteTelarana() {
        screen2.out("Silk lanza una telaraña afilada\n");
        System.out.println("Silk lanza una telaraña afilada");
    }

    public void AtaqueRapido() {
        screen2.out("Silk se mueve a gran velocidad y golpea\n");
        System.out.println("Silk se mueve a gran velocidad y golpea");
    }
}
