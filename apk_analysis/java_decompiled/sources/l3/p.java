package l3;

import com.google.android.gms.internal.measurement.AbstractC0953k1;

/* loaded from: classes.dex */
public final class p extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f20419a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f20420b;

    /* renamed from: c, reason: collision with root package name */
    public final j3.M f20421c;

    public p(int i9, j3.M m9, boolean z9) {
        super(AbstractC0953k1.j(i9, "AudioTrack write failed: "));
        this.f20420b = z9;
        this.f20419a = i9;
        this.f20421c = m9;
    }
}
