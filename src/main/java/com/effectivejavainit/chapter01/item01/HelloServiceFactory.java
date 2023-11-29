package com.effectivejavainit.chapter01.item01;//package me.whiteship.chapter01.item01;

import java.lang.reflect.InvocationTargetException;
import java.util.Optional;
import java.util.ServiceLoader;

public class HelloServiceFactory {

    //문제3-1 ) implements HelloService 를 받을 경우 해당 HelloServiceFactory class는 하나의 구현만 가능하다.
    // lang에 따라서 korean, english 구현부로 나눠야 할 경우 어떻게 하면 되나? -> 정적팩토리 이용


    //문제3-2 ) java 8 이후에 가능한 interface 내부에 static 매서드로 구현하기 -> 인터페이스 내부에 구현체 가능해짐
    // 구지 중간단계를 거치는 factory 클래스를 만들 필요가 없어진다!
    ////static 메소드는 객체 생성 없이 한 공간에서 연관된 메소드들의 결합도를 상승시키는 간단한 방법을 제공

    //참고 : inteface의 default 메서드와의 차이를 확인


}
