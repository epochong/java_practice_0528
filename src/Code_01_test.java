import java.util.*;
/**
 * @author wangchong
 * @date 2019/5/28 15:44
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe wa
 */

public class Code_01_test{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            int left = input;
            //用来标记是否删除了这个数
            boolean flag[] = new boolean[input];
            //用来计数
            int num = 0;
            int result = 0;
            for (int i = 0; i < input; i++) {
                num++;
                if (!flag[i]) {
                    if (num % 3 == 0) {
                        flag[i] = true;
                        left--;
                    }
                    if (left == 1) {
                        break;
                    }
                } else {
                    num--;
                }
                if (i + 1 == input) {
                    i = -1;
                }
            }
            //找出最后那个数
            for (int j = 0; j < input; j++) {
                if (!flag[j]) {
                    result = j;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}