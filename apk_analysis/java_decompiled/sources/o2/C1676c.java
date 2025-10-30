package o2;

import android.widget.CompoundButton;
import com.anilab.android.ui.settings.PlayerSettingsFragment;
import com.google.android.material.chip.Chip;
import i.G;
import w5.C2141a;

/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1676c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f21521b;

    public /* synthetic */ C1676c(int i9, Object obj) {
        this.f21520a = i9;
        this.f21521b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        switch (this.f21520a) {
            case 0:
                C1683j c1683j = (C1683j) ((PlayerSettingsFragment) this.f21521b).f13836D0.getValue();
                c1683j.d(false, new C1682i(c1683j, z9, null));
                return;
            default:
                Chip chip = (Chip) this.f21521b;
                w5.g gVar = chip.j;
                if (gVar != null) {
                    C2141a c2141a = (C2141a) ((G) gVar).f17990b;
                    if (!z9 ? c2141a.e(chip, c2141a.f24214e) : c2141a.a(chip)) {
                        c2141a.d();
                    }
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f15950i;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z9);
                    return;
                }
                return;
        }
    }
}
