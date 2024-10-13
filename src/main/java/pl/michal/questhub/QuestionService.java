package pl.michal.questhub;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QuestionService {
        public List<Question> getQuestions() {
            return Arrays.asList(
                    new Question("Question 1"),
                    new Question( "Question 2")
            );
    }
}
