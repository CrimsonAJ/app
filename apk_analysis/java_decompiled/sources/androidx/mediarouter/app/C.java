package androidx.mediarouter.app;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* loaded from: classes.dex */
public final class C extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f9936a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f9937b;

    /* renamed from: c, reason: collision with root package name */
    public int f9938c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N f9939d;

    public C(N n7) {
        Bitmap bitmap;
        this.f9939d = n7;
        MediaDescriptionCompat mediaDescriptionCompat = n7.f10023j0;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.f9244e;
        }
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.f9936a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = n7.f10023j0;
        this.f9937b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f9245f : null;
    }

    public final BufferedInputStream a(Uri uri) {
        InputStream openInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if (!"android.resource".equals(lowerCase) && !"content".equals(lowerCase) && !"file".equals(lowerCase)) {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            openConnection.setConnectTimeout(30000);
            openConnection.setReadTimeout(30000);
            openInputStream = openConnection.getInputStream();
        } else {
            openInputStream = this.f9939d.f10030n.getContentResolver().openInputStream(uri);
        }
        if (openInputStream == null) {
            return null;
        }
        return new BufferedInputStream(openInputStream);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x002f: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:48), block:B:61:0x002f */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f5  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.C.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        N n7 = this.f9939d;
        n7.f10025k0 = null;
        Bitmap bitmap2 = n7.f10027l0;
        Bitmap bitmap3 = this.f9936a;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.f9937b;
        if (equals && Objects.equals(n7.f10029m0, uri)) {
            return;
        }
        n7.f10027l0 = bitmap3;
        n7.f10033o0 = bitmap;
        n7.f10029m0 = uri;
        n7.f10035p0 = this.f9938c;
        n7.f10031n0 = true;
        n7.k();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        N n7 = this.f9939d;
        n7.f10031n0 = false;
        n7.f10033o0 = null;
        n7.f10035p0 = 0;
    }
}
