package com.mysite.sbb.question;

import com.mysite.sbb.answer.Answer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 해당 속성에 값을 따로 세팅안해도 1씩 자동으로 증가하여 저장된다.
    // Integer은 매개변수를 객체로 필요로 할때, 기본형 값이 아닌 객체로 저장할때, 객체간의 비교가 필요할 때 사용한다
    private Integer id;

    @Column(length = 200)
    private String subject;

    @Column(columnDefinition = "TEXT")
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE) // mappedBy == 참조 엔티티 속성명, cascade => 질문 지워지면 답변 모두 삭제
    private List<Answer> answerList;
}
