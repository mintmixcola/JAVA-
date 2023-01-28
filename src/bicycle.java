public class bicycle extends vehical{
    bicycle(){
        num_avi = 1;
        num_whe = 2;
        energy = "人力";
    }
    public void run(){
        System.out.println("bicycle有"+num_whe+"个轮胎，可载"+num_avi+"个人,能源是"+energy);
        System.out.println("bicycle跑起来了");
        return;
    }
    public void speed_up(){
        System.out.println("bicycle加速很慢");
        return;
    }
    public void brake(){
        System.out.println("bicycle刹车不太灵敏");
        return;
    }

    public static void main(String[] args) {
        bicycle a = new bicycle();
        a.run();
        a.speed_up();
        a.brake();
    }
}
