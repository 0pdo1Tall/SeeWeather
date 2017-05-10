package com.xiecc.seeWeather.modules.shareCard.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.xiecc.seeWeather.base.BaseActivity;
import com.xiecc.seeWeather.common.IntentKey;
import com.xiecc.seeWeather.modules.main.domain.Weather;

/**
 * Created by HugoXie on 2017/5/10.
 *
 * Email: Hugo3641@gmail.com
 * GitHub: https://github.com/xcc3641
 * Info: 分享页面
 */

public class ShareActivity extends BaseActivity {

    private Weather mWeather;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        mWeather = intent.getParcelableExtra(IntentKey.WEATHER);
        if (mWeather == null) {
            finish();
        }
    }
}
