package A4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import f5.AbstractC1176h;
import f5.C1185q;
import f5.InterfaceC1169a;
import f5.InterfaceC1175g;
import java.io.IOException;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC1169a, InterfaceC1175g {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f342b = new d(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ d f343c = new d(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ d f344d = new d(2);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f345a;

    public /* synthetic */ d(int i9) {
        this.f345a = i9;
    }

    @Override // f5.InterfaceC1169a
    public Object i(AbstractC1176h abstractC1176h) {
        switch (this.f345a) {
            case 0:
                if (abstractC1176h.j()) {
                    return (Bundle) abstractC1176h.g();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(abstractC1176h.f())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", abstractC1176h.f());
            default:
                Intent intent = (Intent) ((Bundle) abstractC1176h.g()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }

    @Override // f5.InterfaceC1175g
    public C1185q s(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i9 = b.f332h;
        if (bundle != null && bundle.containsKey("google.messenger")) {
            return s8.n.p(null);
        }
        return s8.n.p(bundle);
    }
}
