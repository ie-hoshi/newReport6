package jp.ac.uryukyu.ie.e215728.view;

public class ShowBoard {
    /**
     * Mainのboard配列を受け取って、それをもとにボードを表示する
     */
    public void showBoard(String[][] board) {

        for(int i=0; i<4; i++) {
            for(int j=0; j<4; j++) {
                System.out.print("｜" + board[j][i]);

                /**
                 * 2列目記載の際に、最後に「｜」を入れて改行する
                 */
                if(j==3) {
                    System.out.println("｜");
                }
            }
        }
    }
}
