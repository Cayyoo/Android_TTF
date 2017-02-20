package com.example.ttftest;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.widget.TextView;

/**
 * TTF（TrueTypeFont）是Apple公司和Microsoft公司共同推出的字体文件格式，随着windows的流行，已经变成最常用的一种字体文件表示方式。
 */
public class MainActivity extends Activity {

	private int ttf_str[] = { R.string.ttf_1, R.string.ttf_2, R.string.ttf_3,
			R.string.ttf_4, R.string.ttf_5, R.string.ttf_6, R.string.ttf_7,
			R.string.ttf_8, R.string.ttf_9, R.string.ttf_10, R.string.ttf_11,
			R.string.ttf_12, R.string.ttf_13, R.string.ttf_14, R.string.ttf_15,
			R.string.ttf_16, R.string.ttf_17, R.string.ttf_18, R.string.ttf_19, };

	private int ttf_id[] = { R.id.ttf_1, R.id.ttf_2, R.id.ttf_3, R.id.ttf_4,
			R.id.ttf_5, R.id.ttf_6, R.id.ttf_7, R.id.ttf_8, R.id.ttf_9,
			R.id.ttf_10, R.id.ttf_11, R.id.ttf_12, R.id.ttf_13, R.id.ttf_14,
			R.id.ttf_15, R.id.ttf_16, R.id.ttf_17, R.id.ttf_18, R.id.ttf_19, };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		/*
		 * 设置自定义自体
		 */
		for (int i = 0; i <= 18; ++i)
			showTTF("fonts/" + getString(ttf_str[i]), ttf_id[i]);
	}

	private void showTTF(String path, int id) {
		AssetManager assetManager = this.getAssets();
		Typeface fontFace = Typeface.createFromAsset(assetManager, path);

		//Typeface fontFace = Typeface.createFromAsset(getAssets(), path);

		TextView text = (TextView) findViewById(id);
		text.setTypeface(fontFace);
	}

}
