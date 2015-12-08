package loaderscreen.warting.se.loaderscreen;

import android.databinding.DataBindingUtil;
import android.os.Bundle;

import loaderscreen.warting.se.loaderscreen.databinding.ActivityGalleryBinding;
import loaderscreen.warting.se.loaderscreen.databinding.ActivitySlideshowBinding;

public class SlideshowActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySlideshowBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_slideshow);
        setTitle("Slideshow");
        setUpView(binding.test.toolbar, binding.navView);
    }
}
