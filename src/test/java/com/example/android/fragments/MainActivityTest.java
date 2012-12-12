package com.example.android.fragments;

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
        mainActivity.onCreate( null );
    }

    @Test
    public void shouldNotBeNull() throws Exception {
        assertNotNull(mainActivity);
    }

    @Test
    public void shouldHaveFragment() throws Exception {
        mainActivity.getSupportFragmentManager().findFragmentById(R.id.article_fragment);
        assertNotNull( null );
    }
}
