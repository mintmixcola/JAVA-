//组装一台电脑
 class Computer {
    public static void main(String[] args) {
        Mainboard mb = new Mainboard();//选一块主板
        Network nc = new Network();//买一块网卡
        nc.setName("NEC");//这是一块NEC牌的网卡
        SoundCard sc = new SoundCard();//买了一块声卡
        mb.usePCICard(nc);//将网卡插到主板上
        mb.usePCICard(sc);//将声卡插到主板上
        mb.run();//主板运行

    }
}
