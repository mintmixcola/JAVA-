public class AnonymousInnerClassDemo{//测试类
    void  go(FatherInterface i){//待测试方法
        i.test();
    }

    void go(FatherClass c){//待测试的重载版本
        c.test();
    }

    public static void main(String[] args) {
        AnonymousInnerClassDemo demo = new AnonymousInnerClassDemo();
        /*** 以下定义了3个匿名内部类（并分别将创建的对象作为GO方法的实参）***/
        System.out.println("匿名内部类1：");
        //方式1：实现FatherInterface接口（创建的匿名对象直接作为go方法的实参）
        demo.go(new FatherInterface() {
            @Override
            public void test() {//重写接口的test方法
                System.out.println("test1");
            }//重写test方法结束
        });

        System.out.println("匿名内部类2：");
        //方式2：继承FatherClass类并重写无参构造方法（创建的匿名对象直接作为go方法的实参）
        demo.go(new FatherClass() {
            @Override
            void test() {
                System.out.println("test2");
            }
        });

        System.out.println("匿名内部类3：");
        //方式3：继承FatherClass类并重写带参构造方法（创建的对象赋值给了OBJ）
        FatherClass obj = new FatherClass(10,20){
            public  void  test(){
                System.out.println("test3");
            }
        };

        demo.go(obj);//将匿名内部类的对象作为go方法的实参
    }
}
