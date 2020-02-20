package com.coderbd;

public class VariableEx {

    private String name;// instance variable, belongs to object
    private static int age;// static or class level variable, belongs to class
    int x, y, z;
    int p = 10, q = 25, r;
    String firstName;
    String $firstName;
    String first_Name;
    String firstName22222;
    String firstN65654654ame;
    String firstN$$$$ame;
    String _50000;

    public VariableEx() {
    }

    public VariableEx(int x, int z) {// x, z are local variable
        this.x = x;
        this.z = z;
    }

    public static void main(String[] args) {//args is local variable
        System.out.println(VariableEx.age);// belongs to class

        VariableEx obj = new VariableEx();
        System.out.println(obj.name);// belongs to object

    }

    //////////////Local Variable
    // Inside any paranthesis and block
    public void display(String msg) {// msg local variable
        int x = 10;
    }

    public void display2(String msg) {// msg local variable
        int x = 10;
    }

    {// x local variable
        int x = 10;

    }
    private static final int abc = 1000;

    static {// x local variable
        int x = 10;// must instantiate before use
        System.out.println(x);

    }
}
