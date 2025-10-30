package w1;

import Y0.r;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import l6.AbstractC1570b;
import u1.EnumC2057e;
import u1.o;

/* renamed from: w1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2132c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24005a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.m f24006b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f24007c;

    public /* synthetic */ C2132c(Object obj, C1.m mVar, int i9) {
        this.f24005a = i9;
        this.f24007c = obj;
        this.f24006b = mVar;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, x8.i, x8.g] */
    @Override // w1.g
    public final Object a(E7.d dVar) {
        EnumC2057e enumC2057e = EnumC2057e.f23578b;
        C1.m mVar = this.f24006b;
        boolean z9 = false;
        Object obj = this.f24007c;
        switch (this.f24005a) {
            case 0:
                return new C2133d(new BitmapDrawable(mVar.f1218a.getResources(), (Bitmap) obj), false, enumC2057e);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    ?? obj2 = new Object();
                    obj2.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = mVar.f1218a;
                    return new m(new o(obj2, null), null, enumC2057e);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = H1.f.f2949a;
                if ((drawable instanceof VectorDrawable) || (drawable instanceof r)) {
                    z9 = true;
                }
                if (z9) {
                    drawable = new BitmapDrawable(mVar.f1218a.getResources(), AbstractC1570b.b(drawable, mVar.f1219b, mVar.f1221d, mVar.f1222e, mVar.f1223f));
                }
                return new C2133d(drawable, z9, enumC2057e);
        }
    }
}
