package b5;

import java.util.HashSet;
import s.C1935e;

/* renamed from: b5.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0616c extends D1 {

    /* renamed from: d, reason: collision with root package name */
    public String f11044d;

    /* renamed from: e, reason: collision with root package name */
    public HashSet f11045e;

    /* renamed from: f, reason: collision with root package name */
    public C1935e f11046f;

    /* renamed from: g, reason: collision with root package name */
    public Long f11047g;

    /* renamed from: h, reason: collision with root package name */
    public Long f11048h;

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final java.util.ArrayList p0(java.lang.String r41, java.util.List r42, java.util.List r43, java.lang.Long r44, java.lang.Long r45, boolean r46) {
        /*
            Method dump skipped, instructions count: 2801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.C0616c.p0(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long, boolean):java.util.ArrayList");
    }

    public final R1 q0(Integer num) {
        if (this.f11046f.containsKey(num)) {
            return (R1) this.f11046f.get(num);
        }
        R1 r1 = new R1(this, this.f11044d);
        this.f11046f.put(num, r1);
        return r1;
    }

    @Override // b5.D1
    public final void o0() {
    }
}
