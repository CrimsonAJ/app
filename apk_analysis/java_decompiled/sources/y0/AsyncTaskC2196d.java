package y0;

import N1.h;
import android.os.AsyncTask;
import android.util.Log;
import co.notix.b6;
import co.notix.j6;
import co.notix.q8;
import d0.n;

/* renamed from: y0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC2196d extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f24745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f24746b;

    public AsyncTaskC2196d(n nVar, h hVar) {
        this.f24746b = nVar;
        this.f24745a = hVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        try {
            return this.f24746b.a();
        } catch (Exception e8) {
            Log.e("Palette", "Exception thrown during async generate", e8);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        h hVar = this.f24745a;
        q8.a((j6) hVar.f4850b, (b6) hVar.f4851c, (C2198f) obj);
    }
}
