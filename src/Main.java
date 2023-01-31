import java.util.Scanner;

public class Main{
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int count = 0;
        for(int i = 0; i < x.length() / 2; i++){
            if(x.charAt(i) == x.charAt(x.length()-i-1)){
                count++;
            }
        }
        if(count == x.length()/2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }

    public static void task2(){
        Scanner scanner = new Scanner(System.in);
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        String x = scanner.nextLine();
        for(int i =0; i<x.length(); i++){
            if(x.charAt(i) != 40 || x.charAt(i) != 41 || x.charAt(i) != 91 || x.charAt(i) != 93 || x.charAt(i) != 123 || x.charAt(i) != 125){
                count1  = 100;
                break;
            }
            if(x.charAt(i) == 40){
                count1 ++;
            }
            if(x.charAt(i) == 41 && count1 > 0){
                count1 --;
            }
            if(x.charAt(i) == 91){
                count2 ++;
            }
            if(x.charAt(i) == 93 && count2 > 0){
                count2 --;
            }
            if(x.charAt(i) == 123){
                count3 ++;
            }
            if(x.charAt(i) == 125 && count3 > 0){
                count3 --;
            }
        }
        if(count1 == 0 && count2 == 0 && count3 == 0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    public static void main(String[] args){
        task1();
        task2();
    }
}