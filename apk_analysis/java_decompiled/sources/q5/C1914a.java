package q5;

import android.graphics.Typeface;
import com.google.android.gms.internal.measurement.Y1;
import com.google.android.material.chip.Chip;
import w5.l;
import w5.m;

/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1914a extends Y1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f22363n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f22364o;

    public /* synthetic */ C1914a(int i9, Object obj) {
        this.f22363n = i9;
        this.f22364o = obj;
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void w(int i9) {
        switch (this.f22363n) {
            case 0:
                return;
            default:
                m mVar = (m) this.f22364o;
                mVar.f24309e = true;
                l lVar = (l) mVar.f24310f.get();
                if (lVar != null) {
                    lVar.a();
                    return;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.measurement.Y1
    public final void x(Typeface typeface, boolean z9) {
        CharSequence text;
        switch (this.f22363n) {
            case 0:
                Chip chip = (Chip) this.f22364o;
                e eVar = chip.f15946e;
                if (eVar.f22402b1) {
                    text = eVar.Y;
                } else {
                    text = chip.getText();
                }
                chip.setText(text);
                chip.requestLayout();
                chip.invalidate();
                return;
            default:
                if (!z9) {
                    m mVar = (m) this.f22364o;
                    mVar.f24309e = true;
                    l lVar = (l) mVar.f24310f.get();
                    if (lVar != null) {
                        lVar.a();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    private final void K(int i9) {
    }
}
