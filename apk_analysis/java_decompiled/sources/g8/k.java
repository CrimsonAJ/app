package g8;

import d8.u;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class k extends u {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f17803e;

    public k(long j, k kVar, int i9) {
        super(j, kVar, i9);
        this.f17803e = new AtomicReferenceArray(j.f17802f);
    }

    @Override // d8.u
    public final int f() {
        return j.f17802f;
    }

    @Override // d8.u
    public final void g(int i9, E7.i iVar) {
        this.f17803e.set(i9, j.f17801e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f17007c + ", hashCode=" + hashCode() + ']';
    }
}
