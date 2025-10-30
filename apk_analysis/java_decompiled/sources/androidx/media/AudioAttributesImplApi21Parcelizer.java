package androidx.media;

import Z0.b;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f9917a = (AudioAttributes) bVar.g(audioAttributesImplApi21.f9917a, 1);
        audioAttributesImplApi21.f9918b = bVar.f(audioAttributesImplApi21.f9918b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi21.f9917a, 1);
        bVar.j(audioAttributesImplApi21.f9918b, 2);
    }
}
