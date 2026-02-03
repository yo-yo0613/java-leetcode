package ch_2.LegalVariableName;

public class LegalVariableName {
    public static void main(String[] argv) {
        int age; // 合法變數名稱
        //int AGE; // 合法變數名稱
        //int Age; // 合法變數名稱
        //int No1; // 合法變數名稱
        //int No11111111; // 合法變數名稱
        //int _Total; // 合法變數名稱
        // int true; // 不能使用內建保留的字面常數
        age = 19;
        System.out.println("你的年齡是：" + age);
    }
}
