package kyoto.freeprojecs.oldbigbudda.tapnumber;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LevelOneActivity extends AppCompatActivity {

    @BindView(R.id.tvQuestion) TextView tvQuestion;

    @OnClick( {R.id.btOne,
               R.id.btTwo,
               R.id.btThree,
               R.id.btFour,
               R.id.btFive,
               R.id.btSix,
               R.id.btSeven,
               R.id.btEight,
               R.id.btNine} )
    public void onClick(Button button) {
        checkAnswer(Integer.parseInt(button.getText().toString()));
    }

    private int[]  questions;
    private int    digit;
    private StringBuilder question_str;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);
        ButterKnife.bind(this);

        makeQuestion();
    }

    public void makeQuestion() {
        questions = new int[4];
        question_str = new StringBuilder();
        Random r = new Random();
        for (int i = 0;i < questions.length; i++) {
            questions[i] = r.nextInt(9) + 1;
            question_str.append(questions[i]);
        }
        tvQuestion.setText(question_str.toString());
        digit = 0;
    }

    public void checkAnswer(int answer) {
        if (questions[digit] == answer) {
            question_str.deleteCharAt(0);
            tvQuestion.setText(question_str.toString());
            digit++;
            if (digit >= 4) makeQuestion();
        }
    }
}
