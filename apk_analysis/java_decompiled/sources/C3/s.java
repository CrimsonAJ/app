package C3;

import j3.M;

/* loaded from: classes.dex */
public final class s extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final String f1487a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1488b;

    /* renamed from: c, reason: collision with root package name */
    public final p f1489c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1490d;

    public s(M m9, y yVar, boolean z9, int i9) {
        this("Decoder init failed: [" + i9 + "], " + m9, yVar, m9.f19435l, z9, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i9 < 0 ? "neg_" : "") + Math.abs(i9));
    }

    public s(String str, Throwable th, String str2, boolean z9, p pVar, String str3) {
        super(str, th);
        this.f1487a = str2;
        this.f1488b = z9;
        this.f1489c = pVar;
        this.f1490d = str3;
    }
}
