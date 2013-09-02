package uk.co.imagitech.imagitechlibrary;

import android.support.v4.app.Fragment;

import com.example.android.wizardpager.wizard.model.ModelCallbacks;

/**
 * Created by TimKist on 30/08/13.
 */
public class PracticeQuestionPage extends TestSessionPage {
    protected PracticeQuestionPage(ModelCallbacks callbacks, String title) {
        super(callbacks, title);
    }

    @Override
    public Fragment createFragment() {
        return PracticeQuestionFragment.newInstance();
    }
}
