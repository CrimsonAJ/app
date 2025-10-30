package q8;

import java.io.IOException;

/* loaded from: classes.dex */
public final class i extends m8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22478e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22479f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f22480g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, Object obj, Object obj2, int i9) {
        super(str, true);
        this.f22478e = i9;
        this.f22479f = obj;
        this.f22480g = obj2;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.jvm.internal.o, java.lang.Object] */
    @Override // m8.a
    public final long a() {
        long a5;
        v[] vVarArr;
        v[] vVarArr2;
        int i9 = 0;
        switch (this.f22478e) {
            case 0:
                n nVar = (n) this.f22479f;
                nVar.f22496a.a(nVar, (z) ((kotlin.jvm.internal.o) this.f22480g).f20159a);
                return -1L;
            case 1:
                try {
                    ((n) this.f22479f).f22496a.b((v) this.f22480g);
                } catch (IOException e8) {
                    s8.p pVar = s8.p.f22822a;
                    s8.p pVar2 = s8.p.f22822a;
                    String str = "Http2Connection.Listener failure for " + ((n) this.f22479f).f22498c;
                    pVar2.getClass();
                    s8.p.i(str, 4, e8);
                    try {
                        ((v) this.f22480g).c(2, e8);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                M1.w wVar = (M1.w) this.f22479f;
                z zVar = (z) this.f22480g;
                ?? obj = new Object();
                n nVar2 = (n) wVar.f4759c;
                synchronized (nVar2.f22517w) {
                    synchronized (nVar2) {
                        try {
                            z zVar2 = nVar2.f22511q;
                            z zVar3 = new z();
                            zVar3.b(zVar2);
                            zVar3.b(zVar);
                            obj.f20159a = zVar3;
                            a5 = zVar3.a() - zVar2.a();
                            if (a5 != 0 && !nVar2.f22497b.isEmpty()) {
                                vVarArr = (v[]) nVar2.f22497b.values().toArray(new v[0]);
                                vVarArr2 = vVarArr;
                                z zVar4 = (z) obj.f20159a;
                                kotlin.jvm.internal.h.e(zVar4, "<set-?>");
                                nVar2.f22511q = zVar4;
                                nVar2.j.c(new i(nVar2.f22498c + " onSettings", nVar2, obj, i9), 0L);
                            }
                            vVarArr = null;
                            vVarArr2 = vVarArr;
                            z zVar42 = (z) obj.f20159a;
                            kotlin.jvm.internal.h.e(zVar42, "<set-?>");
                            nVar2.f22511q = zVar42;
                            nVar2.j.c(new i(nVar2.f22498c + " onSettings", nVar2, obj, i9), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        nVar2.f22517w.a((z) obj.f20159a);
                    } catch (IOException e9) {
                        nVar2.a(2, 2, e9);
                    }
                }
                if (vVarArr2 != null) {
                    int length = vVarArr2.length;
                    while (i9 < length) {
                        v vVar = vVarArr2[i9];
                        synchronized (vVar) {
                            vVar.f22554f += a5;
                            if (a5 > 0) {
                                vVar.notifyAll();
                            }
                        }
                        i9++;
                    }
                }
                return -1L;
        }
    }
}
