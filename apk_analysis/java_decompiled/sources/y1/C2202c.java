package y1;

import C1.m;
import H1.f;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.h;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2202c implements InterfaceC2201b {
    @Override // y1.InterfaceC2201b
    public final String a(Object obj, m mVar) {
        Uri uri = (Uri) obj;
        if (h.a(uri.getScheme(), "android.resource")) {
            StringBuilder sb = new StringBuilder();
            sb.append(uri);
            sb.append('-');
            Configuration configuration = mVar.f1218a.getResources().getConfiguration();
            Bitmap.Config[] configArr = f.f2949a;
            sb.append(configuration.uiMode & 48);
            return sb.toString();
        }
        return uri.toString();
    }
}
