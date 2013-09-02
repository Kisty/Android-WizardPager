package com.example.android.wizardpager.wizard.model;

import java.util.ArrayList;

/**
 * Created by TimKist on 30/08/13.
 */
public abstract class WizardPage extends Page<WizardPage> {
    protected WizardPage(ModelCallbacks callbacks, String title) {
        super(callbacks, title);
    }

    @Override
    protected WizardPage getThis() {
        return this;
    }

    public String getTitle() {
        return mTitle;
    }

    public abstract void getReviewItems(ArrayList<ReviewItem> dest);
}
