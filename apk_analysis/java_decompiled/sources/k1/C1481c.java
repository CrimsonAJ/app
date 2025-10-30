package k1;

import android.os.Build;
import e1.q;
import j1.C1431a;
import n1.C1613j;

/* renamed from: k1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1481c extends AbstractC1480b {

    /* renamed from: e, reason: collision with root package name */
    public static final String f19875e = q.j("NetworkMeteredCtrlr");

    @Override // k1.AbstractC1480b
    public final boolean a(C1613j c1613j) {
        if (c1613j.j.f17031a == 5) {
            return true;
        }
        return false;
    }

    @Override // k1.AbstractC1480b
    public final boolean b(Object obj) {
        C1431a c1431a = (C1431a) obj;
        if (Build.VERSION.SDK_INT < 26) {
            q.d().a(f19875e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !c1431a.f19186a;
        }
        if (!c1431a.f19186a || !c1431a.f19188c) {
            return true;
        }
        return false;
    }
}
