package m3;

import java.util.Locale;
import l4.y;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f20692a;

    /* renamed from: b, reason: collision with root package name */
    public int f20693b;

    /* renamed from: c, reason: collision with root package name */
    public int f20694c;

    /* renamed from: d, reason: collision with root package name */
    public int f20695d;

    /* renamed from: e, reason: collision with root package name */
    public int f20696e;

    /* renamed from: f, reason: collision with root package name */
    public int f20697f;

    /* renamed from: g, reason: collision with root package name */
    public int f20698g;

    /* renamed from: h, reason: collision with root package name */
    public int f20699h;

    /* renamed from: i, reason: collision with root package name */
    public int f20700i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public long f20701k;

    /* renamed from: l, reason: collision with root package name */
    public int f20702l;

    public final String toString() {
        int i9 = this.f20692a;
        int i10 = this.f20693b;
        int i11 = this.f20694c;
        int i12 = this.f20695d;
        int i13 = this.f20696e;
        int i14 = this.f20697f;
        int i15 = this.f20698g;
        int i16 = this.f20699h;
        int i17 = this.f20700i;
        int i18 = this.j;
        long j = this.f20701k;
        int i19 = this.f20702l;
        int i20 = y.f20553a;
        Locale locale = Locale.US;
        return "DecoderCounters {\n decoderInits=" + i9 + ",\n decoderReleases=" + i10 + "\n queuedInputBuffers=" + i11 + "\n skippedInputBuffers=" + i12 + "\n renderedOutputBuffers=" + i13 + "\n skippedOutputBuffers=" + i14 + "\n droppedBuffers=" + i15 + "\n droppedInputBuffers=" + i16 + "\n maxConsecutiveDroppedBuffers=" + i17 + "\n droppedToKeyframeEvents=" + i18 + "\n totalVideoFrameProcessingOffsetUs=" + j + "\n videoFrameProcessingOffsetCount=" + i19 + "\n}";
    }
}
