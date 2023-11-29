package com.effectivejavainit.chapter01.item05.dependencyinjection;

import com.effectivejavainit.chapter01.item05.DefaultDictionary;
import com.effectivejavainit.chapter01.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    //new Dictionary로 만들경우
    //KoreaSpellChecker를 만들어서 또 dictionary를 생성해야한다.
    //SpellChecker 코드의 재사용을 위해서 -> Dictionary를 interface로 만들면 된다
    private final Dictionary dictionary;

    public SpellChecker(Dictionary dictionary) {
        this.dictionary = dictionary;
    }


    //문제 1 ) Dictionary의 DefaultDictionary를 SpellChecker가 받도록 구현

    //1-1 중간에 factory를 거쳐서

    //1-2 팩토리를 거치지 않고

    //1-3 팩토리를 거치는 supplier를 사용해서 받기




    public boolean isValid(String word) {
        // TODO 여기 SpellChecker 코드
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        // TODO 여기 SpellChecker 코드
        return dictionary.closeWordsTo(typo);
    }

    public static void main(String[] args) {



        //---------------------- 정답 부분 ----------------------------//

        //1) 일반 방법
//        SpellChecker spellChecker = new SpellChecker(new DefaultDictionary());
//        System.out.println("spellChecker = " + spellChecker);
//
//        //2) 방법 2 - 중간 factory 매서드를 static으로 변환
//        SpellChecker spellChecker3 = new SpellChecker(DictionaryFactory::get);
//
//        //3) 방법 3 - Supplier 이용
//        SpellChecker spellChecker1 = new SpellChecker(DefaultDictionary::new);
//        System.out.println("spellChecker1 = " + spellChecker1);



    }


}
