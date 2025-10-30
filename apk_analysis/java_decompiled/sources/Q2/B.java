package Q2;

import F0.r0;
import N3.m0;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import co.notix.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class B extends F0.S {

    /* renamed from: d, reason: collision with root package name */
    public List f6046d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D f6047e;

    public B(D d9) {
        this.f6047e = d9;
    }

    @Override // F0.S
    public final int a() {
        if (this.f6046d.isEmpty()) {
            return 0;
        }
        return this.f6046d.size() + 1;
    }

    @Override // F0.S
    public final r0 h(ViewGroup viewGroup, int i9) {
        return new C0380x(LayoutInflater.from(this.f6047e.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    @Override // F0.S
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void g(C0380x c0380x, int i9) {
        final j3.r0 r0Var = this.f6047e.f6093m0;
        if (r0Var == null) {
            return;
        }
        if (i9 == 0) {
            o(c0380x);
            return;
        }
        boolean z9 = true;
        final z zVar = (z) this.f6046d.get(i9 - 1);
        final m0 m0Var = zVar.f6311a.f19326b;
        if (r0Var.M().f18648y.get(m0Var) == null || !zVar.a()) {
            z9 = false;
        }
        String str = zVar.f6313c;
        TextView textView = c0380x.f6308u;
        textView.setText(str);
        c0380x.f6309v.setSelected(z9);
        textView.setSelected(z9);
        c0380x.f2210a.setOnClickListener(new View.OnClickListener() { // from class: Q2.A
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                B b9 = B.this;
                b9.getClass();
                j3.r0 r0Var2 = r0Var;
                i4.u a5 = r0Var2.M().a();
                z zVar2 = zVar;
                r0Var2.P(a5.g(new i4.t(m0Var, P5.F.s(Integer.valueOf(zVar2.f6312b)))).h(zVar2.f6311a.f19326b.f5166c).a());
                b9.p(zVar2.f6313c);
                b9.f6047e.f6061I0.dismiss();
            }
        });
    }

    public abstract void o(C0380x c0380x);

    public abstract void p(String str);
}
