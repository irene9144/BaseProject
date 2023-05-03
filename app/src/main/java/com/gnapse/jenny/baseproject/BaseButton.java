package com.gnapse.jenny.baseproject;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class BaseButton extends ConstraintLayout {

    public String text;
    private int layoutResId;

    private Context context;

    private View rootView;

    public BaseButton(@NonNull Context context,
            @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }

    public void setLayoutResId(int layoutResId) {
        this.layoutResId = layoutResId;
        setFocusable(true);
        setClickable(true);
        initView();
    }

    private void initView() {
        View view = inflate(context, layoutResId, this);
        rootView = view;
    }

    public void setText(String text) {
        this.text = text;
        ((TextView)rootView.findViewById(R.id.textView)).setText(text);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
