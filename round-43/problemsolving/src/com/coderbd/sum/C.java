package com.coderbd.sum;

public class C {

    public static void main(String[] args) {
        C c = new C();
        System.out.println("Sum: " + c.makeSum(1, 10));
    }

    public int makeSum(int sn, int en) {
        int sum = 0;
        do {
            sum += sn;
            sn++;
        } while (sn <= en);
        return sum;
    }
}
