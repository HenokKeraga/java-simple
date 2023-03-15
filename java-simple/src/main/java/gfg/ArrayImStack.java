package gfg;

public class ArrayImStack {
    Employee[] stack;
    int top;


    public ArrayImStack(int size) {
        stack = new Employee[size];
        top = -1;
    }

    public void push(Employee employee) {

        if (top >= stack.length - 1) {
            var stackNew = new Employee[stack.length * 2];
            System.arraycopy(stack, 0, stackNew, 0, stack.length);
            stack = stackNew;
        }

        top++;
        stack[top] = employee;
    }

    public Employee peek() {
        return stack[top];
    }

    public Employee pop() {
        if(top==-1){
            return null;
        }
        var employee = stack[top];
        stack[top] = null;
        if(top>-1){
            top--;
        }
        return employee;
    }

    public boolean isEmpty(){

        return top==-1;
    }


    public int size(){
        return top+1;
    }

}
