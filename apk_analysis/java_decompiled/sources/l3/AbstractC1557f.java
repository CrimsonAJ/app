package l3;

import P5.f0;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* renamed from: l3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1557f {

    /* renamed from: a, reason: collision with root package name */
    public static final AudioAttributes f20396a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int[] a() {
        boolean isDirectPlaybackSupported;
        P5.D d9 = P5.F.f5901b;
        P5.C c3 = new P5.C();
        f0 it = C1558g.f20399e.keySet().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(num.intValue()).setSampleRate(48000).build(), f20396a);
            if (isDirectPlaybackSupported) {
                c3.a(num);
            }
        }
        c3.a(2);
        return v4.e.U(c3.d());
    }

    public static int b(int i9, int i10) {
        boolean isDirectPlaybackSupported;
        for (int i11 = 8; i11 > 0; i11--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i9).setSampleRate(i10).setChannelMask(l4.y.n(i11)).build(), f20396a);
            if (isDirectPlaybackSupported) {
                return i11;
            }
        }
        return 0;
    }
}
