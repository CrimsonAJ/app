package p;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: p.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1822t0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1733A0 f22080a;

    public C1822t0(C1733A0 c1733a0) {
        this.f22080a = c1733a0;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i9, long j) {
        C1812o0 c1812o0;
        if (i9 != -1 && (c1812o0 = this.f22080a.f21773c) != null) {
            c1812o0.setListSelectionHidden(false);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
