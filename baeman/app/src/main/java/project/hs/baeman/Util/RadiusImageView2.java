package project.hs.baeman.Util;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;

public class RadiusImageView2 extends android.support.v7.widget.AppCompatImageView{
    public static float radius = 10.0f;

    public RadiusImageView2(Context context) {
        super(context);
    }

    public RadiusImageView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RadiusImageView2(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Path clipPath = new Path();
        RectF rect = new RectF(0, 0, this.getWidth(), this.getHeight());
        clipPath.addRoundRect(rect, radius, radius, Path.Direction.CW);
        canvas.clipPath(clipPath);
        super.onDraw(canvas);
    }
}