package cn.tedu.demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<String> pokers= createPokers();
        Collections.shuffle(pokers);

        List<String> player1=new ArrayList<String>();
        List<String> player2=new ArrayList<String>();
        List<String> player3=new ArrayList<String>();

        deal(pokers, player1, player2, player3);
        System.out.println("------------------------");
        System.out.println("player1的牌:"+player1.size());
        for (String s : player1) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("------------------------");
        System.out.println("player1的牌:"+player2.size());
        for (String s : player2) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("------------------------");
        System.out.println("player3的牌:"+player3.size());
        for (String s : player3) {
            System.out.print(s+" ");
        }


    }

    /*
     * 发牌
     */
    private static void deal(List<String> pokers, List<String> player1, List<String> player2, List<String> player3) {
        for (int i=3;i<pokers.size();i++) {
            if(i%3==0){
                player1.add(pokers.get(i));
            }else if(i%3==1){
                player2.add(pokers.get(i));
            }else if(i%3==2){
                player3.add(pokers.get(i));
            }
        }
        int rand=(int)(Math.random()*3);
        switch (rand){
            case 0:
                landlord(pokers, player1);
                break;
            case 1:
                landlord(pokers, player2);
                break;
            case 2:
                landlord(pokers, player3);
                break;
            default:
                System.out.println("发牌出错了!");
        }
    }

    /*
     * 发地主牌
     */
    private static void landlord(List<String> pokers, List<String> player) {
        for (int i = 0; i < 3; i++) {
            player.add(pokers.get(i));
        }
    }

    /*
     * 创建扑克牌
     */
    private static List<String> createPokers() {
        String[] color={"黑桃","红桃","梅花","方块"};
        String[] number={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        List<String> pokers=new ArrayList<String>();
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < number.length; j++) {
                pokers.add(color[i]+number[j]);
            }
        }
        pokers.add("大王");
        pokers.add("小王");
        //System.out.println(poker.size());
        return pokers;
    }
}
