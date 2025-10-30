package k1;

import android.os.Build;
import e1.q;
import j1.C1431a;
import n1.C1613j;

/* renamed from: k1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1482d extends AbstractC1480b {

    /* renamed from: e, reason: collision with root package name */
    public static final String f19876e = q.j("NetworkNotRoamingCtrlr");

    @Override // k1.AbstractC1480b
    public final boolean a(C1613j c1613j) {
        if (c1613j.j.f17031a == 4) {
            return true;
        }
        return false;
    }

    @Override // k1.AbstractC1480b
    public final boolean b(Object obj) {
        C1431a c1431a = (C1431a) obj;
        if (Build.VERSION.SDK_INT < 24) {
            q.d().a(f19876e, "Not-roaming network constraint is not supported before API 24, only checking for connected state.", new Throwable[0]);
            return !c1431a.f19186a;
        }
        if (!c1431a.f19186a || !c1431a.f19189d) {
            return true;
        }
        return false;
    }
}
