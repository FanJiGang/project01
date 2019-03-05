package cn.tedu.demo01;

public class ParamTest {
    public static void main(String[] args) {

        int a=1;
        int b=100;
        String s="你们好！";
        int[] arr={1,2,3,4,5,6};
//      changeInt(a,b);
//      System.out.println("a:"+a);
//      System.out.println("b:"+b);

        changeString(s,b,arr);
        System.out.println("s:"+s);
        System.out.println("b:"+b);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void changeInt(int a,int b){
        a++;
        b++;
        System.out.println("a++:"+a);
        System.out.println("b++:"+b);
    }

    public static void changeString(String s,int b,int[] arr){
        s+="小尾巴";
        b++;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+100;
        }
        System.out.println("s+:"+s);
        System.out.println("b++"+b);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
