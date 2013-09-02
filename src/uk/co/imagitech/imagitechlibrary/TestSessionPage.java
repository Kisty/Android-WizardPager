package uk.co.imagitech.imagitechlibrary;

import com.example.android.wizardpager.wizard.model.Page;
import com.example.android.wizardpager.wizard.model.ModelCallbacks;

/**
 * Created by TimKist on 02/09/13.
 */
public abstract class TestSessionPage extends Page<TestSessionPage> {
    protected TestSessionPage(ModelCallbacks callbacks, String title) {
        super(callbacks, title);
    }

    @Override
    protected TestSessionPage getThis() {
        return this;
    }
}
