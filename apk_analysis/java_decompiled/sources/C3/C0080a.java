package C3;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import j3.C1462m;

/* renamed from: C3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0080a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m4.h f1432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f1433c;

    public /* synthetic */ C0080a(m mVar, m4.h hVar, int i9) {
        this.f1431a = i9;
        this.f1433c = mVar;
        this.f1432b = hVar;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j4) {
        switch (this.f1431a) {
            case 0:
                ((c) this.f1433c).getClass();
                m4.h hVar = this.f1432b;
                hVar.getClass();
                if (l4.y.f20553a < 30) {
                    Handler handler = hVar.f20745a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                }
                m4.i iVar = hVar.f20746b;
                if (hVar == iVar.f20759J1) {
                    if (j == Long.MAX_VALUE) {
                        iVar.f1517V0 = true;
                        return;
                    }
                    try {
                        iVar.o0(j);
                        iVar.w0();
                        iVar.f1520X0.f20696e++;
                        iVar.v0();
                        iVar.X(j);
                        return;
                    } catch (C1462m e8) {
                        iVar.f1518W0 = e8;
                        return;
                    }
                }
                return;
            default:
                ((android.support.v4.media.session.y) this.f1433c).getClass();
                m4.h hVar2 = this.f1432b;
                hVar2.getClass();
                if (l4.y.f20553a < 30) {
                    Handler handler2 = hVar2.f20745a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                }
                m4.i iVar2 = hVar2.f20746b;
                if (hVar2 == iVar2.f20759J1) {
                    if (j == Long.MAX_VALUE) {
                        iVar2.f1517V0 = true;
                        return;
                    }
                    try {
                        iVar2.o0(j);
                        iVar2.w0();
                        iVar2.f1520X0.f20696e++;
                        iVar2.v0();
                        iVar2.X(j);
                        return;
                    } catch (C1462m e9) {
                        iVar2.f1518W0 = e9;
                        return;
                    }
                }
                return;
        }
    }
}
