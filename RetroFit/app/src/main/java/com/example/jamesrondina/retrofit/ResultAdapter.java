package com.example.jamesrondina.retrofit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.jamesrondina.retrofit.models.ArticleList;
import com.example.jamesrondina.retrofit.models.Result;

/**
 * Created by jamesrondina on 8/14/16.
 */
public class ResultAdapter extends BaseAdapter {

    ArticleList articleList = new ArticleList();
    LayoutInflater inflater;
    Context context;

    public ResultAdapter(Context context, ArticleList articleList) {
        this.context = context;
        this.articleList = articleList;
        inflater = LayoutInflater.from(this.context);
    }

    @Override
    public int getCount() {
        return articleList.getNumResults();
    }

    @Override
    public Object getItem(int i) {
        return articleList.getResults().get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder mViewHolder;

        if (view == null) {
            view = inflater.inflate(R.layout.article, viewGroup, false);
            mViewHolder = new ViewHolder(view);
            view.setTag(mViewHolder);
        } else {
            mViewHolder = (ViewHolder) view.getTag();
        }

        Result result = (Result) getItem(i);

        mViewHolder.mTitle.setText(result.getTitle());
        mViewHolder.mAbstract.setText(result.getAbstract());
        mViewHolder.mUrl.setText(result.getUrl());

        return view;

    }

    private class ViewHolder {
        TextView mTitle, mAbstract, mUrl;

        public ViewHolder(View item) {
            mTitle = (TextView) item.findViewById(R.id.title);
            mAbstract = (TextView) item.findViewById(R.id.abstrct);
            mUrl = (TextView) item.findViewById(R.id.Url);
        }
    }
}
