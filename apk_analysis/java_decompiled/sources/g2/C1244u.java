package g2;

import J1.AbstractC0165c;
import a.AbstractC0485a;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import co.notix.R;
import com.anilab.android.ui.player.PlayerActivity;

/* renamed from: g2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1244u extends G7.j implements O7.p {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f17694r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f17695s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1244u(E7.d dVar, PlayerActivity playerActivity) {
        super(2, dVar);
        this.f17695s = playerActivity;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        C1244u c1244u = new C1244u(dVar, this.f17695s);
        c1244u.f17694r = obj;
        return c1244u;
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        C1244u c1244u = (C1244u) create((M1.t) obj, (E7.d) obj2);
        A7.n nVar = A7.n.f558a;
        c1244u.invokeSuspend(nVar);
        return nVar;
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        Object a5 = ((M1.t) this.f17694r).a();
        if (a5 != null) {
            InterfaceC1214P interfaceC1214P = (InterfaceC1214P) a5;
            boolean z9 = interfaceC1214P instanceof C1213O;
            PlayerActivity playerActivity = this.f17695s;
            if (z9) {
                AbstractC0165c abstractC0165c = playerActivity.f13799D;
                if (abstractC0165c != null) {
                    I2.a aVar = playerActivity.d0().f17639p;
                    int color = abstractC0165c.f7853k.getContext().getColor(R.color.colorAccent);
                    TextView textAnimeName = abstractC0165c.f3861V;
                    kotlin.jvm.internal.h.d(textAnimeName, "textAnimeName");
                    textAnimeName.setVisibility(0);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(playerActivity.getString(R.string.label_you_are_watching));
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(color);
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) playerActivity.getString(R.string.format_episode, Integer.valueOf(aVar.f3445b)));
                    spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
                    textAnimeName.setText(spannableStringBuilder);
                    AbstractC0165c abstractC0165c2 = playerActivity.f13799D;
                    if (abstractC0165c2 != null) {
                        View findViewById = abstractC0165c2.f3853N.findViewById(R.id.textPlayingTitle);
                        if (findViewById != null) {
                            ((TextView) findViewById).setText(aVar.f3446c);
                        }
                        AbstractC0165c abstractC0165c3 = playerActivity.f13799D;
                        if (abstractC0165c3 != null) {
                            View findViewById2 = abstractC0165c3.f3853N.findViewById(R.id.buttonNext);
                            if (findViewById2 != null) {
                                findViewById2.setEnabled(playerActivity.d0().i());
                            }
                            playerActivity.W(R.id.buttonPrevious, new C1229f(playerActivity, 0));
                            C1225b a02 = playerActivity.a0();
                            long j = aVar.f3444a;
                            a02.p(j);
                            ((C1225b) playerActivity.f13809m0.getValue()).p(j);
                            playerActivity.o0();
                            playerActivity.h0(((C1213O) interfaceC1214P).f17583a);
                        } else {
                            kotlin.jvm.internal.h.h("binding");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.h.h("binding");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.h.h("binding");
                    throw null;
                }
            } else if (interfaceC1214P instanceof C1211M) {
                int i9 = PlayerActivity.f13798w0;
                playerActivity.o0();
                playerActivity.h0(((C1211M) interfaceC1214P).f17581a);
            } else if (!(interfaceC1214P instanceof C1212N)) {
                throw new RuntimeException();
            }
        }
        return A7.n.f558a;
    }
}
