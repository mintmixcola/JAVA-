public class Grass implements plant {
    public void eatable(){
        System.out.println("Grass");
    }

    public static void main(String[] args) {
        Grass a = new Grass();
        a.eatable();
    }
}
