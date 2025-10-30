package v4;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class s extends BasePendingResult {

    /* renamed from: x, reason: collision with root package name */
    public com.google.firebase.messaging.u f23881x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f23882y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ h f23883z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(h hVar, boolean z9) {
        super(null);
        this.f23883z = hVar;
        this.f23882y = z9;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ C4.o F(Status status) {
        return new r(status, 1);
    }

    public abstract void N();

    public final y4.o O() {
        if (this.f23881x == null) {
            this.f23881x = new com.google.firebase.messaging.u(this);
        }
        return this.f23881x;
    }

    public final void P() {
        if (!this.f23882y) {
            h hVar = this.f23883z;
            Iterator it = hVar.f23853g.iterator();
            if (!it.hasNext()) {
                Iterator it2 = hVar.f23854h.iterator();
                while (it2.hasNext()) {
                    ((g) it2.next()).getClass();
                }
            } else {
                throw A0.a.h(it);
            }
        }
        try {
            synchronized (this.f23883z.f23847a) {
                N();
            }
        } catch (y4.m unused) {
            J(new r(new Status(2100, null, null, null), 1));
        }
    }
}
