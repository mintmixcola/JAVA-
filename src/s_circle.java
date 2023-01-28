public class s_circle extends CIRCLE {
    int r;
    public  s_circle(int r){
        this.r = r;
    }
    public void area(){
        int r=2;
        double s;
        s = 3.14 *r*r;
        System.out.println("圆的面积为："+s);
    }
}
