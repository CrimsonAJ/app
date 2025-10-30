package d8;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16996e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f16997f = AtomicLongFieldUpdater.newUpdater(n.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final G6.a f16998g = new G6.a("REMOVE_FROZEN", 3);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f16999a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17000b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17001c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f17002d;

    public n(int i9, boolean z9) {
        this.f16999a = i9;
        this.f17000b = z9;
        int i10 = i9 - 1;
        this.f17001c = i10;
        this.f17002d = new AtomicReferenceArray(i9);
        if (i10 <= 1073741823) {
            if ((i9 & i10) == 0) {
                return;
            } else {
                throw new IllegalStateException("Check failed.");
            }
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16997f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                if ((2305843009213693952L & j) != 0) {
                    return 2;
                }
                return 1;
            }
            int i9 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            int i11 = this.f17001c;
            if (((i10 + 2) & i11) != (i9 & i11)) {
                AtomicReferenceArray atomicReferenceArray = this.f17002d;
                if (!this.f17000b && atomicReferenceArray.get(i10 & i11) != null) {
                    int i12 = this.f16999a;
                    if (i12 < 1024 || ((i10 - i9) & 1073741823) > (i12 >> 1)) {
                        return 1;
                    }
                } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i10 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i10 & i11, runnable);
                    n nVar = this;
                    while ((atomicLongFieldUpdater.get(nVar) & 1152921504606846976L) != 0) {
                        nVar = nVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVar.f17002d;
                        int i13 = nVar.f17001c & i10;
                        Object obj = atomicReferenceArray2.get(i13);
                        if ((obj instanceof m) && ((m) obj).f16995a == i10) {
                            atomicReferenceArray2.set(i13, runnable);
                        } else {
                            nVar = null;
                        }
                        if (nVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f16997f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f16997f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j4 = 1152921504606846976L | j;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j, j4)) {
                j = j4;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16996e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f16999a * 2, nVar.f17000b);
            int i9 = (int) (1073741823 & j);
            int i10 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i11 = nVar.f17001c;
                int i12 = i9 & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object obj = nVar.f17002d.get(i12);
                if (obj == null) {
                    obj = new m(i9);
                }
                nVar3.f17002d.set(nVar3.f17001c & i9, obj);
                i9++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f16997f;
            long j = atomicLongFieldUpdater.get(nVar);
            if ((j & 1152921504606846976L) != 0) {
                return f16998g;
            }
            int i9 = (int) (j & 1073741823);
            int i10 = nVar.f17001c;
            int i11 = ((int) ((1152921503533105152L & j) >> 30)) & i10;
            int i12 = i10 & i9;
            if (i11 == i12) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = nVar.f17002d;
            Object obj = atomicReferenceArray.get(i12);
            boolean z9 = nVar.f17000b;
            if (obj == null) {
                if (z9) {
                    break;
                }
            } else {
                if (obj instanceof m) {
                    break;
                }
                long j4 = (i9 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(nVar, j, (j & (-1073741824)) | j4)) {
                    atomicReferenceArray.set(i12, null);
                    return obj;
                }
                nVar = this;
                if (z9) {
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f16997f;
                        long j9 = atomicLongFieldUpdater2.get(nVar);
                        int i13 = (int) (j9 & 1073741823);
                        if ((j9 & 1152921504606846976L) != 0) {
                            nVar = nVar.c();
                        } else {
                            n nVar2 = nVar;
                            nVar = nVar2;
                            if (atomicLongFieldUpdater2.compareAndSet(nVar2, j9, (j9 & (-1073741824)) | j4)) {
                                nVar.f17002d.set(nVar.f17001c & i13, null);
                                nVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (nVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
