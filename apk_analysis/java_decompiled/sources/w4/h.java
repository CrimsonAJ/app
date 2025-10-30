package w4;

import F4.y;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.r;
import android.view.KeyEvent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import t4.o;
import v4.k;
import v4.n;

/* loaded from: classes.dex */
public final class h extends r {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f24187f;

    public h(i iVar) {
        this.f24187f = iVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.support.v4.media.session.r
    public final void b(String str) {
        char c3;
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        i.f24188v.b("onCustomAction with action = %s", str);
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        i iVar = this.f24187f;
        if (c3 != 0) {
            if (c3 != 1) {
                if (c3 != 2) {
                    if (c3 != 3) {
                        Intent intent = new Intent(str);
                        intent.setComponent(iVar.f24195g);
                        int i9 = Build.VERSION.SDK_INT;
                        Context context = iVar.f24189a;
                        if (i9 >= 34) {
                            makeBasic = BroadcastOptions.makeBasic();
                            shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
                            bundle = shareIdentityEnabled.toBundle();
                            context.sendBroadcast(intent, null, bundle);
                            return;
                        }
                        context.sendBroadcast(intent);
                        return;
                    }
                    u4.h hVar = iVar.f24192d;
                    if (hVar != null) {
                        hVar.b(false);
                        return;
                    }
                    return;
                }
                u4.h hVar2 = iVar.f24192d;
                if (hVar2 != null) {
                    hVar2.b(true);
                    return;
                }
                return;
            }
            long j = -iVar.f24193e.f23822c;
            v4.h hVar3 = iVar.f24201n;
            if (hVar3 != null) {
                long min = Math.min(hVar3.f(), Math.max(0L, hVar3.a() + j));
                v4.h hVar4 = iVar.f24201n;
                if (hVar4 != null) {
                    o oVar = new o(min);
                    y.d();
                    if (!hVar4.w()) {
                        v4.h.r();
                        return;
                    } else {
                        v4.h.x(new n(hVar4, oVar, 0));
                        return;
                    }
                }
                return;
            }
            return;
        }
        long j4 = iVar.f24193e.f23822c;
        v4.h hVar5 = iVar.f24201n;
        if (hVar5 != null) {
            long min2 = Math.min(hVar5.f(), Math.max(0L, hVar5.a() + j4));
            v4.h hVar6 = iVar.f24201n;
            if (hVar6 == null) {
                return;
            }
            o oVar2 = new o(min2);
            y.d();
            if (!hVar6.w()) {
                v4.h.r();
            } else {
                v4.h.x(new n(hVar6, oVar2, 0));
            }
        }
    }

    @Override // android.support.v4.media.session.r
    public final boolean c(Intent intent) {
        v4.h hVar;
        i.f24188v.b("onMediaButtonEvent", new Object[0]);
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null) {
            if ((keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126) && (hVar = this.f24187f.f24201n) != null) {
                hVar.p();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.support.v4.media.session.r
    public final void d() {
        i.f24188v.b("onPause", new Object[0]);
        v4.h hVar = this.f24187f.f24201n;
        if (hVar != null) {
            hVar.p();
        }
    }

    @Override // android.support.v4.media.session.r
    public final void e() {
        i.f24188v.b("onPlay", new Object[0]);
        v4.h hVar = this.f24187f.f24201n;
        if (hVar != null) {
            hVar.p();
        }
    }

    @Override // android.support.v4.media.session.r
    public final void f(long j) {
        i.f24188v.b("onSeekTo %d", Long.valueOf(j));
        v4.h hVar = this.f24187f.f24201n;
        if (hVar == null) {
            return;
        }
        o oVar = new o(j);
        y.d();
        if (!hVar.w()) {
            v4.h.r();
        } else {
            v4.h.x(new n(hVar, oVar, 0));
        }
    }

    @Override // android.support.v4.media.session.r
    public final void g() {
        i.f24188v.b("onSkipToNext", new Object[0]);
        v4.h hVar = this.f24187f.f24201n;
        if (hVar != null) {
            y.d();
            if (!hVar.w()) {
                v4.h.r();
            } else {
                v4.h.x(new k(hVar, 1));
            }
        }
    }

    @Override // android.support.v4.media.session.r
    public final void h() {
        i.f24188v.b("onSkipToPrevious", new Object[0]);
        v4.h hVar = this.f24187f.f24201n;
        if (hVar != null) {
            y.d();
            if (!hVar.w()) {
                v4.h.r();
            } else {
                v4.h.x(new k(hVar, 0));
            }
        }
    }
}
