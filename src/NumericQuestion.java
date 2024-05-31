public class NumericQuestion extends Question {

    @Override
    public boolean checkAnswer(String response) {
        {
            double expectedAnswer = Double.parseDouble(super.answer);
            double userResponse = Double.parseDouble(response);
            return Math.abs(expectedAnswer - userResponse) <= 0.01;
        }
    }
}
