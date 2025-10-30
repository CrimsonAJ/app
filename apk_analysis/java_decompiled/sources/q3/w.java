package q3;

import D4.InterfaceC0093l;
import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.internal.cast.C;
import f5.C1177i;

/* loaded from: classes.dex */
public final class w implements InterfaceC0093l {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f22358a;

    public /* synthetic */ w(y4.r rVar, String[] strArr) {
        this.f22358a = strArr;
    }

    @Override // D4.InterfaceC0093l
    public void H(Object obj, Object obj2) {
        y4.s sVar = (y4.s) obj;
        y4.q qVar = new y4.q(1, (C1177i) obj2);
        Context context = sVar.f2370c;
        C4.g gVar = new C4.g(-1, -1, 0, true);
        y4.j jVar = (y4.j) sVar.u();
        C4.f fVar = new C4.f(gVar);
        Parcel Q7 = jVar.Q();
        C.d(Q7, qVar);
        Q7.writeStringArray(this.f22358a);
        C.c(Q7, fVar);
        jVar.i1(Q7, 6);
    }

    public w(String[] strArr) {
        this.f22358a = strArr;
    }
}
