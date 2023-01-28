public class ChildrenPhone extends Teleophone{
    ChildrenPhone(){

    }
    public  void point(){
        System.out.println("儿童手机");
    }
    public  void call(){
        System.out.println("一键拨通父母电话");
    }

    public static void main(String[] args) {
        ChildrenPhone a = new ChildrenPhone();
        a.call();
        a.point();
    }
}
