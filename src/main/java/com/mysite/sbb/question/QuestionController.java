package com.mysite.sbb.question;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionRepository questionRepository;

    @GetMapping("/question/list")
    public String list(Model model)
    {
        List<Question> questionList = this.questionRepository.findAll();
        // 모델 객체는 자바 클래스와 템플릿 간의 연결고리 역활을 한다. 템플릿에서 그 값을 쓸 수 있다.
        model.addAttribute("questionList", questionList);
        return "question_list";
    }

}
