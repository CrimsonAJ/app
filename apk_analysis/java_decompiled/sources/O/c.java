package O;

import kotlin.jvm.internal.h;
import w.C2123c;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5250a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f5251b;

    /* renamed from: c, reason: collision with root package name */
    public int f5252c;

    public c(int i9) {
        this.f5250a = 0;
        if (i9 > 0) {
            this.f5251b = new Object[i9];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    public Object a() {
        switch (this.f5250a) {
            case 0:
                int i9 = this.f5252c;
                if (i9 <= 0) {
                    return null;
                }
                int i10 = i9 - 1;
                Object[] objArr = this.f5251b;
                Object obj = objArr[i10];
                h.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
                objArr[i10] = null;
                this.f5252c--;
                return obj;
            default:
                int i11 = this.f5252c;
                if (i11 <= 0) {
                    return null;
                }
                int i12 = i11 - 1;
                Object[] objArr2 = this.f5251b;
                Object obj2 = objArr2[i12];
                objArr2[i12] = null;
                this.f5252c = i11 - 1;
                return obj2;
        }
    }

    public void b(C2123c c2123c) {
        int i9 = this.f5252c;
        Object[] objArr = this.f5251b;
        if (i9 < objArr.length) {
            objArr[i9] = c2123c;
            this.f5252c = i9 + 1;
        }
    }

    public boolean c(Object instance) {
        Object[] objArr;
        boolean z9;
        h.e(instance, "instance");
        int i9 = this.f5252c;
        int i10 = 0;
        while (true) {
            objArr = this.f5251b;
            if (i10 < i9) {
                if (objArr[i10] == instance) {
                    z9 = true;
                    break;
                }
                i10++;
            } else {
                z9 = false;
                break;
            }
        }
        if (!z9) {
            int i11 = this.f5252c;
            if (i11 >= objArr.length) {
                return false;
            }
            objArr[i11] = instance;
            this.f5252c = i11 + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    public c() {
        this.f5250a = 1;
        this.f5251b = new Object[256];
    }
}
