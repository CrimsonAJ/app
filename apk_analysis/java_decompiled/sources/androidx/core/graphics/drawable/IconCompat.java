package androidx.core.graphics.drawable;

import F.a;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f9577k = PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f9578a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9579b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f9580c;

    /* renamed from: d, reason: collision with root package name */
    public Parcelable f9581d;

    /* renamed from: e, reason: collision with root package name */
    public int f9582e;

    /* renamed from: f, reason: collision with root package name */
    public int f9583f;

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f9584g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f9585h;

    /* renamed from: i, reason: collision with root package name */
    public String f9586i;
    public String j;

    public IconCompat() {
        this.f9578a = -1;
        this.f9580c = null;
        this.f9581d = null;
        this.f9582e = 0;
        this.f9583f = 0;
        this.f9584g = null;
        this.f9585h = f9577k;
        this.f9586i = null;
    }

    public static Bitmap a(Bitmap bitmap, boolean z9) {
        int min = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        float f9 = min;
        float f10 = 0.5f * f9;
        float f11 = 0.9166667f * f10;
        if (z9) {
            float f12 = 0.010416667f * f9;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f9 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i9) {
        str.getClass();
        if (i9 != 0) {
            IconCompat iconCompat = new IconCompat(2);
            iconCompat.f9582e = i9;
            if (resources != null) {
                try {
                    iconCompat.f9579b = resources.getResourceName(i9);
                } catch (Resources.NotFoundException unused) {
                    throw new IllegalArgumentException("Icon resource cannot be found");
                }
            } else {
                iconCompat.f9579b = str;
            }
            iconCompat.j = str;
            return iconCompat;
        }
        throw new IllegalArgumentException("Drawable resource ID must not be 0");
    }

    public final int c() {
        int i9 = this.f9578a;
        if (i9 == -1) {
            Object obj = this.f9579b;
            if (Build.VERSION.SDK_INT >= 28) {
                return a.e(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon resource", e8);
                return 0;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon resource", e9);
                return 0;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            }
        }
        if (i9 == 2) {
            return this.f9582e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public final Uri d() {
        int i9 = this.f9578a;
        if (i9 == -1) {
            Object obj = this.f9579b;
            if (Build.VERSION.SDK_INT >= 28) {
                return a.n(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e8) {
                Log.e("IconCompat", "Unable to get icon uri", e8);
                return null;
            } catch (NoSuchMethodException e9) {
                Log.e("IconCompat", "Unable to get icon uri", e9);
                return null;
            } catch (InvocationTargetException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            }
        }
        if (i9 != 4 && i9 != 6) {
            throw new IllegalStateException("called getUri() on " + this);
        }
        return Uri.parse((String) this.f9579b);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Icon e(android.content.Context r8) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.e(android.content.Context):android.graphics.drawable.Icon");
    }

    public final String toString() {
        String str;
        if (this.f9578a == -1) {
            return String.valueOf(this.f9579b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f9578a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f9578a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f9579b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f9579b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f9582e);
                if (this.f9583f != 0) {
                    sb.append(" off=");
                    sb.append(this.f9583f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f9579b);
                break;
        }
        if (this.f9584g != null) {
            sb.append(" tint=");
            sb.append(this.f9584g);
        }
        if (this.f9585h != f9577k) {
            sb.append(" mode=");
            sb.append(this.f9585h);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i9) {
        this.f9580c = null;
        this.f9581d = null;
        this.f9582e = 0;
        this.f9583f = 0;
        this.f9584g = null;
        this.f9585h = f9577k;
        this.f9586i = null;
        this.f9578a = i9;
    }
}
