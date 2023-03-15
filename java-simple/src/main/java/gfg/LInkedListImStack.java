package gfg;

import java.util.LinkedList;

public class LInkedListImStack {

    LinkedList<Employee> stack;

    public LInkedListImStack(Employee employee) {
        stack= new LinkedList<>();
        stack.add(employee);

    }

    public void push(Employee employee) {
        this.stack.add(employee);
    }

    public Employee pop(){
        Employee employee= this.stack.getLast();
        this.stack.removeLast();
      return   employee;
    }
}
