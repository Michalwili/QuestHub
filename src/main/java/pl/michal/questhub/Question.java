package pl.michal.questhub;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Question {

    private String name;

    public Question() {

    }

    public Question(String name) {
        this.name = name;
    }

}
