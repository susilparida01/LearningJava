package com.greatlearning.foundationofprogramming;

public class CustomerDriver {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.firstName);
        System.out.println(customer.lastName);
        System.out.println(customer.age);
        System.out.println(customer.city);
        // System.out.println(customer.password); //--> Itwill give compilation error
    }
}


//class Main {
//
//    public static void main(String args[]) {
//
//        Customer customer = new Customer();
//
//    }
//
//}
