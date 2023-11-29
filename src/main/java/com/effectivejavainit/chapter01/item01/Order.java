package com.effectivejavainit.chapter01.item01;

public class Order {

    private boolean prime;

    private boolean urgent;

    private Product product;
    private OrderStatus orderStatus;

    //문제 1: 아래와 같이 같은 타입이지만 다른 값을 받아야할 경우 어떻게 해야하나??
//    public Order(boolean prime, Product product) {
//        this.prime = prime;
//        this.product = product;
//    }
//
//    public Order(boolean urgent, Product product) {
//        this.urgent = urgent;
//        this.product = product;
//    }

    //static 매서드 안에 들어오는 변수는 무조건 static -> 변수도 객체 생성 후 만들어지는게 아니기 때문
    //static 내서드 안에 인스턴스 객체를 생성할 수 있지만 지양하는 방법임.
    //prime 가장 중요한, 주요한
    //urgent 긴급한

    //문제 2: enum 관련 OrderStatus 값을 비교할 때 == , equals 비교의 차이는 무엇인가?

    public static void main(String[] args) {

    }

}
