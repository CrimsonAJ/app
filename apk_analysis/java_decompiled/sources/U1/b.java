package U1;

import b8.InterfaceC0726f;
import com.anilab.android.ui.filter.FilterFragment;
import java.util.List;

/* loaded from: classes.dex */
public final class b implements InterfaceC0726f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FilterFragment f7251b;

    public /* synthetic */ b(FilterFragment filterFragment, int i9) {
        this.f7250a = i9;
        this.f7251b = filterFragment;
    }

    @Override // b8.InterfaceC0726f
    public final Object emit(Object obj, E7.d dVar) {
        switch (this.f7250a) {
            case 0:
                ((m) this.f7251b.f13765H0.getValue()).o((List) obj);
                return A7.n.f558a;
            case 1:
                ((a) this.f7251b.f13762E0.getValue()).o((List) obj);
                return A7.n.f558a;
            case 2:
                ((a) this.f7251b.f13764G0.getValue()).o((List) obj);
                return A7.n.f558a;
            default:
                ((a) this.f7251b.f13763F0.getValue()).o((List) obj);
                return A7.n.f558a;
        }
    }
}
