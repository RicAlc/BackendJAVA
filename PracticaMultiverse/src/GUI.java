public class GUI {
    public static void main(String[] args) {
        String option;
        Dialog d1 = new Dialog();
        Screen screen1 =  new Screen();
        screen1.setBounds(0, 0, 1820, 1000);
        screen1.setVisible(true);
        screen1.out("Bienvenido al Spiderverse \n");
        screen1.showImage("spiderverse.jpg");
        option = d1.readString("¿Cuál SpiderHeroe quieres usar? \n1)Miles \n2)Silk \n3)2099");
        if (option.charAt(0)=='1'){
            SpiderMiles p1 = new SpiderMiles();
            p1.Combo();
        }else if (option.charAt(0)=='2'){
            SpiderSilk p2 = new SpiderSilk();
            p2.Combo();
        }else if (option.charAt(0)=='3'){
            Spider2099 p3 = new Spider2099();
            p3.Combo();
        }else{
            d1.display("Error elige una opción valida");
        }

    }
}
