package d0;

import a.AbstractC0485a;
import android.os.Build;
import b5.C0675y;
import b5.G1;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1087e extends Z0.a {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C1088f f16638i;

    public C1087e(C1088f c1088f) {
        this.f16638i = c1088f;
    }

    @Override // Z0.a
    public final void s(Throwable th) {
        ((C1091i) this.f16638i.f16641c).d(th);
    }

    @Override // Z0.a
    public final void t(com.google.firebase.messaging.s sVar) {
        Set<int[]> r5;
        C1088f c1088f = this.f16638i;
        c1088f.f16640b = sVar;
        com.google.firebase.messaging.s sVar2 = (com.google.firebase.messaging.s) c1088f.f16640b;
        C1091i c1091i = (C1091i) c1088f.f16641c;
        C0675y c0675y = c1091i.f16649g;
        C1086d c1086d = c1091i.f16651i;
        if (Build.VERSION.SDK_INT >= 34) {
            r5 = AbstractC1094l.a();
        } else {
            r5 = AbstractC0485a.r();
        }
        c1088f.f16639a = new G1(sVar2, c0675y, c1086d, r5);
        C1091i c1091i2 = (C1091i) c1088f.f16641c;
        c1091i2.getClass();
        ArrayList arrayList = new ArrayList();
        c1091i2.f16643a.writeLock().lock();
        try {
            c1091i2.f16645c = 1;
            arrayList.addAll(c1091i2.f16644b);
            c1091i2.f16644b.clear();
            c1091i2.f16643a.writeLock().unlock();
            c1091i2.f16646d.post(new D4.s(arrayList, c1091i2.f16645c, (Throwable) null));
        } catch (Throwable th) {
            c1091i2.f16643a.writeLock().unlock();
            throw th;
        }
    }
}
