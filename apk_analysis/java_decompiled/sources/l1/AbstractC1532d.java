package l1;

import android.content.Context;
import b5.G1;
import d2.v;
import e1.q;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import k1.AbstractC1480b;
import q1.InterfaceC1871a;

/* renamed from: l1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1532d {

    /* renamed from: f, reason: collision with root package name */
    public static final String f20170f = q.j("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1871a f20171a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f20172b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f20173c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f20174d = new LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public Object f20175e;

    public AbstractC1532d(Context context, InterfaceC1871a interfaceC1871a) {
        this.f20172b = context.getApplicationContext();
        this.f20171a = interfaceC1871a;
    }

    public abstract Object a();

    public final void b(AbstractC1480b abstractC1480b) {
        synchronized (this.f20173c) {
            try {
                if (this.f20174d.remove(abstractC1480b) && this.f20174d.isEmpty()) {
                    e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.f20173c) {
            try {
                Object obj2 = this.f20175e;
                if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                    this.f20175e = obj;
                    ((D4.q) ((G1) this.f20171a).f10719d).execute(new v(this, 11, new ArrayList(this.f20174d)));
                }
            } finally {
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
