package androidx.mediarouter.app;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

/* renamed from: androidx.mediarouter.app.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC0579o extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f10109a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f10110b;

    /* renamed from: c, reason: collision with root package name */
    public int f10111c;

    /* renamed from: d, reason: collision with root package name */
    public long f10112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s f10113e;

    public AsyncTaskC0579o(s sVar) {
        Bitmap bitmap;
        this.f10113e = sVar;
        MediaDescriptionCompat mediaDescriptionCompat = sVar.f10169t0;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.f9244e;
        }
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.f10109a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = sVar.f10169t0;
        this.f10110b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.f9245f : null;
    }

    public final BufferedInputStream a(Uri uri) {
        InputStream openInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if (!"android.resource".equals(lowerCase) && !"content".equals(lowerCase) && !"file".equals(lowerCase)) {
            URLConnection openConnection = new URL(uri.toString()).openConnection();
            int i9 = s.f10123N0;
            openConnection.setConnectTimeout(i9);
            openConnection.setReadTimeout(i9);
            openInputStream = openConnection.getInputStream();
        } else {
            openInputStream = this.f10113e.j.getContentResolver().openInputStream(uri);
        }
        if (openInputStream == null) {
            return null;
        }
        return new BufferedInputStream(openInputStream);
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x002f: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:48), block:B:61:0x002f */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f0  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.mediarouter.app.AsyncTaskC0579o.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        s sVar = this.f10113e;
        sVar.f10171u0 = null;
        Bitmap bitmap2 = sVar.f10173v0;
        Bitmap bitmap3 = this.f10109a;
        boolean equals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.f10110b;
        if (equals && Objects.equals(sVar.f10175w0, uri)) {
            return;
        }
        sVar.f10173v0 = bitmap3;
        sVar.f10179y0 = bitmap;
        sVar.f10175w0 = uri;
        sVar.f10181z0 = this.f10111c;
        boolean z9 = true;
        sVar.f10177x0 = true;
        if (SystemClock.uptimeMillis() - this.f10112d <= 120) {
            z9 = false;
        }
        sVar.p(z9);
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        this.f10112d = SystemClock.uptimeMillis();
        s sVar = this.f10113e;
        sVar.f10177x0 = false;
        sVar.f10179y0 = null;
        sVar.f10181z0 = 0;
    }
}
