package g2;

import J1.AbstractC0165c;
import android.view.View;
import android.widget.AdapterView;
import com.anilab.android.ui.player.PlayerActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1203E implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0165c f17567b;

    public C1203E(PlayerActivity playerActivity, AbstractC0165c abstractC0165c) {
        this.f17566a = playerActivity;
        this.f17567b = abstractC0165c;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i9, long j) {
        int i10 = PlayerActivity.f13798w0;
        PlayerActivity playerActivity = this.f17566a;
        List list = playerActivity.d0().f17638o.f3471f;
        ArrayList h7 = playerActivity.d0().h();
        if (!h7.isEmpty()) {
            if (i9 >= 0 && i9 <= B7.l.a0(h7)) {
                playerActivity.a0().q(list, (List) h7.get(i9));
            }
        } else {
            C1225b a02 = playerActivity.a0();
            B7.t tVar = B7.t.f1135a;
            a02.q(tVar, tVar);
        }
        this.f17567b.f3848H.setText("");
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
