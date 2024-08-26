class Computer {
    public void PlayMusic() {
        // implementation - perform some operastion
        System.out.println("Music Playing !!");
    }


    public String getPen(int cost){

        if(cost>5){
            return "Cello pen"+cost+"Rupees !";
        }
        else{
            return "Pens Unavailable";
        }
        
        
    }
}

public class Methods {

    public static void main(String args[]){
        Computer operation = new Computer();
        operation.PlayMusic();
        String str = operation.getPen(14);
        System.out.println(str);

    }

}
