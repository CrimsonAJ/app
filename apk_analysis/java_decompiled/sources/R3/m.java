package R3;

import P5.F;
import j3.M;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l4.AbstractC1566a;
import l4.y;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public final M f6631a;

    /* renamed from: b, reason: collision with root package name */
    public final F f6632b;

    /* renamed from: c, reason: collision with root package name */
    public final long f6633c;

    /* renamed from: d, reason: collision with root package name */
    public final List f6634d;

    /* renamed from: e, reason: collision with root package name */
    public final j f6635e;

    public m(M m9, F f9, s sVar, ArrayList arrayList) {
        List unmodifiableList;
        AbstractC1566a.h(!f9.isEmpty());
        this.f6631a = m9;
        this.f6632b = F.o(f9);
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = Collections.unmodifiableList(arrayList);
        }
        this.f6634d = unmodifiableList;
        this.f6635e = sVar.a(this);
        this.f6633c = y.O(sVar.f6650c, 1000000L, sVar.f6649b);
    }

    public abstract String a();

    public abstract Q3.i b();

    public abstract j e();
}
