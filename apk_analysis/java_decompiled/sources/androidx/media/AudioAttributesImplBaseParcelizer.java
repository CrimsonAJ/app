package androidx.media;

import Z0.b;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(b bVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f9919a = bVar.f(audioAttributesImplBase.f9919a, 1);
        audioAttributesImplBase.f9920b = bVar.f(audioAttributesImplBase.f9920b, 2);
        audioAttributesImplBase.f9921c = bVar.f(audioAttributesImplBase.f9921c, 3);
        audioAttributesImplBase.f9922d = bVar.f(audioAttributesImplBase.f9922d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, b bVar) {
        bVar.getClass();
        bVar.j(audioAttributesImplBase.f9919a, 1);
        bVar.j(audioAttributesImplBase.f9920b, 2);
        bVar.j(audioAttributesImplBase.f9921c, 3);
        bVar.j(audioAttributesImplBase.f9922d, 4);
    }
}
