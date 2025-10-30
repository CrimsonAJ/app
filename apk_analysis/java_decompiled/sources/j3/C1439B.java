package j3;

import android.media.MediaFormat;
import n4.InterfaceC1650a;

/* renamed from: j3.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1439B implements m4.o, InterfaceC1650a, s0 {

    /* renamed from: a, reason: collision with root package name */
    public m4.o f19229a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1650a f19230b;

    /* renamed from: c, reason: collision with root package name */
    public m4.o f19231c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC1650a f19232d;

    @Override // m4.o
    public final void a(long j, long j4, M m9, MediaFormat mediaFormat) {
        long j9;
        long j10;
        M m10;
        MediaFormat mediaFormat2;
        m4.o oVar = this.f19231c;
        if (oVar != null) {
            oVar.a(j, j4, m9, mediaFormat);
            mediaFormat2 = mediaFormat;
            m10 = m9;
            j10 = j4;
            j9 = j;
        } else {
            j9 = j;
            j10 = j4;
            m10 = m9;
            mediaFormat2 = mediaFormat;
        }
        m4.o oVar2 = this.f19229a;
        if (oVar2 != null) {
            oVar2.a(j9, j10, m10, mediaFormat2);
        }
    }

    @Override // n4.InterfaceC1650a
    public final void b(long j, float[] fArr) {
        InterfaceC1650a interfaceC1650a = this.f19232d;
        if (interfaceC1650a != null) {
            interfaceC1650a.b(j, fArr);
        }
        InterfaceC1650a interfaceC1650a2 = this.f19230b;
        if (interfaceC1650a2 != null) {
            interfaceC1650a2.b(j, fArr);
        }
    }

    @Override // n4.InterfaceC1650a
    public final void c() {
        InterfaceC1650a interfaceC1650a = this.f19232d;
        if (interfaceC1650a != null) {
            interfaceC1650a.c();
        }
        InterfaceC1650a interfaceC1650a2 = this.f19230b;
        if (interfaceC1650a2 != null) {
            interfaceC1650a2.c();
        }
    }

    @Override // j3.s0
    public final void d(int i9, Object obj) {
        if (i9 != 7) {
            if (i9 != 8) {
                if (i9 != 10000) {
                    return;
                }
                n4.k kVar = (n4.k) obj;
                if (kVar == null) {
                    this.f19231c = null;
                    this.f19232d = null;
                    return;
                } else {
                    this.f19231c = kVar.getVideoFrameMetadataListener();
                    this.f19232d = kVar.getCameraMotionListener();
                    return;
                }
            }
            this.f19230b = (InterfaceC1650a) obj;
            return;
        }
        this.f19229a = (m4.o) obj;
    }
}
