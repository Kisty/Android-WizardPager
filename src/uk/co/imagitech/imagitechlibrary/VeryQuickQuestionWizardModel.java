package uk.co.imagitech.imagitechlibrary;

import android.content.Context;

import com.example.android.wizardpager.wizard.model.PageList;
import com.example.android.wizardpager.wizard.model.AbstractWizardModel;
import com.example.android.wizardpager.wizard.model.SingleFixedChoicePage;

/**
 * Created by TimKist on 30/08/13.
 */
public class VeryQuickQuestionWizardModel extends AbstractWizardModel{
    public VeryQuickQuestionWizardModel(Context context) {
        super(context);
    }

    @Override
    protected PageList onNewRootPageList() {
        return new PageList(
                new SingleFixedChoicePage(this,"Is it")
                    .setChoices("a bird", "a plane", "a bus", "a car")
                    .setRequired(true),
                new SingleFixedChoicePage(this,"What colour is it")
                    .setChoices("red", "blue", "magenta", "white")
                    .setRequired(false),
                new SingleFixedChoicePage(this,"What speed is it going at")
                    .setChoices("Stopped","Slow","Fast","Crazy fast","Speed of light")
                    .setRequired(true)
        );
    }
}
