package androidx.media;

import Z0.d;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9915b = 0;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f9916a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f9916a;
        if (audioAttributesImpl == null) {
            if (audioAttributesCompat.f9916a != null) {
                return false;
            }
            return true;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f9916a);
    }

    public final int hashCode() {
        return this.f9916a.hashCode();
    }

    public final String toString() {
        return this.f9916a.toString();
    }
}
