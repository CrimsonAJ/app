package J1;

import android.util.SparseIntArray;
import co.notix.R;

/* renamed from: J1.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175f0 extends AbstractC0172e0 {

    /* renamed from: W, reason: collision with root package name */
    public static final SparseIntArray f3919W;

    /* renamed from: V, reason: collision with root package name */
    public long f3920V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f3919W = sparseIntArray;
        sparseIntArray.put(R.id.imageMovie, 1);
        sparseIntArray.put(R.id.buttonBack, 2);
        sparseIntArray.put(R.id.buttonCast, 3);
        sparseIntArray.put(R.id.buttonShare, 4);
        sparseIntArray.put(R.id.buttonBookmark, 5);
        sparseIntArray.put(R.id.textMovieName, 6);
        sparseIntArray.put(R.id.layoutInfo, 7);
        sparseIntArray.put(R.id.imageStar, 8);
        sparseIntArray.put(R.id.textRating, 9);
        sparseIntArray.put(R.id.textYear, 10);
        sparseIntArray.put(R.id.textRatingType, 11);
        sparseIntArray.put(R.id.textQuality, 12);
        sparseIntArray.put(R.id.textSUB, 13);
        sparseIntArray.put(R.id.textDUB, 14);
        sparseIntArray.put(R.id.buttonPlay, 15);
        sparseIntArray.put(R.id.buttonDownload, 16);
        sparseIntArray.put(R.id.textGenre, 17);
        sparseIntArray.put(R.id.textOverview, 18);
        sparseIntArray.put(R.id.textViewMore, 19);
        sparseIntArray.put(R.id.textTitleEpisode, 20);
        sparseIntArray.put(R.id.inputSearchEpisode, 21);
        sparseIntArray.put(R.id.imageSearchEpisode, 22);
        sparseIntArray.put(R.id.recyclerEpisodes, 23);
        sparseIntArray.put(R.id.textTitleRelateMovie, 24);
        sparseIntArray.put(R.id.textComment, 25);
        sparseIntArray.put(R.id.recyclerRelateMovies, 26);
        sparseIntArray.put(R.id.groupEpisode, 27);
        sparseIntArray.put(R.id.view, 28);
        sparseIntArray.put(R.id.viewRed, 29);
        sparseIntArray.put(R.id.layoutLoading, 30);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0175f0(android.view.View r33) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J1.C0175f0.<init>(android.view.View):void");
    }

    @Override // W.g
    public final void a0() {
        synchronized (this) {
            this.f3920V = 0L;
        }
    }

    @Override // W.g
    public final boolean d0() {
        synchronized (this) {
            try {
                if (this.f3920V != 0) {
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
            this.f3920V = 1L;
        }
        h0();
    }
}
