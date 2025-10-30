package androidx.mediarouter.app;

import a.AbstractC0485a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

/* renamed from: androidx.mediarouter.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC0565a extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final int f10059a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f10060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaRouteButton f10061c;

    public AsyncTaskC0565a(MediaRouteButton mediaRouteButton, int i9, Context context) {
        this.f10061c = mediaRouteButton;
        this.f10059a = i9;
        this.f10060b = context;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        SparseArray sparseArray = MediaRouteButton.f9981p;
        int i9 = this.f10059a;
        if (((Drawable.ConstantState) sparseArray.get(i9)) == null) {
            return AbstractC0485a.q(this.f10060b, i9);
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            MediaRouteButton.f9981p.put(this.f10059a, drawable.getConstantState());
        }
        this.f10061c.f9990g = null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Drawable drawable = (Drawable) obj;
        int i9 = this.f10059a;
        MediaRouteButton mediaRouteButton = this.f10061c;
        if (drawable != null) {
            MediaRouteButton.f9981p.put(i9, drawable.getConstantState());
            mediaRouteButton.f9990g = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) MediaRouteButton.f9981p.get(i9);
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            mediaRouteButton.f9990g = null;
        }
        mediaRouteButton.setRemoteIndicatorDrawableInternal(drawable);
    }
}
