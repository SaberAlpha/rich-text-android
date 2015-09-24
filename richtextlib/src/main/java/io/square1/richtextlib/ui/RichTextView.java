package io.square1.richtextlib.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;



/**
 * Created by roberto on 24/06/15.
 */
public class RichTextView extends TextView  {


    public RichTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        parseCustomAttributes(context, attrs);
    }

    public RichTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        parseCustomAttributes(context, attrs);
    }


    @TargetApi(21)
    public RichTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        parseCustomAttributes(context, attrs);
    }


    public RichTextView(Context context) {
        super(context);
    }


    private void parseCustomAttributes(Context ctx, AttributeSet attrs) {
       // TypedArray a = ctx.obtainStyledAttributes(attrs,R.sty);
       // String customFont = a.getString(R.styleable.io_square1_richtextlib_ui_RichTextView_);
       // setCustomFont(ctx, customFont);
       // a.recycle();
    }

    public boolean setCustomFont(Context ctx, String asset) {

        if(TextUtils.isEmpty(asset)){
            return false;
        }

        try {

            Typeface tf  = Typeface.createFromAsset(ctx.getAssets(), asset);
            setTypeface(tf);

        } catch (Exception e) {

            return false;

        }

        return true;
    }
}