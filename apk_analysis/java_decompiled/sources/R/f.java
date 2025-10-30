package R;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class f implements g {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f6463a;

    public f(Object obj) {
        this.f6463a = (InputContentInfo) obj;
    }

    @Override // R.g
    public final ClipDescription getDescription() {
        return this.f6463a.getDescription();
    }

    @Override // R.g
    public final Object j() {
        return this.f6463a;
    }

    @Override // R.g
    public final Uri k() {
        return this.f6463a.getContentUri();
    }

    @Override // R.g
    public final void p() {
        this.f6463a.requestPermission();
    }

    @Override // R.g
    public final Uri t() {
        return this.f6463a.getLinkUri();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f6463a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
