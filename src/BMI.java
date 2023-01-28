import java.util.Scanner;

public class BMI {
        public static void main(String[] args) {
            for(int i=0;i<20;i++) {
                double bmi;
                System.out.println("体重单位：千克\n身高单位:米\n性别0-男，1-女");
                System.out.println("请输入您的性别：");
                Scanner sc=new Scanner(System.in);
                int s = sc.nextInt();
                System.out.println("请输入您的体重：");
                Scanner rw = new Scanner(System.in);
                double w = rw.nextDouble();
                System.out.println("请输入您的身高：");
                Scanner rh=new Scanner(System.in);
                double h=rh.nextDouble();
                bmi=w/h/h;
                if(s == 0) {
                    if (bmi <= 20) {
                        System.out.println("您的体重过轻");
                        System.out.println("bmi值为:" + bmi);
                    }
                    else if (bmi >= 20 && bmi < 25) {
                        System.out.println("您的体重适中");
                    }
                    else if (bmi >= 25 && bmi < 30) {
                        System.out.println("您的体重过重");
                        System.out.println("bmi值为:" + bmi);
                    }
                    else if (bmi >= 30 && bmi < 35) {
                        System.out.println("您的体重肥胖");
                        System.out.println("bmi值为:" + bmi);
                    }
                    else if (bmi > 35) {
                        System.out.println("您的体重非常肥胖");
                        System.out.println("bmi值为:" + bmi);
                    }
                    else{
                        System.out.println("输入不合法，请重新输入");
                    }


                }
                else if(s == 1){
                    if (bmi <= 19) {
                        System.out.println("您的体重过轻");
                        System.out.println("bmi值为:" + bmi);
                    }
                    else if (bmi >= 19 && bmi < 24) {
                        System.out.println("您的体重适中");
                    }
                    else if (bmi >= 24 && bmi < 29) {
                        System.out.println("您的体重过重");
                        System.out.println("bmi值为:" + bmi);
                    }
                    else if (bmi >= 29 && bmi < 34) {
                        System.out.println("您的体重肥胖");
                        System.out.println("bmi值为:" + bmi);
                    }
                    else if (bmi > 34) {
                        System.out.println("您的体重非常肥胖");
                        System.out.println("bmi值为:" + bmi);
                    }
                    else{
                        System.out.println("输入不合法，请重新输入");
                    }

                }

            }
        }
    }


