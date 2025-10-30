package k1;

import android.os.Build;
import j1.C1431a;
import l1.AbstractC1532d;
import n1.C1613j;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1479a extends AbstractC1480b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f19870e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1479a(AbstractC1532d abstractC1532d, int i9) {
        super(abstractC1532d);
        this.f19870e = i9;
    }

    @Override // k1.AbstractC1480b
    public final boolean a(C1613j c1613j) {
        switch (this.f19870e) {
            case 0:
                return c1613j.j.f17032b;
            case 1:
                return c1613j.j.f17034d;
            case 2:
                if (c1613j.j.f17031a == 2) {
                    return true;
                }
                return false;
            case 3:
                int i9 = c1613j.j.f17031a;
                if (i9 != 3 && (Build.VERSION.SDK_INT < 30 || i9 != 6)) {
                    return false;
                }
                return true;
            default:
                return c1613j.j.f17035e;
        }
    }

    @Override // k1.AbstractC1480b
    public final boolean b(Object obj) {
        switch (this.f19870e) {
            case 0:
                return !((Boolean) obj).booleanValue();
            case 1:
                return !((Boolean) obj).booleanValue();
            case 2:
                C1431a c1431a = (C1431a) obj;
                if (Build.VERSION.SDK_INT >= 26) {
                    if (!c1431a.f19186a || !c1431a.f19187b) {
                        return true;
                    }
                    return false;
                }
                return true ^ c1431a.f19186a;
            case 3:
                C1431a c1431a2 = (C1431a) obj;
                if (c1431a2.f19186a && !c1431a2.f19188c) {
                    return false;
                }
                return true;
            default:
                return !((Boolean) obj).booleanValue();
        }
    }
}
