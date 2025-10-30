package A3;

import a.AbstractC0485a;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import j3.L;
import j3.M;
import java.util.List;
import l4.AbstractC1566a;
import q3.InterfaceC1907l;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42a;

    /* renamed from: b, reason: collision with root package name */
    public final List f43b;

    /* renamed from: c, reason: collision with root package name */
    public final q3.u[] f44c;

    public D(List list, int i9) {
        this.f42a = i9;
        switch (i9) {
            case 1:
                this.f43b = list;
                this.f44c = new q3.u[list.size()];
                return;
            default:
                this.f43b = list;
                this.f44c = new q3.u[list.size()];
                return;
        }
    }

    public void a(long j, A4.r rVar) {
        if (rVar.e() >= 9) {
            int i9 = rVar.i();
            int i10 = rVar.i();
            int x5 = rVar.x();
            if (i9 == 434 && i10 == 1195456820 && x5 == 3) {
                AbstractC0485a.f(j, rVar, this.f44c);
            }
        }
    }

    public final void b(InterfaceC1907l interfaceC1907l, I i9) {
        boolean z9;
        boolean z10;
        switch (this.f42a) {
            case 0:
                int i10 = 0;
                while (true) {
                    q3.u[] uVarArr = this.f44c;
                    if (i10 < uVarArr.length) {
                        i9.a();
                        i9.b();
                        q3.u u9 = interfaceC1907l.u(i9.f77d, 3);
                        M m9 = (M) this.f43b.get(i10);
                        String str = m9.f19435l;
                        if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        AbstractC1566a.g("Invalid closed caption mime type provided: " + str, z9);
                        String str2 = m9.f19425a;
                        if (str2 == null) {
                            i9.b();
                            str2 = i9.f78e;
                        }
                        L l9 = new L();
                        l9.f19393a = str2;
                        l9.f19402k = str;
                        l9.f19396d = m9.f19428d;
                        l9.f19395c = m9.f19427c;
                        l9.f19391C = m9.f19423D;
                        l9.f19404m = m9.f19437n;
                        AbstractC0953k1.u(l9, u9);
                        uVarArr[i10] = u9;
                        i10++;
                    } else {
                        return;
                    }
                }
                break;
            default:
                int i11 = 0;
                while (true) {
                    q3.u[] uVarArr2 = this.f44c;
                    if (i11 < uVarArr2.length) {
                        i9.a();
                        i9.b();
                        q3.u u10 = interfaceC1907l.u(i9.f77d, 3);
                        M m10 = (M) this.f43b.get(i11);
                        String str3 = m10.f19435l;
                        if (!"application/cea-608".equals(str3) && !"application/cea-708".equals(str3)) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        AbstractC1566a.g("Invalid closed caption mime type provided: " + str3, z10);
                        L l10 = new L();
                        i9.b();
                        l10.f19393a = i9.f78e;
                        l10.f19402k = str3;
                        l10.f19396d = m10.f19428d;
                        l10.f19395c = m10.f19427c;
                        l10.f19391C = m10.f19423D;
                        l10.f19404m = m10.f19437n;
                        AbstractC0953k1.u(l10, u10);
                        uVarArr2[i11] = u10;
                        i11++;
                    } else {
                        return;
                    }
                }
                break;
        }
    }
}
