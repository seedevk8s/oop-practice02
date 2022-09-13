package org.example03;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 학점계산기 구현
 • 요구사항
     • 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
     • 일급 컬렉션 사용
 *
 */
public class GradeCalculatorTest {
    // 학점계산기, 코스
    // 평균학점 계산 요청 ---> '학점계산기' ---> (학점수×교과목 평점)의 합계 ---> '코스'
    //                               ---> 수강신청 총학점 수


    @Test
    void calculateGradeTest() {
        List<Course> courses = List.of(new Course("OOP", 3, "A+"),
                new Course("자료구조", 3, "A+"));
    }
}









