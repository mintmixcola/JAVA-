public class Tomato implements plant {
    public void eatable(){
        System.out.println("Tomato");
    }

    public static void main(String[] args) {
        Tomato a = new Tomato();
        a.eatable();
    }
}
