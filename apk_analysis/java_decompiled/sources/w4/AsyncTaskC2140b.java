package w4;

import Y2.r;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.AbstractC0826h;
import com.google.android.gms.internal.cast.C;
import com.google.android.gms.internal.cast.C0834j;
import u4.C2080e;

/* renamed from: w4.b */
/* loaded from: classes.dex */
public final class AsyncTaskC2140b extends AsyncTask {

    /* renamed from: c */
    public static final y4.b f24156c = new y4.b("FetchBitmapTask", null);

    /* renamed from: a */
    public final e f24157a;

    /* renamed from: b */
    public final r f24158b;

    public AsyncTaskC2140b(Context context, int i9, int i10, r rVar) {
        e eVar;
        this.f24158b = rVar;
        Context applicationContext = context.getApplicationContext();
        u4.j jVar = new u4.j(this);
        y4.b bVar = AbstractC0826h.f14853a;
        try {
            C0834j b9 = AbstractC0826h.b(applicationContext.getApplicationContext());
            N4.b bVar2 = new N4.b(applicationContext.getApplicationContext());
            Parcel f12 = b9.f1(b9.Q(), 8);
            int readInt = f12.readInt();
            f12.recycle();
            if (readInt >= 233700000) {
                eVar = b9.n1(bVar2, new N4.b(this), jVar, i9, i10);
            } else {
                eVar = b9.m1(new N4.b(this), jVar, i9, i10);
            }
        } catch (RemoteException | C2080e e8) {
            AbstractC0826h.f14853a.a(e8, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", C0834j.class.getSimpleName());
            eVar = null;
        }
        this.f24157a = eVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        e eVar;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (eVar = this.f24157a) != null) {
            try {
                c cVar = (c) eVar;
                Parcel Q7 = cVar.Q();
                C.c(Q7, uri);
                Parcel f12 = cVar.f1(Q7, 1);
                Bitmap bitmap = (Bitmap) C.a(f12, Bitmap.CREATOR);
                f12.recycle();
                return bitmap;
            } catch (RemoteException e8) {
                f24156c.a(e8, "Unable to call %s on %s.", "doFetch", e.class.getSimpleName());
                return null;
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        r rVar = this.f24158b;
        if (rVar != null) {
            InterfaceC2139a interfaceC2139a = (InterfaceC2139a) rVar.f8651e;
            if (interfaceC2139a != null) {
                interfaceC2139a.p(bitmap);
            }
            rVar.f8650d = null;
        }
    }
}
