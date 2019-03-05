package cn.tedu.demo02;

public class RecurrenceDemo {
    public static void main(String[] args) {
        System.out.println(recurrence(36));
    }

    public static int recurrence(int month){
        if(month==1 ||month==2){
            return 1;
        }
        return recurrence(month-1)+ recurrence(month-2);
    }
}
