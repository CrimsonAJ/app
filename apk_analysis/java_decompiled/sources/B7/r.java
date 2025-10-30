package B7;

import com.anilab.android.ui.views.FreakToggleGroup;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class r implements V7.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1133b;

    public /* synthetic */ r(int i9, Object obj) {
        this.f1132a = i9;
        this.f1133b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, E7.d, V7.k, java.lang.Object] */
    @Override // V7.j
    public final Iterator iterator() {
        switch (this.f1132a) {
            case 0:
                return ((Collection) this.f1133b).iterator();
            case 1:
                return new C0051b(1, (FreakToggleGroup) this.f1133b);
            case 2:
                G7.i iVar = (G7.i) this.f1133b;
                ?? obj = new Object();
                obj.f7837d = iVar.create(obj, obj);
                return obj;
            case 3:
                return (Iterator) this.f1133b;
            default:
                return new W7.b((CharSequence) this.f1133b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(O7.p pVar) {
        this.f1132a = 2;
        this.f1133b = (G7.i) pVar;
    }
}
