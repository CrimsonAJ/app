package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class D0 extends C0 {

    /* renamed from: F, reason: collision with root package name */
    public static final SparseIntArray f3641F;

    /* renamed from: E, reason: collision with root package name */
    public long f3642E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3641F = sparseIntArray;
        sparseIntArray.put(R.id.linearLayout, 1);
        sparseIntArray.put(R.id.buttonBack, 2);
        sparseIntArray.put(R.id.textTitleSettingsSubtitle, 3);
        sparseIntArray.put(R.id.frameLayout, 4);
        sparseIntArray.put(R.id.textSubtitle, 5);
        sparseIntArray.put(R.id.labelTextSize, 6);
        sparseIntArray.put(R.id.sliderTextSize, 7);
        sparseIntArray.put(R.id.labelTextStyle, 8);
        sparseIntArray.put(R.id.sliderTextStyle, 9);
        sparseIntArray.put(R.id.labelTextColor, 10);
        sparseIntArray.put(R.id.sliderColor, 11);
        sparseIntArray.put(R.id.labelPosition, 12);
        sparseIntArray.put(R.id.sliderTextBottom, 13);
        sparseIntArray.put(R.id.labelShadow, 14);
        sparseIntArray.put(R.id.sliderTextShadow, 15);
        sparseIntArray.put(R.id.labelBackground, 16);
        sparseIntArray.put(R.id.sliderTextBackground, 17);
        sparseIntArray.put(R.id.buttonUpdate, 18);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3642E = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3642E != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W.g
    public final void e0() {
        synchronized (this) {
            this.f3642E = 1L;
        }
        h0();
    }
}
