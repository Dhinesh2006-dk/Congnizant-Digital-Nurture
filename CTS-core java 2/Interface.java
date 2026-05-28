interface Playable {
    void play(); 
}
class Guitar implements Playable{
    public void play(){
            System.out.println("Guitar");
        }
}
class Piano implements Playable{
    public void play(){
        System.out.println("Piano");
    }
}
public class Interface {
    public static void main(String[] args) {
        Guitar g1=new Guitar();
        g1.play();
        Piano p1=new Piano();
        p1.play();
    }
}
