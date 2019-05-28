/**
 * @author wangchong
 * @date 2019/5/28 16:22
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new B().getValue());
    }
    static class A {
        protected int value;
        public A(int v) {
            setValue(v);
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            try {
                value++;
                return value;
            } catch (Exception e) {
                System.out.println(e.toString());
            } finally {
                this.setValue(value);
                System.out.println(value);
            }
            return value;
        }
    }
    static class B extends A {

        public B() {
            super(5);
            setValue(getValue() - 3);
        }

        @Override
        public void setValue(int value) {
            super.setValue(value * 2);
        }
    }
}
