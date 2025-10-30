package i2;

import J1.AbstractC0188m;
import android.os.Bundle;
import androidx.lifecycle.V;
import b8.InterfaceC0726f;
import co.notix.R;
import com.anilab.android.ui.rating.BottomSheetRating;
import com.google.android.gms.internal.measurement.AbstractC1002u1;
import java.util.Iterator;
import java.util.List;
import u0.C2042m;
import u0.F;
import u0.H;

/* renamed from: i2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1373a implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomSheetRating f18449b;

    public /* synthetic */ C1373a(BottomSheetRating bottomSheetRating, int i9) {
        this.f18448a = i9;
        this.f18449b = bottomSheetRating;
    }

    @Override // b8.InterfaceC0726f
    public final Object emit(Object obj, E7.d dVar) {
        V v8;
        A7.n nVar = A7.n.f558a;
        BottomSheetRating bottomSheetRating = this.f18449b;
        switch (this.f18448a) {
            case 0:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    ((j) bottomSheetRating.f13821T0.getValue()).f18467e = bottomSheetRating.t0().f18485k;
                    ((AbstractC0188m) bottomSheetRating.m0()).f3991B.setText(bottomSheetRating.s(R.string.format_total_vote, String.valueOf(bottomSheetRating.t0().f18485k)));
                    ((j) bottomSheetRating.f13821T0.getValue()).o(list);
                }
                return nVar;
            default:
                int ordinal = ((k) obj).ordinal();
                if (ordinal != 0) {
                    Object obj2 = null;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            AbstractC1002u1.A(bottomSheetRating).m();
                            H A2 = AbstractC1002u1.A(bottomSheetRating);
                            Bundle bundle = new Bundle();
                            A2.getClass();
                            A2.j(R.id.goToLogin, bundle, null);
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        Iterator it = B7.k.A0(AbstractC1002u1.A(bottomSheetRating).f23400g).iterator();
                        if (it.hasNext()) {
                            it.next();
                        }
                        Iterator it2 = V7.l.f0(it).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (!(((C2042m) next).f23496b instanceof F)) {
                                    obj2 = next;
                                }
                            }
                        }
                        C2042m c2042m = (C2042m) obj2;
                        if (c2042m != null && (v8 = (V) c2042m.f23504k.getValue()) != null) {
                            v8.b(Boolean.TRUE, "UPDATE_VOTE");
                        }
                        AbstractC1002u1.A(bottomSheetRating).m();
                    }
                }
                return nVar;
        }
    }
}
