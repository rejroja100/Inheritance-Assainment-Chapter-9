public class ChoiceQuestion extends Question {

    public ChoiceQuestion(String text, String answer) {
        super(text, answer);
    }

    public void addChoice(String choice, boolean correct) {
        addText("\n" + choice);
        if (correct) {
            setAnswer(choice);
        }
    }

    private void addText(String s) {

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

