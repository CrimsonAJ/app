package f1;

import android.text.TextUtils;
import e1.q;
import e1.s;
import e1.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import o1.RunnableC1669d;
import s8.n;

/* loaded from: classes.dex */
public final class e extends n {

    /* renamed from: u, reason: collision with root package name */
    public static final String f17275u = q.j("WorkContinuationImpl");

    /* renamed from: m, reason: collision with root package name */
    public final k f17276m;

    /* renamed from: n, reason: collision with root package name */
    public final String f17277n;

    /* renamed from: o, reason: collision with root package name */
    public final int f17278o;

    /* renamed from: p, reason: collision with root package name */
    public final List f17279p;

    /* renamed from: q, reason: collision with root package name */
    public final ArrayList f17280q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f17281r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public boolean f17282s;

    /* renamed from: t, reason: collision with root package name */
    public O0.c f17283t;

    public e(k kVar, String str, int i9, List list) {
        this.f17276m = kVar;
        this.f17277n = str;
        this.f17278o = i9;
        this.f17279p = list;
        this.f17280q = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            String uuid = ((s) list.get(i10)).f17066a.toString();
            this.f17280q.add(uuid);
            this.f17281r.add(uuid);
        }
    }

    public static HashSet g0(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }

    public final w f0() {
        if (!this.f17282s) {
            RunnableC1669d runnableC1669d = new RunnableC1669d(this);
            this.f17276m.f17301k.i(runnableC1669d);
            this.f17283t = runnableC1669d.f21466b;
        } else {
            q.d().k(f17275u, A0.a.n("Already enqueued work ids (", TextUtils.join(", ", this.f17280q), ")"), new Throwable[0]);
        }
        return this.f17283t;
    }
}
