package o8;

import J5.k;
import U3.C0394a;
import i8.G;
import i8.L;
import i8.z;
import java.util.ArrayList;
import kotlin.jvm.internal.h;
import n8.g;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final g f21752a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21753b;

    /* renamed from: c, reason: collision with root package name */
    public final int f21754c;

    /* renamed from: d, reason: collision with root package name */
    public final k f21755d;

    /* renamed from: e, reason: collision with root package name */
    public final G f21756e;

    /* renamed from: f, reason: collision with root package name */
    public final int f21757f;

    /* renamed from: g, reason: collision with root package name */
    public final int f21758g;

    /* renamed from: h, reason: collision with root package name */
    public final int f21759h;

    /* renamed from: i, reason: collision with root package name */
    public int f21760i;

    public d(g call, ArrayList arrayList, int i9, k kVar, G request, int i10, int i11, int i12) {
        h.e(call, "call");
        h.e(request, "request");
        this.f21752a = call;
        this.f21753b = arrayList;
        this.f21754c = i9;
        this.f21755d = kVar;
        this.f21756e = request;
        this.f21757f = i10;
        this.f21758g = i11;
        this.f21759h = i12;
    }

    public static d a(d dVar, int i9, k kVar, G g9, int i10) {
        if ((i10 & 1) != 0) {
            i9 = dVar.f21754c;
        }
        int i11 = i9;
        if ((i10 & 2) != 0) {
            kVar = dVar.f21755d;
        }
        k kVar2 = kVar;
        if ((i10 & 4) != 0) {
            g9 = dVar.f21756e;
        }
        G request = g9;
        h.e(request, "request");
        return new d(dVar.f21752a, dVar.f21753b, i11, kVar2, request, dVar.f21757f, dVar.f21758g, dVar.f21759h);
    }

    public final L b(G request) {
        h.e(request, "request");
        ArrayList arrayList = this.f21753b;
        int size = arrayList.size();
        int i9 = this.f21754c;
        if (i9 < size) {
            this.f21760i++;
            k kVar = this.f21755d;
            if (kVar != null) {
                if (((C0394a) kVar.f4225c).d(request.f19005a)) {
                    if (this.f21760i != 1) {
                        throw new IllegalStateException(("network interceptor " + arrayList.get(i9 - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + arrayList.get(i9 - 1) + " must retain the same host and port").toString());
                }
            }
            int i10 = i9 + 1;
            d a5 = a(this, i10, null, request, 58);
            z zVar = (z) arrayList.get(i9);
            L a9 = zVar.a(a5);
            if (a9 != null) {
                if (kVar != null && i10 < arrayList.size() && a5.f21760i != 1) {
                    throw new IllegalStateException(("network interceptor " + zVar + " must call proceed() exactly once").toString());
                }
                if (a9.f19035g != null) {
                    return a9;
                }
                throw new IllegalStateException(("interceptor " + zVar + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + zVar + " returned null");
        }
        throw new IllegalStateException("Check failed.");
    }
}
