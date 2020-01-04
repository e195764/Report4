package jp.ac.uryukyu.ie.e195764;

public class Exception {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("例外が発生しました");
            System.out.println(e.getMessage());
        }
    }
}
