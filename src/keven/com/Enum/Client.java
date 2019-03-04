package keven.com.Enum;

import java.util.ArrayList;

/**
 * author:81486
 * Data:2019/1/29 15:58
 * Description:
 */
public class Client {
    public static void main(String[] args) {
       int tmp = Operator.ADD.calculate(1,2);
        System.out.println(""+tmp);
        System.out.println(""+Operator.ADD.getOperator());
        System.out.println(""+Operator.valueOf("ADD").getOperator());
        System.out.println(""+Operator.values()[0].getOperator());
    }

    ArrayList list = new ArrayList();




}
