//集成PCI接口的主板
class Mainboard {
    //usePCICard方法用来向主板插入一块PCI卡
    public void usePCICard(PCI p){//参数p就是一个PCI卡
        p.run();
    }
    public void run(){
        System.out.println("主板已开始工作");
    }
}
