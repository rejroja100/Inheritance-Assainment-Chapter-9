public class QuestionB {
    public String text;
    public String answer;

    public QuestionB(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString(){
        return "Question :" + text + "/nAnswer :" + answer;
    }
}
