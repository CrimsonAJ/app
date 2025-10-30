package F1;

import D1.h;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final String f2315a = a.class.getName();

    @Override // F1.c
    public final Bitmap a(Bitmap bitmap, h hVar) {
        Paint paint = new Paint(3);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f9 = min / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(min, min, config);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawCircle(f9, f9, f9, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f9 - (bitmap.getWidth() / 2.0f), f9 - (bitmap.getHeight() / 2.0f), paint);
        return createBitmap;
    }

    @Override // F1.c
    public final String b() {
        return this.f2315a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    public final int hashCode() {
        return a.class.hashCode();
    }
}
