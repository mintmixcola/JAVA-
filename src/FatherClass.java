abstract class FatherClass {
    FatherClass(){
        System.out.println("父类的无参构造方法");
    }

    FatherClass(int i,int j){//带参构造方法
        System.out.println("父类的带参构造方法，i="+i+"j="+j);

    }
    abstract void test();

}
