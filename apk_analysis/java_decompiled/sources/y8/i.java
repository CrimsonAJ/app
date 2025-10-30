package y8;

import A7.n;
import O7.p;
import java.io.IOException;
import kotlin.jvm.internal.o;
import x8.C;

/* loaded from: classes.dex */
public final class i extends kotlin.jvm.internal.i implements p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25166d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C f25167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o f25168f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f25169g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ o f25170h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, C c3, o oVar2, o oVar3) {
        super(2);
        this.f25168f = oVar;
        this.f25167e = c3;
        this.f25169g = oVar2;
        this.f25170h = oVar3;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z9;
        boolean z10;
        switch (this.f25166d) {
            case 0:
                int intValue = ((Number) obj).intValue();
                long longValue = ((Number) obj2).longValue();
                if (intValue == 1) {
                    o oVar = this.f25168f;
                    if (oVar.f20159a == null) {
                        if (longValue == 24) {
                            C c3 = this.f25167e;
                            oVar.f20159a = Long.valueOf(c3.I());
                            this.f25169g.f20159a = Long.valueOf(c3.I());
                            this.f25170h.f20159a = Long.valueOf(c3.I());
                        } else {
                            throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                        }
                    } else {
                        throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
                    }
                }
                return n.f558a;
            default:
                int intValue2 = ((Number) obj).intValue();
                long longValue2 = ((Number) obj2).longValue();
                if (intValue2 == 21589) {
                    long j = 1;
                    if (longValue2 >= 1) {
                        C c9 = this.f25167e;
                        byte g9 = c9.g();
                        boolean z11 = true;
                        if ((g9 & 1) == 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if ((g9 & 2) == 2) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if ((g9 & 4) != 4) {
                            z11 = false;
                        }
                        if (z9) {
                            j = 5;
                        }
                        if (z10) {
                            j += 4;
                        }
                        if (z11) {
                            j += 4;
                        }
                        if (longValue2 >= j) {
                            if (z9) {
                                this.f25168f.f20159a = Integer.valueOf(c9.F());
                            }
                            if (z10) {
                                this.f25169g.f20159a = Integer.valueOf(c9.F());
                            }
                            if (z11) {
                                this.f25170h.f20159a = Integer.valueOf(c9.F());
                            }
                        } else {
                            throw new IOException("bad zip: extended timestamp extra too short");
                        }
                    } else {
                        throw new IOException("bad zip: extended timestamp extra too short");
                    }
                }
                return n.f558a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(C c3, o oVar, o oVar2, o oVar3) {
        super(2);
        this.f25167e = c3;
        this.f25168f = oVar;
        this.f25169g = oVar2;
        this.f25170h = oVar3;
    }
}
