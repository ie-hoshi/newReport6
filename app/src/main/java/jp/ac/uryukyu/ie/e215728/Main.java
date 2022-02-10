package jp.ac.uryukyu.ie.e215728;

import java.util.Scanner;

import jp.ac.uryukyu.ie.e215728.config.StartConfig;
import jp.ac.uryukyu.ie.e215728.middleware.CheckInputValue;
import jp.ac.uryukyu.ie.e215728.model.ReverseOsero;
import jp.ac.uryukyu.ie.e215728.view.ShowBoard;


public class Main {
    /**
     * ○×ゲームの情報
     */
    public static String circle = "○";
    public static String cross = "×";
    /**
     * ボードの情報
     */
    public static String board[][] = new String[4][4];

    private static int inputX;
    private static int inputY;

    //入力値を一時保存する
    static String x = "0";
    static String y = "0";


    public static void main(String[] args) {
        /**
         * インスタンスの生成
         */
        StartConfig SC = new StartConfig();
        ShowBoard SB = new ShowBoard();
        Scanner sc = new Scanner(System.in);
        ReverseOsero RO = new ReverseOsero();
        CheckInputValue CIV = new CheckInputValue();

        System.out.println("○×ゲームを開始します");
        /**
         * ボードに初期値をセットする
         */
        SC.boardInitValue();
        SC.boardSetup();
        /**
         * ボードを表示する
         */
        SB.showBoard(board);

        while(true){
            /**
             * ターンを変える処理
             */
            String next_storn = circle;
            circle = cross;
            cross = next_storn;
            System.out.println(next_storn + "のターンです");
            /**
             * x座標を入力する処理
             */
            System.out.println("横の座標を1~3の半角数字で入力してください");
            x = sc.next();
            if(CIV.checkInt1_3(x)) {
                inputX = Integer.parseInt(x);
            }else {
                System.out.println("!!!!!!!!!!その値は無効です!!!!!!!!!!");
                System.out.println("1~3の半角数字を入力してください");
            }

            /**
             * Y座標を入力する処理
             */
            System.out.println("縦の座標を1~3の半角数字で入力してください");
            y = sc.next();
            if(CIV.checkInt1_3(y)) {
                inputY = Integer.parseInt(y);
            }else {
                System.out.println("!!!!!!!!!!その値は無効です!!!!!!!!!!");
                System.out.println("1~3の半角数字を入力してください");
                sc.close();
            }
        

        /**
         * 入力した座標にオセロを置く
         */
        RO.putOsero(inputX, inputY);

        /**
         * ボードを表示する
         */
        SB.showBoard(board);
        }
    }
}