package com.airsystem.sample.espresso.test;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.typeText;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import com.airsystem.sample.espresso.MainActivity;
import com.airsystem.sample.espresso.R;

/**
 * @author Budi Oktaviyan Suryanto (budi.oktaviyan@icloud.com)
 */

@LargeTest
public class SimpleTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public SimpleTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        getActivity();
    }

    public void test_SimpleClick() {
        onView(withId(R.id.et_something)).perform(typeText(getActivity().getResources().getString(R.string.app_name)));
        onView(withId(R.id.btn_click)).perform(click());
    }
}