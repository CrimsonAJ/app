package b5;

import android.app.Service;
import android.content.Intent;
import b7.C0701c;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10979a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10981c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f10982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Cloneable f10983e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ V0(Y y9, int i9, IOException iOException, byte[] bArr, Map map) {
        this.f10981c = y9;
        this.f10980b = i9;
        this.f10982d = iOException;
        this.f10983e = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10979a) {
            case 0:
                ((U0) ((Y) this.f10981c).f10994e).f(this.f10980b, (IOException) this.f10982d, (byte[]) this.f10983e);
                return;
            default:
                Service service = (Service) ((C0701c) this.f10981c).f11404b;
                InterfaceC0657p1 interfaceC0657p1 = (InterfaceC0657p1) service;
                int i9 = this.f10980b;
                if (interfaceC0657p1.k(i9)) {
                    ((V) this.f10982d).f10978n.c(Integer.valueOf(i9), "Local AppMeasurementService processed last upload request. StartId");
                    V v8 = C0650n0.l(service, null, null).f11229i;
                    C0650n0.f(v8);
                    v8.f10978n.b("Completed wakeful intent.");
                    interfaceC0657p1.l((Intent) this.f10983e);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ V0(C0701c c0701c, int i9, V v8, Intent intent) {
        this.f10981c = c0701c;
        this.f10980b = i9;
        this.f10982d = v8;
        this.f10983e = intent;
    }
}
