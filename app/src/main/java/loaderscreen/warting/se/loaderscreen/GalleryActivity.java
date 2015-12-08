package loaderscreen.warting.se.loaderscreen;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import loaderscreen.warting.se.loaderscreen.databinding.ActivityGalleryBinding;
import loaderscreen.warting.se.loaderscreen.databinding.ActivityMainBinding;

public class GalleryActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityGalleryBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_gallery);
        setTitle("Gallery");
        setUpView(binding.test.toolbar, binding.navView);
    }
}
