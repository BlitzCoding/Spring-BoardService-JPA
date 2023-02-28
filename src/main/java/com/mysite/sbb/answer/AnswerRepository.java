package com.mysite.sbb.answer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<Answer, Integer> { // 리포지터리 대상이 되는 엔티티 타입과 해당 엔티티의PK의 속성타입을 지정

}
