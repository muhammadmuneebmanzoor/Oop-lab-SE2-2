public class Hello {
    public static void main(String[] args) {
        if (args.length > 0) {
            
            StringBuffer name = new StringBuffer(args[0]);
            System.out.println("Hello, " + name);
        } else {
            System.out.println("Hello, world");
        }
    }
}
