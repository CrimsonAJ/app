package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15986a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f15987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f15988c;

    public /* synthetic */ f(j jVar, q qVar, int i9) {
        this.f15986a = i9;
        this.f15988c = jVar;
        this.f15987b = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f15986a) {
            case 0:
                j jVar = this.f15988c;
                int V02 = ((LinearLayoutManager) jVar.f15997C0.getLayoutManager()).V0() - 1;
                if (V02 >= 0) {
                    Calendar a5 = v.a(this.f15987b.f16048d.f15972a.f16032a);
                    a5.add(2, V02);
                    jVar.e0(new m(a5));
                    return;
                }
                return;
            default:
                j jVar2 = this.f15988c;
                int U02 = ((LinearLayoutManager) jVar2.f15997C0.getLayoutManager()).U0() + 1;
                if (U02 < jVar2.f15997C0.getAdapter().a()) {
                    Calendar a9 = v.a(this.f15987b.f16048d.f15972a.f16032a);
                    a9.add(2, U02);
                    jVar2.e0(new m(a9));
                    return;
                }
                return;
        }
    }
}
