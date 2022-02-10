package jp.ac.uryukyu.ie.e215728.model;

import jp.ac.uryukyu.ie.e215728.Main;

public class ReverseOsero {

    /**
     * 入力した座標に○×をおく
     */
    public void putOsero(int x, int y) {
        Main.board[x][y] = Main.cross;
    }

}
