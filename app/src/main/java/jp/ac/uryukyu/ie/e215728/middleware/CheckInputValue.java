package jp.ac.uryukyu.ie.e215728.middleware;

public class CheckInputValue {
    /**
     * 入力値が1~3の半角数字かチェックする
     */
    public boolean checkInt1_3(String str) {
        /**
         * 入力値が1~3ならtrue
         */
        if(str.matches("[1-3]")) {
            return true;
        }

        /**
         * 文字やそれ以外の数字を入力したらfalse
         */
        return false;
    }
}
