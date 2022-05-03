public class Spiderhero extends Thread {

    Screen spider =  new Screen();
    String img = "spiderman.jpg",
           name = "Peter Parker";
    boolean SuperFuerza = true,
            EscalarMuros = true,
            SuperReflejos = true,
            SentidoAracnido = true;

    int fuerza, resistencia, inteligencia;

    public  Spiderhero(String name, String file, int fuerza, int resistencia, int inteligencia){
        this.name = name;
        this.img = file;
        this.fuerza = fuerza;
        this.resistencia = resistencia;
        this.inteligencia = inteligencia;
    }

    public void Presentacion(){
        spider.setBounds(800, 0, 800, 1000);
        spider.setVisible(true);
        if(name == "Miles Morales"){
            spider.out("Miles", "Impact", 35, Colors.BalticSea);
            spider.out("Morales", "Impact", 35, Colors.Desire);
        }
        if(name == "Cindy Moon"){
            spider.out("Cindy", "Impact", 35, Colors.BalticSea);
            spider.out("Moon", "Impact", 35, Colors.Innuendo);
        }
        if(name == "Miguel O'Hara"){
            spider.out("Miguel", "Impact", 35, Colors.PrestigeBlue);
            spider.out("0'Hara", "Impact", 35, Colors.red);
        }
        spider.showImage(img);
        spider.changeStyle("Georgia", 20, Colors.GloomyPurple);
        spider.out("\nEstadisticas");
        spider.out("\nFuerza:" + fuerza +
                        "\nResitencia:" + resistencia +
                        "\nInteligencia:" + inteligencia );
    }
    public void Combo(){
        Ataque1();
        Ataque2();
        Ataque3();
    }

    private void Ataque1() {
        spider.out("Spiderman realiza un ataque");
    }

    private void Ataque2() {
        spider.out("Spiderman realiza un ataque");
    }

    private void Ataque3() {
        spider.out("Spiderman realiza un ataque");
    }

    void Saludo() {
        System.out.println("Hola soy un superheroe");
    }
}
