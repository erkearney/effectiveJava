public class StaticFactory {
    public static void main(String args[]) {
        public static Boolean valueOf(boolean b) {
            //"This method translates a boolean primitive value into a
            //Boolean object reference:" p.5
            return b ? Boolean.TRUE : Boolean.FALSE;
        }
    }
}
