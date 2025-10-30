package co.notix;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;
import y0.AsyncTaskC2196d;
import y0.C2197e;
import y0.C2198f;
import y0.C2199g;

/* loaded from: classes.dex */
public abstract class q8 {
    public static void a(j6 context, Bitmap bitmap, b6 onResult) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(bitmap, "bitmap");
        kotlin.jvm.internal.h.e(onResult, "onResult");
        d0.n nVar = new d0.n(bitmap);
        new AsyncTaskC2196d(nVar, new N1.h(context, 4, onResult)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Bitmap) nVar.f16658d);
    }

    public static final void a(Context context, O7.l onResult, C2198f c2198f) {
        int i9 = 0;
        kotlin.jvm.internal.h.e(context, "$context");
        kotlin.jvm.internal.h.e(onResult, "$onResult");
        ArrayList k02 = B7.j.k0(new C2197e[]{c2198f != null ? (C2197e) c2198f.f24758b.get(C2199g.f24762e) : null, c2198f != null ? (C2197e) c2198f.f24758b.get(C2199g.f24761d) : null, c2198f != null ? (C2197e) c2198f.f24758b.get(C2199g.f24763f) : null});
        ArrayList arrayList = new ArrayList(B7.m.f0(k02, 10));
        int size = k02.size();
        while (i9 < size) {
            Object obj = k02.get(i9);
            i9++;
            C2197e c2197e = (C2197e) obj;
            c2197e.a();
            arrayList.add(new A7.h(Integer.valueOf(c2197e.f24754h), Integer.valueOf(c2197e.f24750d)));
        }
        List list = arrayList.isEmpty() ? null : arrayList;
        if (list == null) {
            list = B6.u0.D(new A7.h(Integer.valueOf(context.getColor(R.color.notix_interstitial_text_color)), Integer.valueOf(context.getColor(R.color.notix_interstitial_text_background_color))));
        }
        onResult.invoke(list);
    }
}
