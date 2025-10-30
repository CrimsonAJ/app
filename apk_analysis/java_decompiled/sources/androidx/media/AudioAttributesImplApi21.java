package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f9917a;

    /* renamed from: b, reason: collision with root package name */
    public int f9918b = -1;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplApi21)) {
            return false;
        }
        return this.f9917a.equals(((AudioAttributesImplApi21) obj).f9917a);
    }

    public final int hashCode() {
        return this.f9917a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f9917a;
    }
}
