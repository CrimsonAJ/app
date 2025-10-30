package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168d extends AbstractC0165c {

    /* renamed from: g0, reason: collision with root package name */
    public static final SparseIntArray f3881g0;

    /* renamed from: f0, reason: collision with root package name */
    public long f3882f0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3881g0 = sparseIntArray;
        sparseIntArray.put(R.id.playerView, 1);
        sparseIntArray.put(R.id.buttonUnlock, 2);
        sparseIntArray.put(R.id.layoutContainer, 3);
        sparseIntArray.put(R.id.appBarLayout, 4);
        sparseIntArray.put(R.id.textAnimeName, 5);
        sparseIntArray.put(R.id.tabLayoutDub, 6);
        sparseIntArray.put(R.id.tabSub, 7);
        sparseIntArray.put(R.id.tabDub, 8);
        sparseIntArray.put(R.id.scrollViewServer, 9);
        sparseIntArray.put(R.id.chipGroupServer, 10);
        sparseIntArray.put(R.id.textLabelListEpisode, 11);
        sparseIntArray.put(R.id.imageListEpisode, 12);
        sparseIntArray.put(R.id.spinnerListEpisode, 13);
        sparseIntArray.put(R.id.inputSearchEpisode, 14);
        sparseIntArray.put(R.id.imageSearchEpisode, 15);
        sparseIntArray.put(R.id.recyclerPlayer, 16);
        sparseIntArray.put(R.id.sliderVolume, 17);
        sparseIntArray.put(R.id.layoutSubSync, 18);
        sparseIntArray.put(R.id.view5, 19);
        sparseIntArray.put(R.id.textLabelSubDelay, 20);
        sparseIntArray.put(R.id.textMinusDelay, 21);
        sparseIntArray.put(R.id.textDelay, 22);
        sparseIntArray.put(R.id.textPlusDelay, 23);
        sparseIntArray.put(R.id.buttonApplyDelay, 24);
        sparseIntArray.put(R.id.layoutSettings, 25);
        sparseIntArray.put(R.id.toggleQuality, 26);
        sparseIntArray.put(R.id.buttonAuto, 27);
        sparseIntArray.put(R.id.buttonFHD, 28);
        sparseIntArray.put(R.id.buttonHD, 29);
        sparseIntArray.put(R.id.buttonSDP, 30);
        sparseIntArray.put(R.id.buttonSD, 31);
        sparseIntArray.put(R.id.textLabelQuality, 32);
        sparseIntArray.put(R.id.recyclerChooseEpisode, 33);
        sparseIntArray.put(R.id.recyclerChooseServer, 34);
        sparseIntArray.put(R.id.textLabelServer, 35);
        sparseIntArray.put(R.id.layoutComment, 36);
        sparseIntArray.put(R.id.layoutFirstComment, 37);
        sparseIntArray.put(R.id.textCommentCount, 38);
        sparseIntArray.put(R.id.imageAvatarComment, 39);
        sparseIntArray.put(R.id.textComment, 40);
        sparseIntArray.put(R.id.containerComment, 41);
        sparseIntArray.put(R.id.freakLoading, 42);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0168d(android.view.View r43) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0168d.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3882f0 = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3882f0 != 0) {
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
            this.f3882f0 = 1L;
        }
        h0();
    }
}
