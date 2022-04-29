import java.io.Closeable;

public class Comic extends Thread{
    public static void main(String[] args) {
        Comic h1 = new Comic();
        h1.start();


    }

    @Override
    public void run() {

        Screen page  = new Screen();
        page.setBounds(660, 0, 640, 1010);
        page.setVisible(true);
        for (int i = 1; i <=12; i++){
            try{
                if (i >2){
                    page.setBounds(660, 0, 600, 810);
                }
                page.showImage("comic"+ i + ".JPG");
                System.out.println(i);


                Thread.sleep(10000);
                if (i != 12){
                    page.cls();
                }
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
        Thread.interrupted();
    }

}
