package G5;

import Q.q;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import j3.Y;
import j3.p0;
import l4.i;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements q, i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2866b;

    public /* synthetic */ b(int i9, Object obj) {
        this.f2866b = obj;
        this.f2865a = i9;
    }

    @Override // Q.q
    public boolean g(View view) {
        ((SideSheetBehavior) this.f2866b).w(this.f2865a);
        return true;
    }

    @Override // l4.i
    public void invoke(Object obj) {
        ((p0) obj).K((Y) this.f2866b, this.f2865a);
    }
}
