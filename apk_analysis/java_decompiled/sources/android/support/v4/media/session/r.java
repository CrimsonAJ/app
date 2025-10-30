package android.support.v4.media.session;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import p0.C1835a;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: c, reason: collision with root package name */
    public boolean f9313c;

    /* renamed from: e, reason: collision with root package name */
    public C3.e f9315e;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9311a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final q f9312b = new q(this);

    /* renamed from: d, reason: collision with root package name */
    public WeakReference f9314d = new WeakReference(null);

    public final void a(t tVar, Handler handler) {
        long j;
        boolean z9;
        boolean z10;
        if (this.f9313c) {
            boolean z11 = false;
            this.f9313c = false;
            handler.removeMessages(1);
            PlaybackStateCompat d9 = tVar.d();
            if (d9 == null) {
                j = 0;
            } else {
                j = d9.f9284e;
            }
            if (d9 != null && d9.f9280a == 3) {
                z9 = true;
            } else {
                z9 = false;
            }
            if ((516 & j) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((j & 514) != 0) {
                z11 = true;
            }
            if (z9 && z11) {
                d();
            } else if (!z9 && z10) {
                e();
            }
        }
    }

    public boolean c(Intent intent) {
        t tVar;
        C3.e eVar;
        KeyEvent keyEvent;
        long j;
        if (Build.VERSION.SDK_INT < 27) {
            synchronized (this.f9311a) {
                tVar = (t) this.f9314d.get();
                eVar = this.f9315e;
            }
            if (tVar != null && eVar != null && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0) {
                C1835a c3 = tVar.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79 && keyCode != 85) {
                    a(tVar, eVar);
                    return false;
                }
                if (keyEvent.getRepeatCount() == 0) {
                    if (this.f9313c) {
                        eVar.removeMessages(1);
                        this.f9313c = false;
                        PlaybackStateCompat d9 = tVar.d();
                        if (d9 == null) {
                            j = 0;
                        } else {
                            j = d9.f9284e;
                        }
                        if ((j & 32) != 0) {
                            g();
                        }
                        return true;
                    }
                    this.f9313c = true;
                    eVar.sendMessageDelayed(eVar.obtainMessage(1, c3), ViewConfiguration.getDoubleTapTimeout());
                    return true;
                }
                a(tVar, eVar);
                return true;
            }
        }
        return false;
    }

    public void d() {
    }

    public void e() {
    }

    public void f(long j) {
    }

    public void g() {
    }

    public void h() {
    }

    public final void i(t tVar, Handler handler) {
        synchronized (this.f9311a) {
            try {
                this.f9314d = new WeakReference(tVar);
                C3.e eVar = this.f9315e;
                C3.e eVar2 = null;
                if (eVar != null) {
                    eVar.removeCallbacksAndMessages(null);
                }
                if (tVar != null && handler != null) {
                    eVar2 = new C3.e(this, handler.getLooper(), 1);
                }
                this.f9315e = eVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(String str) {
    }
}
