package y8;

import O7.p;
import java.io.IOException;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import x8.C;

/* loaded from: classes.dex */
public final class j extends kotlin.jvm.internal.i implements p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f25171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f25172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f25173f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C f25174g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f25175h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f25176i;
    public final /* synthetic */ o j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o f25177k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f25178l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, long j, n nVar, C c3, n nVar2, n nVar3, o oVar, o oVar2, o oVar3) {
        super(2);
        this.f25171d = kVar;
        this.f25172e = j;
        this.f25173f = nVar;
        this.f25174g = c3;
        this.f25175h = nVar2;
        this.f25176i = nVar3;
        this.j = oVar;
        this.f25177k = oVar2;
        this.f25178l = oVar3;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        C c3 = this.f25174g;
        if (intValue != 1) {
            if (intValue == 10) {
                if (longValue >= 4) {
                    c3.n(4L);
                    b.e(c3, (int) (longValue - 4), new i(this.j, c3, this.f25177k, this.f25178l));
                } else {
                    throw new IOException("bad zip: NTFS extra too short");
                }
            }
        } else {
            k kVar = this.f25171d;
            if (!kVar.f20155a) {
                kVar.f20155a = true;
                if (longValue >= this.f25172e) {
                    n nVar = this.f25173f;
                    long j4 = nVar.f20158a;
                    if (j4 == 4294967295L) {
                        j4 = c3.I();
                    }
                    nVar.f20158a = j4;
                    n nVar2 = this.f25175h;
                    long j9 = 0;
                    if (nVar2.f20158a == 4294967295L) {
                        j = c3.I();
                    } else {
                        j = 0;
                    }
                    nVar2.f20158a = j;
                    n nVar3 = this.f25176i;
                    if (nVar3.f20158a == 4294967295L) {
                        j9 = c3.I();
                    }
                    nVar3.f20158a = j9;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
        return A7.n.f558a;
    }
}
