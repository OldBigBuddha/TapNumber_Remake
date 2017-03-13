package kyoto.freeprojecs.oldbigbudda.tapnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static Intent intent;

    @OnClick(R.id.btLevelOne)
    public void goLevelOne(Button button) {
        intent = new Intent(this, LevelOneActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.btLevelTwo)
    public void goLevelTwo(Button button) {
        intent = new Intent();
    }
    @OnClick(R.id.btLevelThree)
    public void goLevelThree(Button button) {
        intent = new Intent();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
