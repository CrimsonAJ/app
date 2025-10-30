package t4;

import D4.InterfaceC0093l;
import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.C;
import f5.C1177i;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final /* synthetic */ class w implements InterfaceC0093l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2009A f23276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f23277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f23278d;

    public /* synthetic */ w(C2009A c2009a, String str, String str2, int i9) {
        this.f23275a = i9;
        this.f23276b = c2009a;
        this.f23277c = str;
        this.f23278d = str2;
    }

    @Override // D4.InterfaceC0093l
    public final void H(Object obj, Object obj2) {
        boolean z9;
        boolean z10;
        switch (this.f23275a) {
            case 0:
                y4.w wVar = (y4.w) obj;
                C1177i c1177i = (C1177i) obj2;
                y4.b bVar = C2009A.f23120G;
                C2009A c2009a = this.f23276b;
                if (c2009a.f23127F == 3) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                F4.y.j("Not connected to device", z9);
                Context context = wVar.f2370c;
                C4.g gVar = new C4.g(-1, -1, 0, true);
                y4.g gVar2 = (y4.g) wVar.u();
                C4.f fVar = new C4.f(gVar);
                Parcel Q7 = gVar2.Q();
                Q7.writeString(this.f23277c);
                Q7.writeString(this.f23278d);
                int i9 = C.f14693a;
                Q7.writeInt(0);
                C.c(Q7, fVar);
                gVar2.i1(Q7, 14);
                synchronized (c2009a.f23135r) {
                    try {
                        if (c2009a.f23132o != null) {
                            c2009a.h(2477);
                        }
                        c2009a.f23132o = c1177i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                String str = this.f23277c;
                String str2 = this.f23278d;
                y4.w wVar2 = (y4.w) obj;
                C1177i c1177i2 = (C1177i) obj2;
                C2009A c2009a2 = this.f23276b;
                AtomicLong atomicLong = c2009a2.f23134q;
                HashMap hashMap = c2009a2.f23123B;
                long incrementAndGet = atomicLong.incrementAndGet();
                if (c2009a2.f23127F == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                F4.y.j("Not connected to device", z10);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), c1177i2);
                    Context context2 = wVar2.f2370c;
                    C4.f fVar2 = new C4.f(new C4.g(-1, -1, 0, true));
                    y4.g gVar3 = (y4.g) wVar2.u();
                    Parcel Q8 = gVar3.Q();
                    Q8.writeString(str);
                    Q8.writeString(str2);
                    Q8.writeLong(incrementAndGet);
                    C.c(Q8, fVar2);
                    gVar3.i1(Q8, 9);
                    return;
                } catch (RemoteException e8) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    c1177i2.a(e8);
                    return;
                }
        }
    }
}
