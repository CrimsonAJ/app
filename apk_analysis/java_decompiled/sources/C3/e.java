package C3;

import P5.D;
import P5.F;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.mediarouter.app.DialogC0569e;
import androidx.mediarouter.app.N;
import i.G;
import i7.Y;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k4.C1499E;
import n3.C1625b;
import n3.C1628e;
import n3.C1635l;
import p0.C1835a;
import t0.AbstractC1986u;
import t0.C1966B;
import t0.C1971e;
import t0.C1975i;
import t0.C1987v;
import t0.T;

/* loaded from: classes.dex */
public final class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1441a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1442b;

    public /* synthetic */ e(int i9, Object obj) {
        this.f1441a = i9;
        this.f1442b = obj;
    }

    private final void a(Message message) {
        android.support.v4.media.session.t tVar;
        android.support.v4.media.session.r rVar;
        e eVar;
        if (message.what == 1) {
            synchronized (((android.support.v4.media.session.r) this.f1442b).f9311a) {
                tVar = (android.support.v4.media.session.t) ((android.support.v4.media.session.r) this.f1442b).f9314d.get();
                rVar = (android.support.v4.media.session.r) this.f1442b;
                eVar = rVar.f9315e;
            }
            if (tVar != null && rVar == tVar.b() && eVar != null) {
                tVar.f((C1835a) message.obj);
                ((android.support.v4.media.session.r) this.f1442b).a(tVar, eVar);
                tVar.f(null);
            }
        }
    }

    private final void b(Message message) {
        Set set;
        Pair pair = (Pair) message.obj;
        Object obj = pair.first;
        Object obj2 = pair.second;
        int i9 = message.what;
        if (i9 != 0) {
            if (i9 == 1) {
                C1625b c1625b = (C1625b) this.f1442b;
                if (obj == c1625b.f21089v && c1625b.i()) {
                    c1625b.f21089v = null;
                    if (obj2 instanceof Exception) {
                        c1625b.k((Exception) obj2, false);
                        return;
                    }
                    try {
                        byte[] h7 = c1625b.f21070b.h(c1625b.f21087t, (byte[]) obj2);
                        if (c1625b.f21088u != null && h7 != null && h7.length != 0) {
                            c1625b.f21088u = h7;
                        }
                        c1625b.f21081n = 4;
                        new k8.a(6);
                        l4.c cVar = c1625b.f21076h;
                        synchronized (cVar.f20487a) {
                            set = cVar.f20489c;
                        }
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((C1635l) it.next()).a();
                        }
                        return;
                    } catch (Exception e8) {
                        c1625b.k(e8, true);
                        return;
                    }
                }
                return;
            }
            return;
        }
        C1625b c1625b2 = (C1625b) this.f1442b;
        if (obj == c1625b2.f21090w) {
            if (c1625b2.f21081n == 2 || c1625b2.i()) {
                c1625b2.f21090w = null;
                boolean z9 = obj2 instanceof Exception;
                C1499E c1499e = c1625b2.f21071c;
                if (z9) {
                    c1499e.r((Exception) obj2, false);
                    return;
                }
                try {
                    c1625b2.f21070b.m((byte[]) obj2);
                    c1499e.f19986c = null;
                    HashSet hashSet = (HashSet) c1499e.f19985b;
                    F o9 = F.o(hashSet);
                    hashSet.clear();
                    D listIterator = o9.listIterator(0);
                    while (listIterator.hasNext()) {
                        C1625b c1625b3 = (C1625b) listIterator.next();
                        if (c1625b3.l()) {
                            c1625b3.h(true);
                        }
                    }
                } catch (Exception e9) {
                    c1499e.r(e9, true);
                }
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        String str;
        f fVar = null;
        String str2 = null;
        fVar = null;
        fVar = null;
        switch (this.f1441a) {
            case 0:
                g gVar = (g) this.f1442b;
                gVar.getClass();
                int i9 = msg.what;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            AtomicReference atomicReference = gVar.f1453d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(msg.what));
                            while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                            }
                        } else {
                            gVar.f1454e.d();
                        }
                    } else {
                        f fVar2 = (f) msg.obj;
                        int i10 = fVar2.f1443a;
                        MediaCodec.CryptoInfo cryptoInfo = fVar2.f1445c;
                        long j = fVar2.f1446d;
                        int i11 = fVar2.f1447e;
                        try {
                            synchronized (g.f1449h) {
                                gVar.f1450a.queueSecureInputBuffer(i10, 0, cryptoInfo, j, i11);
                            }
                        } catch (RuntimeException e8) {
                            AtomicReference atomicReference2 = gVar.f1453d;
                            while (!atomicReference2.compareAndSet(null, e8) && atomicReference2.get() == null) {
                            }
                        }
                        fVar = fVar2;
                    }
                } else {
                    f fVar3 = (f) msg.obj;
                    try {
                        gVar.f1450a.queueInputBuffer(fVar3.f1443a, 0, fVar3.f1444b, fVar3.f1446d, fVar3.f1447e);
                    } catch (RuntimeException e9) {
                        AtomicReference atomicReference3 = gVar.f1453d;
                        while (!atomicReference3.compareAndSet(null, e9) && atomicReference3.get() == null) {
                        }
                    }
                    fVar = fVar3;
                }
                if (fVar != null) {
                    g.c(fVar);
                    return;
                }
                return;
            case 1:
                a(msg);
                return;
            case 2:
                int i12 = msg.what;
                DialogC0569e dialogC0569e = (DialogC0569e) this.f1442b;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3 && dialogC0569e.f10076i.isEmpty()) {
                            dialogC0569e.i(3);
                            e eVar = dialogC0569e.f10089w;
                            eVar.removeMessages(2);
                            eVar.removeMessages(3);
                            eVar.removeMessages(1);
                            dialogC0569e.f10073f.h(dialogC0569e.f10074g);
                            return;
                        }
                        return;
                    }
                    if (dialogC0569e.f10076i.isEmpty()) {
                        dialogC0569e.i(2);
                        e eVar2 = dialogC0569e.f10089w;
                        eVar2.removeMessages(2);
                        eVar2.removeMessages(3);
                        eVar2.sendMessageDelayed(eVar2.obtainMessage(3), 15000L);
                        return;
                    }
                    return;
                }
                dialogC0569e.f((List) msg.obj);
                return;
            case 3:
                if (msg.what == 1) {
                    List list = (List) msg.obj;
                    androidx.mediarouter.app.A a5 = (androidx.mediarouter.app.A) this.f1442b;
                    a5.getClass();
                    a5.f9932p = SystemClock.uptimeMillis();
                    a5.j.clear();
                    a5.j.addAll(list);
                    a5.f9927k.n();
                    return;
                }
                return;
            case 4:
                int i13 = msg.what;
                N n7 = (N) this.f1442b;
                if (i13 != 1) {
                    if (i13 == 2 && n7.f10043w != null) {
                        n7.f10043w = null;
                        n7.n();
                        return;
                    }
                    return;
                }
                n7.m();
                return;
            case 5:
                kotlin.jvm.internal.h.e(msg, "msg");
                if (msg.what == 3) {
                    Bundle data = msg.getData();
                    if (data == null || (str = data.getString("SessionUpdateExtra")) == null) {
                        str = "";
                    }
                    Log.d("SessionLifecycleClient", "Session update received.");
                    Y7.B.r(Y7.B.a((E7.i) this.f1442b), null, new Y(str, null), 3);
                    return;
                }
                Log.w("SessionLifecycleClient", "Received unexpected event from the SessionLifecycleService: " + msg);
                super.handleMessage(msg);
                return;
            case 6:
                b(msg);
                return;
            case 7:
                byte[] bArr = (byte[]) msg.obj;
                if (bArr != null) {
                    ArrayList arrayList = ((C1628e) this.f1442b).j;
                    int size = arrayList.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList.get(i14);
                        i14++;
                        C1625b c1625b = (C1625b) obj;
                        if (Arrays.equals(c1625b.f21087t, bArr)) {
                            if (msg.what == 2 && c1625b.f21081n == 4) {
                                int i15 = l4.y.f20553a;
                                c1625b.h(false);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                int i16 = msg.what;
                int i17 = msg.arg1;
                Object obj2 = msg.obj;
                Bundle peekData = msg.peekData();
                C1975i c1975i = (C1975i) this.f1442b;
                T t7 = (T) c1975i.j.get(i17);
                if (t7 == null) {
                    Log.w("MR2Provider", "Pending callback not found for control request.");
                    return;
                }
                c1975i.j.remove(i17);
                if (i16 != 3) {
                    if (i16 == 4) {
                        if (peekData != null) {
                            str2 = peekData.getString("error");
                        }
                        T.a(str2, (Bundle) obj2);
                        return;
                    }
                    return;
                }
                t7.b((Bundle) obj2);
                return;
            default:
                int i18 = msg.what;
                AbstractC1986u abstractC1986u = (AbstractC1986u) this.f1442b;
                if (i18 != 1) {
                    if (i18 == 2) {
                        abstractC1986u.f23040f = false;
                        abstractC1986u.e(abstractC1986u.f23039e);
                        return;
                    }
                    return;
                }
                abstractC1986u.f23042h = false;
                G g9 = abstractC1986u.f23038d;
                if (g9 != null) {
                    C1987v c1987v = abstractC1986u.f23041g;
                    C1971e c1971e = (C1971e) g9.f17990b;
                    C1966B d9 = c1971e.d(abstractC1986u);
                    if (d9 != null) {
                        c1971e.n(d9, c1987v);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Looper looper, int i9) {
        super(looper);
        this.f1441a = i9;
        this.f1442b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(E7.i backgroundDispatcher) {
        super(Looper.getMainLooper());
        this.f1441a = 5;
        kotlin.jvm.internal.h.e(backgroundDispatcher, "backgroundDispatcher");
        this.f1442b = backgroundDispatcher;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C1975i c1975i) {
        super(Looper.getMainLooper());
        this.f1441a = 8;
        this.f1442b = c1975i;
    }
}
