public class dog extends Animal {
    dog(){
        setKind();
    }
    public int eat(String see) {
        System.out.println(kind + "喜欢看" + see);
        return 1;
    }
    public void test(){
        eat("面包");
        sleep();
    }

    public static void main(String[] args) {
        dog c = new dog();
        c.test();
    }
}
