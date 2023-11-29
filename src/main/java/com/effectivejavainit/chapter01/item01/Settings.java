package com.effectivejavainit.chapter01.item01;

/**
 * 이 클래스의 인스턴스는 #getInstance()를 통해 사용한다.
 * @see #getInstance()
 */
public class Settings {

    private boolean useAutoSteering;

    private boolean useABS;


    private Settings() {}

    //문제 2) Setting 유일한 인스턴스만 생성해서 만들어라 -> 정적 팩토리 사용 (인스턴스 통제) -> 싱글톤 확인

    public static void main(String[] args) {
        //싱글톤이 정상 작동되는지 hashcode 확인
    }

}
