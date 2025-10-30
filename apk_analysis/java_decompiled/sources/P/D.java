package P;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class D extends C7.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f5537e;

    public D(int i9, Class cls, int i10, int i11, int i12) {
        this.f5537e = i12;
        this.f1634a = i9;
        this.f1637d = cls;
        this.f1636c = i10;
        this.f1635b = i11;
    }

    @Override // C7.f
    public final Object c(View view) {
        switch (this.f5537e) {
            case 0:
                return Boolean.valueOf(L.c(view));
            case 1:
                return L.a(view);
            case 2:
                return N.b(view);
            default:
                return Boolean.valueOf(L.b(view));
        }
    }

    @Override // C7.f
    public final void d(View view, Object obj) {
        switch (this.f5537e) {
            case 0:
                L.f(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                L.e(view, (CharSequence) obj);
                return;
            case 2:
                N.c(view, (CharSequence) obj);
                return;
            default:
                L.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // C7.f
    public final boolean g(Object obj, Object obj2) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        switch (this.f5537e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z13 = false;
                if (bool != null && bool.booleanValue()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z9 == z10) {
                    z13 = true;
                }
                return !z13;
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z14 = false;
                if (bool3 != null && bool3.booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (bool4 != null && bool4.booleanValue()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z11 == z12) {
                    z14 = true;
                }
                return !z14;
        }
    }
}
