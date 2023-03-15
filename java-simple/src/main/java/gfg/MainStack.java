package gfg;

public class MainStack {
    public static void main(String[] args) {
        var stack = new ArrayImStack(10);

        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.push(new Employee("fn","ln",1));
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        stack.pop();
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
    }
}
