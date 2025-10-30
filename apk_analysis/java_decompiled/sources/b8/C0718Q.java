package b8;

import Y7.C0464h;
import a8.EnumC0509a;
import c8.AbstractC0792b;
import c8.AbstractC0793c;
import c8.AbstractC0794d;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: b8.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0718Q extends AbstractC0792b implements InterfaceC0707F, InterfaceC0725e, c8.v {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f11454f = AtomicReferenceFieldUpdater.newUpdater(C0718Q.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public int f11455e;

    public C0718Q(Object obj) {
        this._state$volatile = obj;
    }

    @Override // c8.v
    public final InterfaceC0725e a(E7.i iVar, int i9, EnumC0509a enumC0509a) {
        if (((i9 >= 0 && i9 < 2) || i9 == -2) && enumC0509a == EnumC0509a.f9185b) {
            return this;
        }
        return AbstractC0714M.n(this, iVar, i9, enumC0509a);
    }

    @Override // c8.AbstractC0792b
    public final AbstractC0794d c() {
        return new C0719S();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c4, B:31:0x00de, B:37:0x00f0, B:33:0x00e7, B:36:0x00ed, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c4, B:31:0x00de, B:37:0x00f0, B:33:0x00e7, B:36:0x00ed, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c3 -> B:15:0x007d). Please report as a decompilation issue!!! */
    @Override // b8.InterfaceC0725e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(b8.InterfaceC0726f r17, E7.d r18) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.C0718Q.collect(b8.f, E7.d):java.lang.Object");
    }

    @Override // b8.InterfaceC0706E
    public final boolean d(Object obj) {
        i(obj);
        return true;
    }

    @Override // c8.AbstractC0792b
    public final AbstractC0794d[] e() {
        return new C0719S[2];
    }

    @Override // b8.InterfaceC0726f
    public final Object emit(Object obj, E7.d dVar) {
        i(obj);
        return A7.n.f558a;
    }

    public final boolean g(Object obj, Object obj2) {
        G6.a aVar = AbstractC0793c.f11752b;
        if (obj == null) {
            obj = aVar;
        }
        if (obj2 == null) {
            obj2 = aVar;
        }
        return j(obj, obj2);
    }

    public final Object h() {
        G6.a aVar = AbstractC0793c.f11752b;
        Object obj = f11454f.get(this);
        if (obj == aVar) {
            return null;
        }
        return obj;
    }

    public final void i(Object obj) {
        if (obj == null) {
            obj = AbstractC0793c.f11752b;
        }
        j(null, obj);
    }

    public final boolean j(Object obj, Object obj2) {
        int i9;
        AbstractC0794d[] abstractC0794dArr;
        G6.a aVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11454f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.h.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.h.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i10 = this.f11455e;
            if ((i10 & 1) == 0) {
                int i11 = i10 + 1;
                this.f11455e = i11;
                AbstractC0794d[] abstractC0794dArr2 = this.f11747a;
                while (true) {
                    C0719S[] c0719sArr = (C0719S[]) abstractC0794dArr2;
                    if (c0719sArr != null) {
                        for (C0719S c0719s : c0719sArr) {
                            if (c0719s != null) {
                                AtomicReference atomicReference = c0719s.f11456a;
                                while (true) {
                                    Object obj4 = atomicReference.get();
                                    if (obj4 != null && obj4 != (aVar = AbstractC0714M.f11443c)) {
                                        G6.a aVar2 = AbstractC0714M.f11442b;
                                        if (obj4 == aVar2) {
                                            while (!atomicReference.compareAndSet(obj4, aVar)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                        } else {
                                            while (!atomicReference.compareAndSet(obj4, aVar2)) {
                                                if (atomicReference.get() != obj4) {
                                                    break;
                                                }
                                            }
                                            ((C0464h) obj4).resumeWith(A7.n.f558a);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i9 = this.f11455e;
                        if (i9 == i11) {
                            this.f11455e = i11 + 1;
                            return true;
                        }
                        abstractC0794dArr = this.f11747a;
                    }
                    abstractC0794dArr2 = abstractC0794dArr;
                    i11 = i9;
                }
            } else {
                this.f11455e = i10 + 2;
                return true;
            }
        }
    }
}
