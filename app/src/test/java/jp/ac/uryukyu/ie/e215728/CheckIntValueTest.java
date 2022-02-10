package jp.ac.uryukyu.ie.e215728;

import org.junit.jupiter.api.Test;

import jp.ac.uryukyu.ie.e215728.middleware.CheckInputValue;

import static org.junit.jupiter.api.Assertions.*;
/**
 * CheckInputValueが１〜３の値を入力した場合trueを返すことを確かめるテスト
 */
class CheckIntValueTest {
    @Test void intTest() {
        CheckInputValue checkInt = new CheckInputValue();
        assertEquals(checkInt.checkInt1_3("1"), true);
        assertEquals(checkInt.checkInt1_3("2"), true);
        assertEquals(checkInt.checkInt1_3("3"), true);
        assertEquals(checkInt.checkInt1_3("4"), false);
    }
    
}
