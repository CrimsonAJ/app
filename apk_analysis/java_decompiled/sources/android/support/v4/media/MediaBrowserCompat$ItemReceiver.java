package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.y;

/* loaded from: classes.dex */
class MediaBrowserCompat$ItemReceiver extends c.d {
    @Override // c.d
    public final void a(int i9, Bundle bundle) {
        if (bundle != null) {
            bundle = y.Z(bundle);
        }
        if (i9 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("media_item")) {
                    Parcelable parcelable = bundle.getParcelable("media_item");
                    if (parcelable != null && !(parcelable instanceof MediaBrowserCompat$MediaItem)) {
                        throw null;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
