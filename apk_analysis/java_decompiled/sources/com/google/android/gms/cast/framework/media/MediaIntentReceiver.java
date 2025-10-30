package com.google.android.gms.cast.framework.media;

import F4.y;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import com.google.android.gms.internal.cast.C;
import t4.o;
import u4.C2077b;
import u4.C2079d;
import u4.g;
import u4.v;
import u4.x;
import v4.h;
import v4.k;
import v4.n;
import y4.b;

@Keep
/* loaded from: classes.dex */
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";
    private static final String TAG = "MediaIntentReceiver";
    private static final b log = new b(TAG, null);

    private static h getRemoteMediaClient(C2079d c2079d) {
        boolean z9;
        boolean z10 = false;
        if (c2079d != null) {
            y.d();
            x xVar = c2079d.f23687a;
            if (xVar != null) {
                try {
                    v vVar = (v) xVar;
                    Parcel f12 = vVar.f1(vVar.Q(), 5);
                    int i9 = C.f14693a;
                    if (f12.readInt() != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    f12.recycle();
                    z10 = z9;
                } catch (RemoteException e8) {
                    g.f23686b.a(e8, "Unable to call %s on %s.", "isConnected", x.class.getSimpleName());
                }
            }
            if (z10) {
                y.d();
                return c2079d.j;
            }
            return null;
        }
        return null;
    }

    private void seek(C2079d c2079d, long j) {
        h remoteMediaClient;
        if (j != 0 && (remoteMediaClient = getRemoteMediaClient(c2079d)) != null && !remoteMediaClient.i() && !remoteMediaClient.m()) {
            o oVar = new o(remoteMediaClient.a() + j);
            y.d();
            if (!remoteMediaClient.w()) {
                h.r();
            } else {
                h.x(new n(remoteMediaClient, oVar, 0));
            }
        }
    }

    private void togglePlayback(C2079d c2079d) {
        h remoteMediaClient = getRemoteMediaClient(c2079d);
        if (remoteMediaClient == null) {
            return;
        }
        remoteMediaClient.p();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        char c3;
        String action = intent.getAction();
        log.b("onReceive action: %s", action);
        if (action != null) {
            C2077b a5 = C2077b.a(context);
            a5.getClass();
            y.d();
            u4.h hVar = a5.f23648c;
            g d9 = hVar.d();
            if (d9 != null) {
                switch (action.hashCode()) {
                    case -1699820260:
                        if (action.equals(ACTION_REWIND)) {
                            c3 = 4;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -945151566:
                        if (action.equals(ACTION_SKIP_NEXT)) {
                            c3 = 1;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -945080078:
                        if (action.equals(ACTION_SKIP_PREV)) {
                            c3 = 2;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -668151673:
                        if (action.equals(ACTION_STOP_CASTING)) {
                            c3 = 5;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case -124479363:
                        if (action.equals(ACTION_DISCONNECT)) {
                            c3 = 6;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 235550565:
                        if (action.equals(ACTION_TOGGLE_PLAYBACK)) {
                            c3 = 0;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1362116196:
                        if (action.equals(ACTION_FORWARD)) {
                            c3 = 3;
                            break;
                        }
                        c3 = 65535;
                        break;
                    case 1997055314:
                        if (action.equals("android.intent.action.MEDIA_BUTTON")) {
                            c3 = 7;
                            break;
                        }
                        c3 = 65535;
                        break;
                    default:
                        c3 = 65535;
                        break;
                }
                switch (c3) {
                    case 0:
                        onReceiveActionTogglePlayback(d9);
                        return;
                    case 1:
                        onReceiveActionSkipNext(d9);
                        return;
                    case 2:
                        onReceiveActionSkipPrev(d9);
                        return;
                    case 3:
                        onReceiveActionForward(d9, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                        return;
                    case 4:
                        onReceiveActionRewind(d9, intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                        return;
                    case 5:
                        hVar.b(true);
                        return;
                    case 6:
                        hVar.b(false);
                        return;
                    case 7:
                        onReceiveActionMediaButton(d9, intent);
                        return;
                    default:
                        onReceiveOtherAction(context, action, intent);
                        return;
                }
            }
        }
    }

    public void onReceiveActionForward(g gVar, long j) {
        if (gVar instanceof C2079d) {
            seek((C2079d) gVar, j);
        }
    }

    public void onReceiveActionMediaButton(g gVar, Intent intent) {
        if ((gVar instanceof C2079d) && intent.hasExtra("android.intent.extra.KEY_EVENT")) {
            Bundle extras = intent.getExtras();
            y.h(extras);
            KeyEvent keyEvent = (KeyEvent) extras.get("android.intent.extra.KEY_EVENT");
            if (keyEvent != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
                togglePlayback((C2079d) gVar);
            }
        }
    }

    public void onReceiveActionRewind(g gVar, long j) {
        if (gVar instanceof C2079d) {
            seek((C2079d) gVar, -j);
        }
    }

    public void onReceiveActionSkipNext(g gVar) {
        h remoteMediaClient;
        if ((gVar instanceof C2079d) && (remoteMediaClient = getRemoteMediaClient((C2079d) gVar)) != null && !remoteMediaClient.m()) {
            y.d();
            if (!remoteMediaClient.w()) {
                h.r();
            } else {
                h.x(new k(remoteMediaClient, 1));
            }
        }
    }

    public void onReceiveActionSkipPrev(g gVar) {
        h remoteMediaClient;
        if ((gVar instanceof C2079d) && (remoteMediaClient = getRemoteMediaClient((C2079d) gVar)) != null && !remoteMediaClient.m()) {
            y.d();
            if (!remoteMediaClient.w()) {
                h.r();
            } else {
                h.x(new k(remoteMediaClient, 0));
            }
        }
    }

    public void onReceiveActionTogglePlayback(g gVar) {
        if (gVar instanceof C2079d) {
            togglePlayback((C2079d) gVar);
        }
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
