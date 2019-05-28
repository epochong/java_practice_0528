import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/28 10:34
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0 ; i < n; i++) {
            arrayList.add(i);
        }
        int i = 2;
        while (arrayList.size() != 1) {
            if (i == n) {
                i = 0;
            }
            arrayList.remove(i);
            n--;
            if (i + 2 == n || i == n) {
                i = 0;
            } else if (i + 1 == n) {
                i = 1;
            } else {
                i += 2;
            }
        }
        System.out.println(arrayList.get(0));
    }
}
