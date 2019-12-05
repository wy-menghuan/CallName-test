package com.itcast;

import java.util.Random;
import java.util.Scanner;

public class CallName {

    public static void main(String[] args) {

        /*String[] names={"张三","王五","里斯","约翰","小月","大四"};

        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);

        }

        System.out.println("=================");

        Random ran=new Random();

        int index=ran.nextInt(names.length);

        System.out.println(names[index]);*/

       // System.out.println(getNumber());

        //printRect(3,5);

       /* int a=1;
        int b=2;
        int z;
        z=change(a,b);
        System.out.println(a);//1
        System.out.println(b);//2

        System.out.println(z);*/

       /*String[] names=new String[7];

       addStudent(names);

       printStudent(names);

       String name=randomStudent(names);

       System.out.println(name);*/

       //使用数组,保存商品的信息
        //品名,尺寸,价格,库存数, 定义5个数组
        String[] brand = {"MacBookAir","ThinkpadT450"};
        double[] size = {13.3,15.6};
        double[] price = {9998.97,6789.56};
        int[] count = {0,0};

        while (true){

            int choose=chooseFunction();

            switch (choose){

                case 1:
                    printStore(brand,size,price,count);
                break;

                case 2:
                    update(brand,count);
                break;

                case 3:
                    return ;


                default:
                    System.out.println("没有这个功能");
                    break;



            }




        }



    }

    public static  int getNumber(){

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        return number;
    }

    public static void printRect(int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println("*");
            }
            //System.out.println();
        }

    }

    public static int change(int a,int b){

        a=a+b;//3
        b=b+a;//5
        int z=a+b;//8
        return z;
    }

    public static String randomStudent(String[] names){

        Random ra=new Random();
        int index=ra.nextInt(names.length);
        return names[index];
    }


    public static void printStudent(String[] names){
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }


    }



    public static void addStudent(String[] names){

        names[0]="张三";
        names[1]="王五";
        names[2]="里斯";
        names[3]="大约";
        names[4]="里斯数量";
        names[5]="试试看";
        names[6]="网速";

    }

    public static void update(String[] brand,int[] count){

        Scanner sc = new Scanner(System.in);
        //遍历数组
        for(int i = 0; i < brand.length ; i++){
            System.out.println("请输入"+brand[i]+"的库存数");
            //键盘输入,录入库存, 存储到库存的数组中
            int newCount = sc.nextInt();
            count[i] = newCount;
        }
    }


    public static void printStore(String[] brand,double[] size,double[] price,int[] count){

        System.out.println("----------商场库存清单----------");
        System.out.println("品牌型号     尺寸    价格    库存数");

        int totalCount=0;
        int totalPrice=0;

        for(int i=0;i<brand.length;i++){
            System.out.println(brand[i]+" "+size[i]+" "+price[i]+" "+count[i]+" ");
            totalCount +=count[i];
            totalPrice +=count[i]*price[i];
        }

        System.out.println("总库存数: "+totalCount);
        System.out.println("商品库存总金额: "+totalPrice);


    }



    public static int chooseFunction(){
        System.out.println("-------------库存管理------------");
        System.out.println("1.查看库存清单");
        System.out.println("2.修改商品库存数量");
        System.out.println("3.退出");
        System.out.println("请输入要执行的操作序号：");

        Scanner sc=new Scanner(System.in);

       int chooseNumber= sc.nextInt();
       return chooseNumber;

    }






}
