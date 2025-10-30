package G6;

import android.support.v4.media.session.y;
import android.util.Log;
import c7.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import k4.C1499E;
import org.json.JSONException;
import org.json.JSONObject;
import y6.l;
import y6.p;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2885a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2886b;

    public /* synthetic */ d(int i9, Object obj) {
        this.f2885a = i9;
        this.f2886b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        d7.e eVar;
        FileInputStream fileInputStream;
        Throwable th;
        switch (this.f2885a) {
            case 0:
                e eVar2 = (e) ((A1.g) this.f2886b).f19c;
                g gVar = (g) eVar2.f2888b;
                a aVar = (a) eVar2.f2892f;
                String str = aVar.f2875b;
                z6.d.b();
                try {
                    HashMap b9 = a.b(gVar);
                    y yVar = new y(str, b9);
                    yVar.O("User-Agent", "Crashlytics Android SDK/19.4.4");
                    yVar.O("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    a.a(yVar, gVar);
                    String str2 = "Requesting settings from " + str;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str2, null);
                    }
                    String str3 = "Settings query params were: " + b9;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str3, null);
                    }
                    return aVar.c(yVar.H());
                } catch (IOException e8) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e8);
                    return null;
                }
            case 1:
                return ((n) this.f2886b).a();
            case 2:
                d7.n nVar = (d7.n) this.f2886b;
                synchronized (nVar) {
                    eVar = null;
                    try {
                        fileInputStream = nVar.f16956a.openFileInput(nVar.f16957b);
                        try {
                            int available = fileInputStream.available();
                            byte[] bArr = new byte[available];
                            fileInputStream.read(bArr, 0, available);
                            eVar = d7.e.a(new JSONObject(new String(bArr, "UTF-8")));
                            fileInputStream.close();
                        } catch (FileNotFoundException | JSONException unused) {
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            return eVar;
                        } catch (Throwable th2) {
                            th = th2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStream = null;
                    } catch (Throwable th3) {
                        fileInputStream = null;
                        th = th3;
                    }
                }
                return eVar;
            default:
                l lVar = ((p) this.f2886b).f25092g;
                lVar.getClass();
                z6.d.a();
                C1499E c1499e = lVar.f25064c;
                String str4 = (String) c1499e.f19985b;
                E6.e eVar3 = (E6.e) c1499e.f19986c;
                eVar3.getClass();
                boolean z9 = true;
                if (!new File((File) eVar3.f1969c, str4).exists()) {
                    String e9 = lVar.e();
                    if (e9 == null || !lVar.j.c(e9)) {
                        z9 = false;
                    }
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    String str5 = (String) c1499e.f19985b;
                    eVar3.getClass();
                    new File((File) eVar3.f1969c, str5).delete();
                }
                return Boolean.valueOf(z9);
        }
    }
}
