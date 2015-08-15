package com.mystudy.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;

import com.mystudy.ui.SemiCircleMenuItem.OnSemiCircularRadialMenuPressed;

@SuppressLint("ResourceAsColor")
public class DemoActivity extends Activity {

	private static final String TAG = "TAG";

	private SemiCircleMenu mMenu;
	private SemiCircleMenuItem mCamera, mDislike, mInfo, mRefresh, mSearch;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.layout_main);
		initView();


	}

	private void initView() {
		mCamera = new SemiCircleMenuItem("camera", getResources().getDrawable(R.drawable.ic_action_camera), "Camera");
		mDislike = new SemiCircleMenuItem("dislike", getResources().getDrawable(R.drawable.ic_action_dislike), "Dislike");
		mInfo = new SemiCircleMenuItem("info", getResources().getDrawable(R.drawable.ic_action_info), "Info");
		mRefresh = new SemiCircleMenuItem("refresh", getResources().getDrawable(R.drawable.ic_action_refresh), "Refresh");
		mSearch = new SemiCircleMenuItem("search", getResources().getDrawable(R.drawable.ic_action_search), "Search");
		mMenu=(SemiCircleMenu) findViewById(R.id.semicircle_menu);
		mMenu.addMenuItem(mCamera.getMenuID(), mCamera);
		mMenu.addMenuItem(mDislike.getMenuID(), mDislike);
		mMenu.addMenuItem(mInfo.getMenuID(), mInfo);
		mMenu.addMenuItem(mRefresh.getMenuID(), mRefresh);
		mMenu.addMenuItem(mSearch.getMenuID(), mSearch);
				
		mCamera.setOnSemiCircularRadialMenuPressed(new OnSemiCircularRadialMenuPressed() {
			@Override
			public void onMenuItemPressed() {
				Toast.makeText(DemoActivity.this, mCamera.getText(), Toast.LENGTH_LONG).show();
			}
		});
		
		mDislike.setOnSemiCircularRadialMenuPressed(new OnSemiCircularRadialMenuPressed() {
			@Override
			public void onMenuItemPressed() {
				Toast.makeText(DemoActivity.this, mDislike.getText(), Toast.LENGTH_LONG).show();
			}
		});
		
		mInfo.setOnSemiCircularRadialMenuPressed(new OnSemiCircularRadialMenuPressed() {
			@Override
			public void onMenuItemPressed() {
				Toast.makeText(DemoActivity.this, mInfo.getText(), Toast.LENGTH_LONG).show();
			}
		});
		
		mRefresh.setOnSemiCircularRadialMenuPressed(new OnSemiCircularRadialMenuPressed() {
			@Override
			public void onMenuItemPressed() {
				Toast.makeText(DemoActivity.this, mRefresh.getText(), Toast.LENGTH_LONG).show();
			}
		});
		
		mSearch.setOnSemiCircularRadialMenuPressed(new OnSemiCircularRadialMenuPressed() {
			@Override
			public void onMenuItemPressed() {
				Toast.makeText(DemoActivity.this, mSearch.getText(), Toast.LENGTH_LONG).show();
				mMenu.dismissMenu();
			}
		});
	}
}
