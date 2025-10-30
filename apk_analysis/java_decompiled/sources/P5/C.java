package P5;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5892a;

    /* renamed from: b, reason: collision with root package name */
    public int f5893b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5894c;

    public C() {
        AbstractC0349q.c(4, "initialCapacity");
        this.f5892a = new Object[4];
        this.f5893b = 0;
    }

    public static int e(int i9, int i10) {
        if (i10 >= 0) {
            int i11 = i9 + (i9 >> 1) + 1;
            if (i11 < i10) {
                i11 = Integer.highestOneBit(i10 - 1) << 1;
            }
            if (i11 < 0) {
                return Integer.MAX_VALUE;
            }
            return i11;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public final void a(Object obj) {
        obj.getClass();
        f(this.f5893b + 1);
        Object[] objArr = this.f5892a;
        int i9 = this.f5893b;
        this.f5893b = i9 + 1;
        objArr[i9] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        AbstractC0349q.a(length, objArr);
        f(this.f5893b + length);
        System.arraycopy(objArr, 0, this.f5892a, this.f5893b, length);
        this.f5893b += length;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(List list) {
        if (u0.z.i(list)) {
            f(list.size() + this.f5893b);
            if (list instanceof A) {
                this.f5893b = ((A) list).c(this.f5893b, this.f5892a);
                return;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public final S d() {
        this.f5894c = true;
        return F.k(this.f5893b, this.f5892a);
    }

    public final void f(int i9) {
        Object[] objArr = this.f5892a;
        if (objArr.length < i9) {
            this.f5892a = Arrays.copyOf(objArr, e(objArr.length, i9));
            this.f5894c = false;
        } else if (this.f5894c) {
            this.f5892a = (Object[]) objArr.clone();
            this.f5894c = false;
        }
    }
}
