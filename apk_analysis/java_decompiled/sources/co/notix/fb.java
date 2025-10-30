package co.notix;

import android.graphics.Bitmap;
import android.os.Build;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class fb {

    /* renamed from: d, reason: collision with root package name */
    public static final fb f12237d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ fb[] f12238e;

    /* renamed from: a, reason: collision with root package name */
    public final String f12239a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.CompressFormat f12240b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12241c;

    static {
        Bitmap.CompressFormat compressFormat;
        int i9;
        fb fbVar = new fb("JPEG", 0, "jpg", Bitmap.CompressFormat.JPEG, 85);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
        } else {
            compressFormat = Bitmap.CompressFormat.WEBP;
        }
        Bitmap.CompressFormat compressFormat2 = compressFormat;
        if (i10 >= 30) {
            i9 = 100;
        } else {
            i9 = 80;
        }
        fb fbVar2 = new fb("WEBP", 1, "webp", compressFormat2, i9);
        f12237d = fbVar2;
        f12238e = new fb[]{fbVar, fbVar2};
    }

    public fb(String str, int i9, String str2, Bitmap.CompressFormat compressFormat, int i10) {
        this.f12239a = str2;
        this.f12240b = compressFormat;
        this.f12241c = i10;
    }

    public static fb valueOf(String str) {
        return (fb) Enum.valueOf(fb.class, str);
    }

    public static fb[] values() {
        return (fb[]) f12238e.clone();
    }
}
