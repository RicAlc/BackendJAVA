public class Comic extends Thread{
    public static void main(String[] args) {
        Comic h1 = new Comic();
        h1.start();


    }

    @Override
    public void run() {
        Screen page  = new Screen();
        Screen page2 = new Screen();
        page.setBounds(660, 0, 600, 1000);
        page.setVisible(true);
        for (int i = 1; i <=12; i++){
            try{
                page.showImage("comic"+ i + ".JPG");


//                System.out.println(i);
                Thread.sleep(500);


            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }

    }

}
