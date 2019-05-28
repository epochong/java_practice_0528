import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/28 14:34
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner in = new Scanner(input.nextLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (in.hasNextInt()) {
            arrayList.add(in.nextInt());
        }

        int k = arrayList.remove(arrayList.size() - 1);
        Collections.sort(arrayList);
        for (int i = 0; i < k; i++) {
            if (i < k - 1) {
                System.out.print(arrayList.get(i) + " ");
            } else {
                System.out.print(arrayList.get(i));
            }
        }
    }
}
