package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.y;
import java.util.ArrayList;

/* loaded from: classes.dex */
class MediaBrowserCompat$SearchResultReceiver extends c.d {
    @Override // c.d
    public final void a(int i9, Bundle bundle) {
        if (bundle != null) {
            bundle = y.Z(bundle);
        }
        if (i9 == 0) {
            if (bundle != null) {
                if (bundle.containsKey("search_results")) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                    parcelableArray.getClass();
                    ArrayList arrayList = new ArrayList(parcelableArray.length);
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaBrowserCompat$MediaItem) parcelable);
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
