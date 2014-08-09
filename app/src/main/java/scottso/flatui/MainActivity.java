package scottso.flatui;

import android.app.Activity;

import android.app.ActionBar;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.widget.DrawerLayout;

public class MainActivity extends Activity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    private NavigationDrawerFragment mNavigationDrawerFragment;
    private CharSequence mTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);

        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        final ColourFragment fragment = new ColourFragment();
        final FragmentManager fm = getFragmentManager();
        setTitle(position);
        fragment.setLayoutId(position);
        fm.beginTransaction().replace(R.id.container, fragment).commit();
    }

    public void setTitle(int pos) {
        switch (pos) {
            case ColourFragment.RED:
                mTitle = getString(R.string.red_section);
                break;
            case ColourFragment.PINK:
                mTitle = getString(R.string.pink_section);
                break;
            case ColourFragment.PURPLE:
                mTitle = getString(R.string.purple_section);
                break;
            case ColourFragment.BLUE:
                mTitle = getString(R.string.blue_section);
                break;
            case ColourFragment.GREEN:
                mTitle = getString(R.string.green_section);
                break;
            case ColourFragment.YELLOW:
                mTitle = getString(R.string.yellow_section);
                break;
            case ColourFragment.ORANGE:
                mTitle = getString(R.string.orange_section);
                break;
            case ColourFragment.GRAY:
                mTitle = getString(R.string.gray_section);
                break;
        }
        setTitle(mTitle);
    }

    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        if (!mNavigationDrawerFragment.isDrawerOpen()) {
            // Only show items in the action bar relevant to this screen
            // if the drawer is not showing. Otherwise, let the drawer
            // decide what to show in the action bar.
            getMenuInflater().inflate(R.menu.main, menu);
            restoreActionBar();
            return true;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
