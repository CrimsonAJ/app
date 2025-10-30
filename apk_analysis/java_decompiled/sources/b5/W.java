package b5;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import i8.C1411a;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10984a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f10985b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10986c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10987d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10988e;

    public W(long j, Bundle bundle, String str, String str2) {
        this.f10986c = str;
        this.f10987d = str2;
        this.f10988e = bundle;
        this.f10985b = j;
    }

    public static W e(C0665t c0665t) {
        Bundle f9 = c0665t.f11310b.f();
        return new W(c0665t.f11312d, f9, c0665t.f11309a, c0665t.f11311c);
    }

    public boolean a(C1411a c1411a, n8.g call, List list, boolean z9) {
        kotlin.jvm.internal.h.e(call, "call");
        Iterator it = ((ConcurrentLinkedQueue) this.f10988e).iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            n8.i connection = (n8.i) it.next();
            kotlin.jvm.internal.h.d(connection, "connection");
            synchronized (connection) {
                if (z9) {
                    if (connection.f21282g != null) {
                        z10 = true;
                    }
                    if (!z10) {
                        continue;
                    }
                }
                if (connection.i(c1411a, list)) {
                    call.c(connection);
                    return true;
                }
            }
        }
    }

    public int b(n8.i iVar, long j) {
        byte[] bArr = k8.c.f20141a;
        ArrayList arrayList = iVar.f21290p;
        int i9 = 0;
        while (i9 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i9);
            if (reference.get() != null) {
                i9++;
            } else {
                String str = "A connection to " + iVar.f21277b.f19046a.f19063h + " was leaked. Did you forget to close a response body?";
                s8.p pVar = s8.p.f22822a;
                s8.p.f22822a.k(((n8.e) reference).f21260a, str);
                arrayList.remove(i9);
                iVar.j = true;
                if (arrayList.isEmpty()) {
                    iVar.f21291q = j - this.f10985b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public C0665t c() {
        C0663s c0663s = new C0663s(new Bundle((Bundle) this.f10988e));
        return new C0665t((String) this.f10986c, c0663s, (String) this.f10987d, this.f10985b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0109, code lost:
    
        if (r12 == null) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.measurement.V0 d(com.google.android.gms.internal.measurement.V0 r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.W.d(com.google.android.gms.internal.measurement.V0, java.lang.String):com.google.android.gms.internal.measurement.V0");
    }

    public String toString() {
        switch (this.f10984a) {
            case 0:
                return "origin=" + ((String) this.f10987d) + ",name=" + ((String) this.f10986c) + ",params=" + ((Bundle) this.f10988e).toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ W(C0616c c0616c) {
        this.f10988e = c0616c;
    }

    public W(m8.c taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        kotlin.jvm.internal.h.e(taskRunner, "taskRunner");
        kotlin.jvm.internal.h.e(timeUnit, "timeUnit");
        this.f10985b = timeUnit.toNanos(5L);
        this.f10986c = taskRunner.e();
        this.f10987d = new l8.f(this, AbstractC0953k1.q(new StringBuilder(), k8.c.f20147g, " ConnectionPool"), 2);
        this.f10988e = new ConcurrentLinkedQueue();
    }
}
