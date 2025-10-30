package w1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2130a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24001a;

    public /* synthetic */ C2130a(int i9) {
        this.f24001a = i9;
    }

    @Override // w1.f
    public final g a(Object obj, C1.m mVar) {
        switch (this.f24001a) {
            case 0:
                Uri uri = (Uri) obj;
                if (!H1.f.d(uri)) {
                    return null;
                }
                return new C2131b(uri, mVar, 0);
            case 1:
                return new C2132c((Bitmap) obj, mVar, 0);
            case 2:
                return new C2132c((ByteBuffer) obj, mVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (!kotlin.jvm.internal.h.a(uri2.getScheme(), "content")) {
                    return null;
                }
                return new C2131b(uri2, mVar, 1);
            case 4:
                return new C2132c((Drawable) obj, mVar, 2);
            case 5:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (!kotlin.jvm.internal.h.a(uri3.getScheme(), "android.resource")) {
                    return null;
                }
                return new C2131b(uri3, mVar, 2);
        }
    }
}
