package androidx.mediarouter.app;

import android.app.PendingIntent;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import co.notix.R;

/* renamed from: androidx.mediarouter.app.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0578n implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f10108b;

    public /* synthetic */ ViewOnClickListenerC0578n(s sVar, int i9) {
        this.f10107a = i9;
        this.f10108b = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PlaybackStateCompat playbackStateCompat;
        Interpolator interpolator;
        PendingIntent sessionActivity;
        switch (this.f10107a) {
            case 0:
                int id = view.getId();
                s sVar = this.f10108b;
                int i9 = 1;
                if (id != 16908313 && id != 16908314) {
                    if (id == R.id.mr_control_playback_ctrl) {
                        O0.c cVar = sVar.f10164q0;
                        if (cVar != null && (playbackStateCompat = sVar.f10167s0) != null) {
                            int i10 = 0;
                            if (playbackStateCompat.f9280a != 3) {
                                i9 = 0;
                            }
                            if (i9 != 0 && (playbackStateCompat.f9284e & 514) != 0) {
                                cVar.D().f9309a.pause();
                                i10 = R.string.mr_controller_pause;
                            } else if (i9 != 0 && (playbackStateCompat.f9284e & 1) != 0) {
                                cVar.D().f9309a.stop();
                                i10 = R.string.mr_controller_stop;
                            } else if (i9 == 0 && (playbackStateCompat.f9284e & 516) != 0) {
                                cVar.D().f9309a.play();
                                i10 = R.string.mr_controller_play;
                            }
                            AccessibilityManager accessibilityManager = sVar.f10139L0;
                            if (accessibilityManager != null && accessibilityManager.isEnabled() && i10 != 0) {
                                AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
                                obtain.setPackageName(sVar.j.getPackageName());
                                obtain.setClassName(ViewOnClickListenerC0578n.class.getName());
                                obtain.getText().add(sVar.j.getString(i10));
                                accessibilityManager.sendAccessibilityEvent(obtain);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (id == R.id.mr_close) {
                        sVar.dismiss();
                        return;
                    }
                    return;
                }
                if (sVar.f10148i.g()) {
                    if (id == 16908313) {
                        i9 = 2;
                    }
                    sVar.f10144g.getClass();
                    t0.D.i(i9);
                }
                sVar.dismiss();
                return;
            case 1:
                s sVar2 = this.f10108b;
                boolean z9 = sVar2.f10129C0;
                sVar2.f10129C0 = !z9;
                if (!z9) {
                    sVar2.f10141X.setVisibility(0);
                }
                if (sVar2.f10129C0) {
                    interpolator = sVar2.f10137J0;
                } else {
                    interpolator = sVar2.f10138K0;
                }
                sVar2.f10136I0 = interpolator;
                sVar2.s(true);
                return;
            case 2:
                this.f10108b.dismiss();
                return;
            default:
                s sVar3 = this.f10108b;
                O0.c cVar2 = sVar3.f10164q0;
                if (cVar2 != null && (sessionActivity = ((android.support.v4.media.session.h) cVar2.f5263b).f9304a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        sVar3.dismiss();
                        return;
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                        return;
                    }
                }
                return;
        }
    }
}
