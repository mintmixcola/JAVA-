public class bus extends vehical {
     bus() {
        num_whe = 4;
        num_avi = 50;
        energy = "汽油";
    }
    public void run(){
        System.out.println("bus有"+num_whe+"个轮胎，可载"+num_avi+"个人,能源是"+energy);
        System.out.println("bus跑起来了");
        return;
    }
    public void speed_up(){
        System.out.println("bus加速很快");
        return;
    }
    public void brake(){
        System.out.println("bus刹车灵敏");
        return;
    }

    public static void main(String[] args) {
        bus a = new bus();
        a.run();
        a.speed_up();
        a.brake();
    }
}
