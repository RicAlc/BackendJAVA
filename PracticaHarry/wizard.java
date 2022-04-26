package PracticaHarry;

public class wizard {
    public String name, gender, house, boggart, patronus;

    //Getters
    public String getName (){ return name; }
    public String getGender (){ return gender; }
    public String getHouse (){ return house; }
    public String getBoggart (){ return boggart; }
    public String getPatronus (){ return patronus; }

    public boolean setName (String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }
    public boolean setGender (String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        }else
            return false;
    }
    public boolean setHouse (String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        }else
            return false;
    }
    public boolean setBoggart (String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }
    public boolean setPatronus (String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }
    public void  show(){
        System.out.println("A wizard is born!");
        System.out.println("Name: " + this.getName());
        System.out.println("Gender: " + this.getGender());
        System.out.println("House: " + this.getHouse());
        System.out.println("Patronus: " + this.getPatronus());
        System.out.println("Boggart: " + this.getBoggart());
    }
}
