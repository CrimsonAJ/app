package androidx.media;

import Z0.b;
import Z0.d;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        d dVar = audioAttributesCompat.f9916a;
        if (bVar.e(1)) {
            dVar = bVar.h();
        }
        audioAttributesCompat.f9916a = (AudioAttributesImpl) dVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f9916a;
        bVar.i(1);
        bVar.l(audioAttributesImpl);
    }
}
