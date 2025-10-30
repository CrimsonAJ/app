package w4;

import Y2.r;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.A;
import android.support.v4.media.session.B;
import android.support.v4.media.session.InterfaceC0513b;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.t;
import android.support.v4.media.session.y;
import android.support.v4.media.session.z;
import android.text.TextUtils;
import android.util.Log;
import co.notix.R;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.framework.ReconnectionService;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.BinderC0873t;
import com.google.firebase.messaging.u;
import f5.C1183o;
import java.util.ArrayList;
import java.util.Iterator;
import s.C1935e;
import t4.k;
import t4.p;
import u4.C;
import u4.C2077b;
import u4.C2078c;
import v4.C2108a;
import v4.v;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: v, reason: collision with root package name */
    public static final y4.b f24188v = new y4.b("MediaSessionManager", null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f24189a;

    /* renamed from: b, reason: collision with root package name */
    public final C2078c f24190b;

    /* renamed from: c, reason: collision with root package name */
    public final BinderC0873t f24191c;

    /* renamed from: d, reason: collision with root package name */
    public final u4.h f24192d;

    /* renamed from: e, reason: collision with root package name */
    public final v4.f f24193e;

    /* renamed from: f, reason: collision with root package name */
    public final ComponentName f24194f;

    /* renamed from: g, reason: collision with root package name */
    public final ComponentName f24195g;

    /* renamed from: h, reason: collision with root package name */
    public final r f24196h;

    /* renamed from: i, reason: collision with root package name */
    public final r f24197i;
    public final g j;

    /* renamed from: k, reason: collision with root package name */
    public final T4.d f24198k;

    /* renamed from: l, reason: collision with root package name */
    public final m5.c f24199l;

    /* renamed from: m, reason: collision with root package name */
    public final C f24200m;

    /* renamed from: n, reason: collision with root package name */
    public v4.h f24201n;

    /* renamed from: o, reason: collision with root package name */
    public CastDevice f24202o;

    /* renamed from: p, reason: collision with root package name */
    public y f24203p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f24204q;

    /* renamed from: r, reason: collision with root package name */
    public PlaybackStateCompat.CustomAction f24205r;

    /* renamed from: s, reason: collision with root package name */
    public PlaybackStateCompat.CustomAction f24206s;

    /* renamed from: t, reason: collision with root package name */
    public PlaybackStateCompat.CustomAction f24207t;

    /* renamed from: u, reason: collision with root package name */
    public PlaybackStateCompat.CustomAction f24208u;

    public i(Context context, C2078c c2078c, BinderC0873t binderC0873t) {
        u4.h hVar;
        v4.f fVar;
        String str;
        ComponentName componentName;
        String str2;
        ComponentName componentName2;
        v4.f fVar2;
        int size;
        this.f24189a = context;
        this.f24190b = c2078c;
        this.f24191c = binderC0873t;
        y4.b bVar = C2077b.f23643k;
        F4.y.d();
        C2077b c2077b = C2077b.f23645m;
        g gVar = null;
        if (c2077b != null) {
            F4.y.d();
            hVar = c2077b.f23648c;
        } else {
            hVar = null;
        }
        this.f24192d = hVar;
        C2108a c2108a = c2078c.f23663f;
        if (c2108a == null) {
            fVar = null;
        } else {
            fVar = c2108a.f23784d;
        }
        this.f24193e = fVar;
        this.f24200m = new C(2, this);
        if (c2108a == null) {
            str = null;
        } else {
            str = c2108a.f23782b;
        }
        if (!TextUtils.isEmpty(str)) {
            componentName = new ComponentName(context, str);
        } else {
            componentName = null;
        }
        this.f24194f = componentName;
        if (c2108a == null) {
            str2 = null;
        } else {
            str2 = c2108a.f23781a;
        }
        if (!TextUtils.isEmpty(str2)) {
            componentName2 = new ComponentName(context, str2);
        } else {
            componentName2 = null;
        }
        this.f24195g = componentName2;
        r rVar = new r(context);
        this.f24196h = rVar;
        rVar.f8651e = new C1183o(21, this);
        r rVar2 = new r(context);
        this.f24197i = rVar2;
        rVar2.f8651e = new u(this);
        this.f24198k = new T4.d(Looper.getMainLooper(), 4);
        y4.b bVar2 = g.f24167u;
        C2108a c2108a2 = c2078c.f23663f;
        if (c2108a2 != null && (fVar2 = c2108a2.f23784d) != null) {
            v vVar = fVar2.Y;
            if (vVar != null) {
                ArrayList a5 = j.a(vVar);
                int[] b9 = j.b(vVar);
                if (a5 == null) {
                    size = 0;
                } else {
                    size = a5.size();
                }
                y4.b bVar3 = g.f24167u;
                if (a5 != null && !a5.isEmpty()) {
                    if (a5.size() > 5) {
                        Log.e(bVar3.f24917a, bVar3.d(v4.e.class.getSimpleName().concat(" provides more than 5 actions."), new Object[0]));
                    } else if (b9 != null && (b9.length) != 0) {
                        for (int i9 : b9) {
                            if (i9 < 0 || i9 >= size) {
                                Log.e(bVar3.f24917a, bVar3.d(v4.e.class.getSimpleName().concat("provides a compact view action whose index is out of bounds."), new Object[0]));
                                break;
                            }
                        }
                    } else {
                        Log.e(bVar3.f24917a, bVar3.d(v4.e.class.getSimpleName().concat(" doesn't provide any actions for compact view."), new Object[0]));
                    }
                } else {
                    Log.e(bVar3.f24917a, bVar3.d(v4.e.class.getSimpleName().concat(" doesn't provide any action."), new Object[0]));
                }
            }
            gVar = new g(context);
        }
        this.j = gVar;
        this.f24199l = new m5.c(7, this);
    }

    public final void a(v4.h hVar, CastDevice castDevice) {
        C2108a c2108a;
        ComponentName componentName;
        C2078c c2078c = this.f24190b;
        if (c2078c == null) {
            c2108a = null;
        } else {
            c2108a = c2078c.f23663f;
        }
        if (!this.f24204q && c2078c != null && c2108a != null && this.f24193e != null && hVar != null && castDevice != null && (componentName = this.f24195g) != null) {
            this.f24201n = hVar;
            hVar.o(this.f24200m);
            this.f24202o = castDevice;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName);
            Context context = this.f24189a;
            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
            if (c2108a.f23786f) {
                y yVar = new y(context, componentName, broadcast);
                this.f24203p = yVar;
                j(0, null);
                CastDevice castDevice2 = this.f24202o;
                if (castDevice2 != null && !TextUtils.isEmpty(castDevice2.f14586d)) {
                    Bundle bundle = new Bundle();
                    String string = context.getResources().getString(R.string.cast_casting_to_device, this.f24202o.f14586d);
                    C1935e c1935e = MediaMetadataCompat.f9249d;
                    if (c1935e.containsKey("android.media.metadata.ALBUM_ARTIST") && ((Integer) c1935e.get("android.media.metadata.ALBUM_ARTIST")).intValue() != 1) {
                        throw new IllegalArgumentException("The android.media.metadata.ALBUM_ARTIST key cannot be used to put a String");
                    }
                    bundle.putCharSequence("android.media.metadata.ALBUM_ARTIST", string);
                    yVar.Y(new MediaMetadataCompat(bundle));
                }
                yVar.W(new h(this), null);
                ((t) yVar.f9331b).f9318a.setActive(true);
                Iterator it = ((ArrayList) yVar.f9333d).iterator();
                if (!it.hasNext()) {
                    this.f24191c.h1(yVar);
                } else {
                    throw A0.a.h(it);
                }
            }
            this.f24204q = true;
            c();
            return;
        }
        f24188v.b("skip attaching media session", new Object[0]);
    }

    public final void b(Bitmap bitmap, int i9) {
        android.support.v4.media.d dVar;
        String str;
        MediaMetadata metadata;
        y yVar = this.f24203p;
        if (yVar == null) {
            return;
        }
        if (bitmap == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
            bitmap = Bitmap.createBitmap(2, 2, Bitmap.Config.ARGB_8888);
            bitmap.eraseColor(0);
        }
        y yVar2 = this.f24203p;
        MediaMetadataCompat mediaMetadataCompat = null;
        if (yVar2 != null && (metadata = ((android.support.v4.media.session.h) ((O0.c) yVar2.f9332c).f5263b).f9304a.getMetadata()) != null) {
            C1935e c1935e = MediaMetadataCompat.f9249d;
            Parcel obtain = Parcel.obtain();
            metadata.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f9254b = metadata;
            mediaMetadataCompat = createFromParcel;
        }
        if (mediaMetadataCompat == null) {
            dVar = new android.support.v4.media.d();
        } else {
            dVar = new android.support.v4.media.d(mediaMetadataCompat);
        }
        if (i9 == 0) {
            str = "android.media.metadata.DISPLAY_ICON";
        } else {
            str = "android.media.metadata.ALBUM_ART";
        }
        C1935e c1935e2 = MediaMetadataCompat.f9249d;
        if (c1935e2.containsKey(str) && ((Integer) c1935e2.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(A0.a.n("The ", str, " key cannot be used to put a Bitmap"));
        }
        Bundle bundle = dVar.f9259a;
        bundle.putParcelable(str, bitmap);
        yVar.Y(new MediaMetadataCompat(bundle));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w4.i.c():void");
    }

    public final long d(String str, int i9, Bundle bundle) {
        char c3;
        long j;
        int hashCode = str.hashCode();
        if (hashCode != -945151566) {
            if (hashCode != -945080078) {
                if (hashCode == 235550565 && str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    c3 = 0;
                }
                c3 = 65535;
            } else {
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    c3 = 1;
                }
                c3 = 65535;
            }
        } else {
            if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                c3 = 2;
            }
            c3 = 65535;
        }
        if (c3 != 0) {
            if (c3 != 1) {
                if (c3 != 2) {
                    return 0L;
                }
                v4.h hVar = this.f24201n;
                if (hVar != null && hVar.g()) {
                    p d9 = hVar.d();
                    F4.y.h(d9);
                    if ((d9.f23231h & 64) == 0 && d9.f23238p == 0) {
                        Integer num = (Integer) d9.f23246x.get(d9.f23226c);
                        if (num != null && num.intValue() < d9.f23239q.size() - 1) {
                            return 32L;
                        }
                    } else {
                        return 32L;
                    }
                }
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
                return 0L;
            }
            v4.h hVar2 = this.f24201n;
            if (hVar2 != null && hVar2.g()) {
                p d10 = hVar2.d();
                F4.y.h(d10);
                if ((d10.f23231h & 128) == 0 && d10.f23238p == 0) {
                    Integer num2 = (Integer) d10.f23246x.get(d10.f23226c);
                    if (num2 != null && num2.intValue() > 0) {
                        return 16L;
                    }
                } else {
                    return 16L;
                }
            }
            bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            return 0L;
        }
        if (i9 == 3) {
            j = 514;
            i9 = 3;
        } else {
            j = 512;
        }
        if (i9 != 2) {
            return j;
        }
        return 516L;
    }

    public final Uri e(k kVar) {
        boolean z9;
        E4.a aVar;
        C2108a c2108a = this.f24190b.f23663f;
        if (c2108a != null) {
            c2108a.f();
        }
        ArrayList arrayList = kVar.f23197a;
        if (arrayList != null && !arrayList.isEmpty()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            aVar = (E4.a) kVar.f23197a.get(0);
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        return aVar.f1941b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void f(B b9, String str, v4.d dVar) {
        char c3;
        int i9;
        int i10;
        int i11;
        int i12;
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
        Context context = this.f24189a;
        v4.f fVar = this.f24193e;
        PlaybackStateCompat.CustomAction customAction = null;
        if (c3 != 0) {
            if (c3 != 1) {
                if (c3 != 2) {
                    if (c3 != 3) {
                        if (dVar != null) {
                            if (!TextUtils.isEmpty(str)) {
                                String str2 = dVar.f23804c;
                                if (!TextUtils.isEmpty(str2)) {
                                    int i13 = dVar.f23803b;
                                    if (i13 != 0) {
                                        customAction = new PlaybackStateCompat.CustomAction(str, str2, i13, null);
                                    } else {
                                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                                    }
                                } else {
                                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                                }
                            } else {
                                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                            }
                        }
                    } else {
                        if (this.f24208u == null && fVar != null) {
                            String string = context.getResources().getString(fVar.f23818X);
                            if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_DISCONNECT)) {
                                if (!TextUtils.isEmpty(string)) {
                                    int i14 = fVar.f23836q;
                                    if (i14 != 0) {
                                        this.f24208u = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_DISCONNECT, string, i14, null);
                                    } else {
                                        throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                                    }
                                } else {
                                    throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                                }
                            } else {
                                throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                            }
                        }
                        customAction = this.f24208u;
                    }
                } else {
                    if (this.f24207t == null && fVar != null) {
                        String string2 = context.getResources().getString(fVar.f23818X);
                        if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                            if (!TextUtils.isEmpty(string2)) {
                                int i15 = fVar.f23836q;
                                if (i15 != 0) {
                                    this.f24207t = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_STOP_CASTING, string2, i15, null);
                                } else {
                                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                                }
                            } else {
                                throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                            }
                        } else {
                            throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                        }
                    }
                    customAction = this.f24207t;
                }
            } else {
                if (this.f24206s == null && fVar != null) {
                    y4.b bVar = j.f24209a;
                    long j = fVar.f23822c;
                    if (j == 10000) {
                        i11 = fVar.f23816C;
                    } else if (j != 30000) {
                        i11 = fVar.f23815B;
                    } else {
                        i11 = fVar.f23817D;
                    }
                    if (j == 10000) {
                        i12 = fVar.f23834o;
                    } else if (j != 30000) {
                        i12 = fVar.f23833n;
                    } else {
                        i12 = fVar.f23835p;
                    }
                    String string3 = context.getResources().getString(i11);
                    if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_REWIND)) {
                        if (!TextUtils.isEmpty(string3)) {
                            if (i12 != 0) {
                                this.f24206s = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_REWIND, string3, i12, null);
                            } else {
                                throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                            }
                        } else {
                            throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                        }
                    } else {
                        throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                    }
                }
                customAction = this.f24206s;
            }
        } else {
            if (this.f24205r == null && fVar != null) {
                y4.b bVar2 = j.f24209a;
                long j4 = fVar.f23822c;
                if (j4 == 10000) {
                    i9 = fVar.f23845z;
                } else if (j4 != 30000) {
                    i9 = fVar.f23844y;
                } else {
                    i9 = fVar.f23814A;
                }
                if (j4 == 10000) {
                    i10 = fVar.f23831l;
                } else if (j4 != 30000) {
                    i10 = fVar.f23830k;
                } else {
                    i10 = fVar.f23832m;
                }
                String string4 = context.getResources().getString(i9);
                if (!TextUtils.isEmpty(MediaIntentReceiver.ACTION_FORWARD)) {
                    if (!TextUtils.isEmpty(string4)) {
                        if (i10 != 0) {
                            this.f24205r = new PlaybackStateCompat.CustomAction(MediaIntentReceiver.ACTION_FORWARD, string4, i10, null);
                        } else {
                            throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction");
                        }
                    } else {
                        throw new IllegalArgumentException("You must specify a name to build a CustomAction");
                    }
                } else {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction");
                }
            }
            customAction = this.f24205r;
        }
        if (customAction != null) {
            b9.f9260a.add(customAction);
        }
    }

    public final void g(boolean z9) {
        if (this.f24190b.f23664g) {
            m5.c cVar = this.f24199l;
            T4.d dVar = this.f24198k;
            if (cVar != null) {
                dVar.removeCallbacks(cVar);
            }
            Context context = this.f24189a;
            Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
            intent.setPackage(context.getPackageName());
            try {
                context.startService(intent);
            } catch (IllegalStateException unused) {
                if (z9) {
                    dVar.postDelayed(cVar, 1000L);
                }
            }
        }
    }

    public final void h() {
        g gVar = this.j;
        if (gVar != null) {
            f24188v.b("Stopping media notification.", new Object[0]);
            r rVar = gVar.f24176i;
            rVar.V();
            rVar.f8651e = null;
            NotificationManager notificationManager = gVar.f24169b;
            if (notificationManager != null) {
                notificationManager.cancel("castMediaNotification", 1);
            }
        }
    }

    public final void i() {
        if (!this.f24190b.f23664g) {
            return;
        }
        this.f24198k.removeCallbacks(this.f24199l);
        Context context = this.f24189a;
        Intent intent = new Intent(context, (Class<?>) ReconnectionService.class);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);
    }

    public final void j(int i9, MediaInfo mediaInfo) {
        PlaybackStateCompat a5;
        y yVar;
        k kVar;
        long j;
        MediaMetadata metadata;
        MediaMetadataCompat createFromParcel;
        android.support.v4.media.d dVar;
        Bitmap bitmap;
        PendingIntent activity;
        long j4;
        v vVar;
        long j9;
        y yVar2 = this.f24203p;
        if (yVar2 != null) {
            Bundle bundle = new Bundle();
            B b9 = new B();
            v4.h hVar = this.f24201n;
            if (hVar != null && this.j != null) {
                if (hVar.q() == 0 || hVar.i()) {
                    j4 = 0;
                } else {
                    j4 = hVar.a();
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                b9.f9261b = i9;
                b9.f9262c = j4;
                b9.f9265f = elapsedRealtime;
                b9.f9263d = 1.0f;
                if (i9 == 0) {
                    a5 = b9.a();
                } else {
                    v4.f fVar = this.f24193e;
                    if (fVar != null) {
                        vVar = fVar.Y;
                    } else {
                        vVar = null;
                    }
                    v4.h hVar2 = this.f24201n;
                    if (hVar2 == null || hVar2.i() || this.f24201n.m()) {
                        j9 = 0;
                    } else {
                        j9 = 256;
                    }
                    if (vVar != null) {
                        ArrayList a9 = j.a(vVar);
                        if (a9 != null) {
                            int size = a9.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj = a9.get(i10);
                                i10++;
                                v4.d dVar2 = (v4.d) obj;
                                String str = dVar2.f23802a;
                                if (!TextUtils.equals(str, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) && !TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_PREV) && !TextUtils.equals(str, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                    f(b9, str, dVar2);
                                } else {
                                    j9 = d(str, i9, bundle) | j9;
                                }
                            }
                        }
                    } else if (fVar != null) {
                        ArrayList arrayList = fVar.f23820a;
                        int size2 = arrayList.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj2 = arrayList.get(i11);
                            i11++;
                            String str2 = (String) obj2;
                            if (!TextUtils.equals(str2, MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) && !TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_PREV) && !TextUtils.equals(str2, MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                                f(b9, str2, null);
                            } else {
                                j9 = d(str2, i9, bundle) | j9;
                            }
                        }
                    }
                    b9.f9264e = j9;
                    a5 = b9.a();
                }
            } else {
                a5 = b9.a();
            }
            t tVar = (t) yVar2.f9331b;
            tVar.f9323f = a5;
            synchronized (tVar.f9320c) {
                for (int beginBroadcast = tVar.f9322e.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        ((InterfaceC0513b) tVar.f9322e.getBroadcastItem(beginBroadcast)).U0(a5);
                    } catch (RemoteException unused) {
                    }
                }
                tVar.f9322e.finishBroadcast();
            }
            MediaSession mediaSession = tVar.f9318a;
            if (a5.f9290l == null) {
                PlaybackState.Builder d9 = z.d();
                z.x(d9, a5.f9280a, a5.f9281b, a5.f9283d, a5.f9287h);
                z.u(d9, a5.f9282c);
                z.s(d9, a5.f9284e);
                z.v(d9, a5.f9286g);
                ArrayList arrayList2 = a5.f9288i;
                int size3 = arrayList2.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj3 = arrayList2.get(i12);
                    i12++;
                    PlaybackStateCompat.CustomAction customAction = (PlaybackStateCompat.CustomAction) obj3;
                    PlaybackState.CustomAction customAction2 = customAction.f9295e;
                    if (customAction2 == null) {
                        PlaybackState.CustomAction.Builder e8 = z.e(customAction.f9291a, customAction.f9292b, customAction.f9293c);
                        z.w(e8, customAction.f9294d);
                        customAction2 = z.b(e8);
                    }
                    z.a(d9, customAction2);
                }
                z.t(d9, a5.j);
                A.b(d9, a5.f9289k);
                a5.f9290l = z.c(d9);
            }
            mediaSession.setPlaybackState(a5.f9290l);
            v4.f fVar2 = this.f24193e;
            if (fVar2 != null && fVar2.f23819Z) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS", true);
            }
            if (fVar2 != null && fVar2.f23826f0) {
                bundle.putBoolean("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT", true);
            }
            if (bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_PREVIOUS") || bundle.containsKey("android.media.playback.ALWAYS_RESERVE_SPACE_FOR.ACTION_SKIP_TO_NEXT")) {
                ((t) yVar2.f9331b).f9318a.setExtras(bundle);
            }
            if (i9 != 0) {
                if (this.f24201n != null) {
                    ComponentName componentName = this.f24194f;
                    if (componentName == null) {
                        activity = null;
                    } else {
                        Intent intent = new Intent();
                        intent.setComponent(componentName);
                        activity = PendingIntent.getActivity(this.f24189a, 0, intent, 201326592);
                    }
                    if (activity != null) {
                        ((t) yVar2.f9331b).f9318a.setSessionActivity(activity);
                    }
                }
                v4.h hVar3 = this.f24201n;
                if (hVar3 != null && (yVar = this.f24203p) != null && mediaInfo != null && (kVar = mediaInfo.f14611d) != null) {
                    if (hVar3.i()) {
                        j = 0;
                    } else {
                        j = mediaInfo.f14612e;
                    }
                    String f9 = kVar.f("com.google.android.gms.cast.metadata.TITLE");
                    String f10 = kVar.f("com.google.android.gms.cast.metadata.SUBTITLE");
                    y yVar3 = this.f24203p;
                    if (yVar3 == null || (metadata = ((android.support.v4.media.session.h) ((O0.c) yVar3.f9332c).f5263b).f9304a.getMetadata()) == null) {
                        createFromParcel = null;
                    } else {
                        C1935e c1935e = MediaMetadataCompat.f9249d;
                        Parcel obtain = Parcel.obtain();
                        metadata.writeToParcel(obtain, 0);
                        obtain.setDataPosition(0);
                        createFromParcel = MediaMetadataCompat.CREATOR.createFromParcel(obtain);
                        obtain.recycle();
                        createFromParcel.f9254b = metadata;
                    }
                    if (createFromParcel == null) {
                        dVar = new android.support.v4.media.d();
                    } else {
                        dVar = new android.support.v4.media.d(createFromParcel);
                    }
                    C1935e c1935e2 = MediaMetadataCompat.f9249d;
                    if (c1935e2.containsKey("android.media.metadata.DURATION") && ((Integer) c1935e2.get("android.media.metadata.DURATION")).intValue() != 0) {
                        throw new IllegalArgumentException("The android.media.metadata.DURATION key cannot be used to put a long");
                    }
                    dVar.f9259a.putLong("android.media.metadata.DURATION", j);
                    if (f9 != null) {
                        dVar.m("android.media.metadata.TITLE", f9);
                        dVar.m("android.media.metadata.DISPLAY_TITLE", f9);
                    }
                    if (f10 != null) {
                        dVar.m("android.media.metadata.DISPLAY_SUBTITLE", f10);
                    }
                    yVar.Y(new MediaMetadataCompat(dVar.f9259a));
                    Uri e9 = e(kVar);
                    if (e9 != null) {
                        this.f24196h.U(e9);
                        bitmap = null;
                    } else {
                        bitmap = null;
                        b(null, 0);
                    }
                    Uri e10 = e(kVar);
                    if (e10 != null) {
                        this.f24197i.U(e10);
                        return;
                    } else {
                        b(bitmap, 3);
                        return;
                    }
                }
                return;
            }
            yVar2.Y(new MediaMetadataCompat(new Bundle()));
        }
    }
}
