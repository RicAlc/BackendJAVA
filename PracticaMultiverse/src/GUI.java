public class GUI {
    public static void main(String[] args) {
        String option;
        Dialog d1 = new Dialog();
        Screen screen1 =  new Screen("SPIDERVERSE");
        screen1.setBounds(0, 0, 800, 750);
        screen1.setVisible(true);
        screen1.out("Bienvenido al ","Impact", 35, Colors.BalticSea);
        screen1.out("Spider","Impact", 35, Colors.Desire);
        screen1.out("verse","Impact", 35, Colors.RoyalBlue);
        screen1.showImage("spiderverse.jpg");
        option = d1.readString("¿Cuál SpiderHeroe quieres usar? \n1)Miles \n2)Silk \n3)2099");

        if (option.charAt(0)=='1'){
            SpiderMiles P1 = new SpiderMiles("Miles Morales", "miles.jpg", 80, 70, 75);
            P1.Presentacion();
            P1.start();
        }else if (option.charAt(0)=='2'){
            SpiderSilk P1 = new SpiderSilk("Cindy Moon", "silk.jpg",85, 80, 85);
            P1.Presentacion();
            P1.start();
        }else if (option.charAt(0)=='3'){
            Spider2099 P1 = new Spider2099("Miguel O'Hara", "spiderman2099.jpg",90,80, 90);
            P1.Presentacion();
            P1.start();
        }else{
            d1.display("Error elige una opción valida");
        }

    }
}
