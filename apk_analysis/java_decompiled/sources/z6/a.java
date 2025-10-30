package z6;

import C0.e;
import c7.C0784d;
import com.google.firebase.messaging.u;
import f5.AbstractC1176h;
import f5.C1177i;
import f5.C1185q;
import java.util.concurrent.atomic.AtomicBoolean;
import s4.i;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final e f25500a = new e(0);

    public static C1185q a(AbstractC1176h abstractC1176h, AbstractC1176h abstractC1176h2) {
        u uVar = new u(4);
        C1177i c1177i = new C1177i((i) uVar.f16512a);
        C0784d c0784d = new C0784d(c1177i, new AtomicBoolean(false), uVar, 8);
        e eVar = f25500a;
        abstractC1176h.e(eVar, c0784d);
        abstractC1176h2.e(eVar, c0784d);
        return c1177i.f17413a;
    }
}
