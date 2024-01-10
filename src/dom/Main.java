package dom;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean p = true;
        System.out.println("Allowed operations: +,-,/,*");
        System.out.println("type \"exit\" if you want to exit");
        while (p) {
            System.out.println("specify operation: ");
            String op = scanner.next();
            if (op.equals("exit")){
                p = false;
            }else if (validate(op)) {
                System.out.println("result: "+ calc(op, scanner));
            }else{
                System.out.println("operation not valid");
            }
        }
    }
    public static float calc(String op,Scanner sc){
        float result = 0;
        System.out.println("input first number: ");
        int first = sc.nextInt();
        System.out.println("input second number: ");
        int second = sc.nextInt();
        switch(op){
            case("+"):
                result = first + second;
                break;
            case("-"):
                result = first - second;
                break;
            case("*"):
                result = first * second;
                break;
            case("/"):
                result = (float) first / second;
                break;
        }
        return result;
    }
    public static boolean validate(String op){
        String[] allowed = {"+","-","/","*"};
        boolean res = false;
        int iteration = 0;
        for (String s : allowed) {
            if (op.equals(s)) {
                res = true;
            }
            iteration++;
        }
        return (res);
    }
}