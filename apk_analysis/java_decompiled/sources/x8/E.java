package x8;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final D f24612a = new D(new byte[0], 0, 0, false);

    /* renamed from: b, reason: collision with root package name */
    public static final int f24613b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f24614c;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f24613b = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i9 = 0; i9 < highestOneBit; i9++) {
            atomicReferenceArr[i9] = new AtomicReference();
        }
        f24614c = atomicReferenceArr;
    }

    public static final void a(D segment) {
        int i9;
        kotlin.jvm.internal.h.e(segment, "segment");
        if (segment.f24610f == null && segment.f24611g == null) {
            if (!segment.f24608d) {
                AtomicReference atomicReference = f24614c[(int) (Thread.currentThread().getId() & (f24613b - 1))];
                D d9 = f24612a;
                D d10 = (D) atomicReference.getAndSet(d9);
                if (d10 == d9) {
                    return;
                }
                if (d10 != null) {
                    i9 = d10.f24607c;
                } else {
                    i9 = 0;
                }
                if (i9 >= 65536) {
                    atomicReference.set(d10);
                    return;
                }
                segment.f24610f = d10;
                segment.f24606b = 0;
                segment.f24607c = i9 + 8192;
                atomicReference.set(segment);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static final D b() {
        AtomicReference atomicReference = f24614c[(int) (Thread.currentThread().getId() & (f24613b - 1))];
        D d9 = f24612a;
        D d10 = (D) atomicReference.getAndSet(d9);
        if (d10 == d9) {
            return new D();
        }
        if (d10 == null) {
            atomicReference.set(null);
            return new D();
        }
        atomicReference.set(d10.f24610f);
        d10.f24610f = null;
        d10.f24607c = 0;
        return d10;
    }
}
