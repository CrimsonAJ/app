package m4;

import android.os.Handler;
import android.os.Message;
import j3.C1462m;
import l4.y;

/* loaded from: classes.dex */
public final class h implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f20745a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f20746b;

    public h(i iVar, C3.m mVar) {
        this.f20746b = iVar;
        Handler l9 = y.l(this);
        this.f20745a = l9;
        mVar.g(this, l9);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i9 = message.arg1;
        int i10 = message.arg2;
        int i11 = y.f20553a;
        long j = ((i9 & 4294967295L) << 32) | (4294967295L & i10);
        i iVar = this.f20746b;
        if (this == iVar.f20759J1) {
            if (j == Long.MAX_VALUE) {
                iVar.f1517V0 = true;
            } else {
                try {
                    iVar.o0(j);
                    iVar.w0();
                    iVar.f1520X0.f20696e++;
                    iVar.v0();
                    iVar.X(j);
                } catch (C1462m e8) {
                    iVar.f1518W0 = e8;
                }
            }
        }
        return true;
    }
}
