public class cat extends  Animal{
    cat(){
        setKind();
    }
    public void test(){
        eat("面包");
        sleep();
    }

    public static void main(String[] args) {
        Animal s = new Animal();
        s.setKind();
        s.getKind();
        s.getweight();
        s.eat("面包");
        s.sleep();
        s.cachRat();
        cat x = new cat();
        x.test();
     }
}
