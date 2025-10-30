package m3;

import android.media.MediaCodec;
import k4.C1499E;
import l4.y;

/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1589b {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f20683a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f20684b;

    /* renamed from: c, reason: collision with root package name */
    public int f20685c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f20686d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f20687e;

    /* renamed from: f, reason: collision with root package name */
    public int f20688f;

    /* renamed from: g, reason: collision with root package name */
    public int f20689g;

    /* renamed from: h, reason: collision with root package name */
    public int f20690h;

    /* renamed from: i, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f20691i;
    public final C1499E j;

    public C1589b() {
        C1499E c1499e;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f20691i = cryptoInfo;
        if (y.f20553a >= 24) {
            c1499e = new C1499E(cryptoInfo);
        } else {
            c1499e = null;
        }
        this.j = c1499e;
    }
}
