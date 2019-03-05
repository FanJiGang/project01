package cn.tedu.demo01;

public class HuiWenTest {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 10000; i < 100000; i++) {
            int ge=i%10;
            int shi=i/10%10;
            int qian=i/1000%10;
            int wan=i/10000%10;
            if(ge*ge*ge == wan*wan*wan && shi*shi*shi == qian*qian*qian){
                sum++;
                System.out.println(i);
            }
        }
        System.out.println("sum:"+sum);

    }
}
