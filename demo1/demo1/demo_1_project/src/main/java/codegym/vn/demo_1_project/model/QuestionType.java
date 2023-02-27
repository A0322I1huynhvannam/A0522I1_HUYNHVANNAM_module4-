package codegym.vn.demo_1_project.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class QuestionType {
    @Id
    private String idQuestionType;
    private String name;


    public QuestionType() {
    }

    public QuestionType(String idQuestionType, String name) {
        this.idQuestionType = idQuestionType;
        this.name = name;
    }

    public String getIdQuestionType() {
        return idQuestionType;
    }

    public void setIdQuestionType(String idQuestionType) {
        this.idQuestionType = idQuestionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
