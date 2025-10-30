package t4;

import D4.InterfaceC0093l;
import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.cast.C;
import f5.C1177i;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements InterfaceC0093l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23279a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2009A f23280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23281c;

    public /* synthetic */ x(C2009A c2009a, String str) {
        this.f23280b = c2009a;
        this.f23281c = str;
    }

    @Override // D4.InterfaceC0093l
    public final void H(Object obj, Object obj2) {
        boolean z9;
        boolean z10;
        switch (this.f23279a) {
            case 0:
                y4.w wVar = (y4.w) obj;
                C1177i c1177i = (C1177i) obj2;
                if (this.f23280b.f23127F != 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                F4.y.j("Not active connection", z9);
                Context context = wVar.f2370c;
                C4.f fVar = new C4.f(new C4.g(-1, -1, 0, true));
                y4.g gVar = (y4.g) wVar.u();
                String str = this.f23281c;
                Parcel Q7 = gVar.Q();
                Q7.writeString(str);
                C.c(Q7, fVar);
                gVar.i1(Q7, 12);
                y4.g gVar2 = (y4.g) wVar.u();
                Parcel Q8 = gVar2.Q();
                Q8.writeString(str);
                C.c(Q8, fVar);
                gVar2.i1(Q8, 11);
                c1177i.b(null);
                return;
            default:
                C2009A c2009a = this.f23280b;
                String str2 = this.f23281c;
                y4.w wVar2 = (y4.w) obj;
                C1177i c1177i2 = (C1177i) obj2;
                y4.b bVar = C2009A.f23120G;
                if (c2009a.f23127F == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                F4.y.j("Not connected to device", z10);
                Context context2 = wVar2.f2370c;
                C4.g gVar3 = new C4.g(-1, -1, 0, true);
                y4.g gVar4 = (y4.g) wVar2.u();
                C4.f fVar2 = new C4.f(gVar3);
                Parcel Q9 = gVar4.Q();
                Q9.writeString(str2);
                C.c(Q9, fVar2);
                gVar4.i1(Q9, 5);
                synchronized (c2009a.f23136s) {
                    try {
                        if (c2009a.f23133p != null) {
                            c1177i2.a(F4.y.l(new Status(2001, null, null, null)));
                            return;
                        } else {
                            c2009a.f23133p = c1177i2;
                            return;
                        }
                    } finally {
                    }
                }
        }
    }

    public /* synthetic */ x(C2009A c2009a, String str, v4.h hVar) {
        this.f23280b = c2009a;
        this.f23281c = str;
    }
}
