public class ElderPhone extends Teleophone {
    ElderPhone(){

    }
    public  void point(){
        System.out.println("老人手机");
    }
    public  void call(){
        System.out.println("一键拨通子女电话");
    }

    public static void main(String[] args) {
        ElderPhone a = new ElderPhone();
        a.call();
        a.point();
    }
}
