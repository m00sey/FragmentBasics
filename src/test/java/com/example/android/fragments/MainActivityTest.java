package com.example.android.fragments;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.xtremelabs.robolectric.RobolectricTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    private MainActivity mainActivity;

    @Before
    public void setUp() throws Exception
    {
        mainActivity = new MainActivity();
        mainActivity.setIntent(new Intent());
        mainActivity.onCreate( null );
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(mainActivity);
    }

    @Test
    public void shouldHaveFragment() throws Exception {
        FragmentManager manager = mainActivity.getSupportFragmentManager();
        assertNotNull(manager);
        // Need an id in XML -  http://developer.android.com/guide/components/fragments.html#Adding
        // Fragment fragment = manager.findFragmentById(R.id.headlines_fragment);
        Fragment fragment = manager.findFragmentByTag("headlines");
        assertNotNull(fragment);
    }
}
