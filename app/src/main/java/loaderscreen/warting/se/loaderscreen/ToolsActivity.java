package loaderscreen.warting.se.loaderscreen;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;

import loaderscreen.warting.se.loaderscreen.databinding.ActivityGalleryBinding;
import loaderscreen.warting.se.loaderscreen.databinding.ActivityToolsBinding;

public class ToolsActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityToolsBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_tools);
        setUpView(binding.toolbar, null);
        setTitle("tools");
        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setDisplayHomeAsUpEnabled(true);

        }


        binding.toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateUpOrBack(ToolsActivity.this);
            }
        });

    }


}
