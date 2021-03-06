
package com.book.jtm.chap06;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.book.jtm.R;

import java.util.ArrayList;
import java.util.List;

/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2015 Umeng, Inc
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

public class FeedsActivity extends Activity {

    protected ListView feedsListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feed_item_activity);

        feedsListView = (ListView) findViewById(R.id.feeds_lv);
        setupFeedListView();
    }
    
    protected void setupFeedListView() {
        feedsListView.setAdapter(new FeedAdapter(mockFeeds()));
    }

    protected List<Feed> mockFeeds() {
        List<Feed> feeds = new ArrayList<Feed>();
        for (int i = 0; i < 20; i++) {
            feeds.add(new Feed("UserName - " + i, "这是Feed的文本消息啊 --> " + i));
        }
        return feeds;
    }

    public static class Feed {
        public Feed(String aName, String aText) {
            creatorName = aName;
            text = aText;
        }

        String creatorName;
        String text;
    }
}
