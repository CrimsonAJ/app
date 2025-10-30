package androidx.media;

import Z0.b;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(b bVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f9917a = (AudioAttributes) bVar.g(audioAttributesImplApi26.f9917a, 1);
        audioAttributesImplApi26.f9918b = bVar.f(audioAttributesImplApi26.f9918b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi26.f9917a, 1);
        bVar.j(audioAttributesImplApi26.f9918b, 2);
    }
}
