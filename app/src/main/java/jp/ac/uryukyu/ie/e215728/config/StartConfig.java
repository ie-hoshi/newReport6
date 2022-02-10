package jp.ac.uryukyu.ie.e215728.config;

import jp.ac.uryukyu.ie.e215728.Main;

public class StartConfig {
    /**
     * ボードに初期値「半角スペース」を設定する
     */
    public void boardInitValue() {
        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                Main.board[i][j] = " ";
            }
        }
    }

    public void boardSetup() {
        for(int i=1; i<4; i++) {
            /**
             * x軸に数字を並べる
             */
            Main.board[0][i] = String.valueOf(i);
            /**
             * y軸に数字を並べる
             */
            Main.board[i][0] = String.valueOf(i);
        }
    }
}
