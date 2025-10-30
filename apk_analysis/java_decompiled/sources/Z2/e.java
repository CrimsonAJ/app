package Z2;

import a3.InterfaceC0491b;
import android.content.Context;
import d0.o;
import f3.j;

/* loaded from: classes.dex */
public final class e implements InterfaceC0491b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8957a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8958b;

    public /* synthetic */ e(int i9, Object obj) {
        this.f8957a = i9;
        this.f8958b = obj;
    }

    @Override // z7.InterfaceC2251a
    public final Object get() {
        switch (this.f8957a) {
            case 0:
                return new d((Context) ((e) this.f8958b).f8958b, new o(3), new e0.c(2));
            case 1:
                String packageName = ((Context) ((e) this.f8958b).f8958b).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 2:
                return new j(Integer.valueOf(j.f17352d).intValue(), (Context) ((e) this.f8958b).f8958b, "com.google.android.datatransport.events");
            default:
                return this.f8958b;
        }
    }
}
