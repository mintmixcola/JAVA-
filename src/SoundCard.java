//符合PCI标准的声卡，即实现了PCI接口
 class SoundCard implements PCI{
    String name = "Soundmax";
     public void setName(String s){//实现接口中的抽象方法
         name = s;
     }
     public void run(){//实现接口中的抽象方法
         System.out.println(name+"声卡已开始工作");
     }
}
