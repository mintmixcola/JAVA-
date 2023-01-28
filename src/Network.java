//符合PCI标准额网卡，即实现了PCI
 class Network implements PCI {
    String name;
    public Network(){
        name = "D-Link";
    }
    public void setName(String s){//实现接口中的抽象方法
        name = s;
    }
    public void run(){//实现接口中的抽象方法
        System.out.println(name+"网卡已开始工作");
    }

}
