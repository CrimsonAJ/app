package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* loaded from: classes.dex */
public final class F0 extends E0 {

    /* renamed from: H, reason: collision with root package name */
    public static final SparseIntArray f3672H;

    /* renamed from: G, reason: collision with root package name */
    public long f3673G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3672H = sparseIntArray;
        sparseIntArray.put(R.id.imageLogo, 1);
        sparseIntArray.put(R.id.textTitle, 2);
        sparseIntArray.put(R.id.textRequired, 3);
        sparseIntArray.put(R.id.textChangelog, 4);
        sparseIntArray.put(R.id.textAboutUpdate, 5);
        sparseIntArray.put(R.id.textMoreInfo, 6);
        sparseIntArray.put(R.id.textVersion, 7);
        sparseIntArray.put(R.id.buttonUpdateNow, 8);
        sparseIntArray.put(R.id.buttonSkipVer, 9);
        sparseIntArray.put(R.id.imageMask, 10);
        sparseIntArray.put(R.id.layoutDownloading, 11);
        sparseIntArray.put(R.id.textTitleVersion, 12);
        sparseIntArray.put(R.id.textDownloading, 13);
        sparseIntArray.put(R.id.divider, 14);
        sparseIntArray.put(R.id.progressDownload, 15);
        sparseIntArray.put(R.id.textPercent, 16);
        sparseIntArray.put(R.id.buttonCancel, 17);
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3673G = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3673G != 0) {
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
            this.f3673G = 1L;
        }
        h0();
    }
}
