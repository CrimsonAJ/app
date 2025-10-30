package w4;

import D.m;
import F4.y;
import Y2.r;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import co.notix.R;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.internal.cast.C0890x0;
import com.google.android.gms.internal.cast.EnumC0894y0;
import com.google.firebase.messaging.AbstractC1059e;
import java.util.ArrayList;
import java.util.Arrays;
import k4.C1499E;
import u4.C2077b;
import u4.C2078c;
import v4.C2108a;
import v4.v;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: u, reason: collision with root package name */
    public static final y4.b f24167u = new y4.b("MediaNotificationProxy", null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f24168a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f24169b;

    /* renamed from: c, reason: collision with root package name */
    public final v4.f f24170c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f24171d;

    /* renamed from: e, reason: collision with root package name */
    public final ComponentName f24172e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f24173f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public int[] f24174g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24175h;

    /* renamed from: i, reason: collision with root package name */
    public final r f24176i;
    public final Resources j;

    /* renamed from: k, reason: collision with root package name */
    public f f24177k;

    /* renamed from: l, reason: collision with root package name */
    public C1499E f24178l;

    /* renamed from: m, reason: collision with root package name */
    public D.g f24179m;

    /* renamed from: n, reason: collision with root package name */
    public D.g f24180n;

    /* renamed from: o, reason: collision with root package name */
    public D.g f24181o;

    /* renamed from: p, reason: collision with root package name */
    public D.g f24182p;

    /* renamed from: q, reason: collision with root package name */
    public D.g f24183q;

    /* renamed from: r, reason: collision with root package name */
    public D.g f24184r;

    /* renamed from: s, reason: collision with root package name */
    public D.g f24185s;

    /* renamed from: t, reason: collision with root package name */
    public D.g f24186t;

    public g(Context context) {
        this.f24168a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.f24169b = notificationManager;
        y4.b bVar = C2077b.f23643k;
        y.d();
        C2077b c2077b = C2077b.f23645m;
        y.h(c2077b);
        y.d();
        C2078c c2078c = c2077b.f23650e;
        y.h(c2078c);
        C2108a c2108a = c2078c.f23663f;
        y.h(c2108a);
        v4.f fVar = c2108a.f23784d;
        y.h(fVar);
        this.f24170c = fVar;
        c2108a.f();
        Resources resources = context.getResources();
        this.j = resources;
        this.f24171d = new ComponentName(context.getApplicationContext(), c2108a.f23781a);
        String str = fVar.f23823d;
        if (!TextUtils.isEmpty(str)) {
            this.f24172e = new ComponentName(context.getApplicationContext(), str);
        } else {
            this.f24172e = null;
        }
        this.f24175h = fVar.f23822c;
        int dimensionPixelSize = resources.getDimensionPixelSize(fVar.f23837r);
        this.f24176i = new r(context.getApplicationContext(), new v4.b(1, dimensionPixelSize, dimensionPixelSize));
        if (K4.b.d() && notificationManager != null) {
            NotificationChannel A2 = AbstractC1059e.A(context.getResources().getString(R.string.media_notification_channel_name));
            A2.setShowBadge(false);
            notificationManager.createNotificationChannel(A2);
        }
        C0890x0.a(EnumC0894y0.CAF_MEDIA_NOTIFICATION_PROXY);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final D.g a(String str) {
        char c3;
        IconCompat b9;
        D.y[] yVarArr;
        D.y[] yVarArr2;
        int i9;
        int i10;
        IconCompat b10;
        D.y[] yVarArr3;
        D.y[] yVarArr4;
        PendingIntent pendingIntent;
        IconCompat b11;
        D.y[] yVarArr5;
        D.y[] yVarArr6;
        PendingIntent pendingIntent2;
        IconCompat b12;
        D.y[] yVarArr7;
        D.y[] yVarArr8;
        int i11;
        IconCompat b13;
        D.y[] yVarArr9;
        D.y[] yVarArr10;
        int i12;
        IconCompat b14;
        D.y[] yVarArr11;
        D.y[] yVarArr12;
        IconCompat b15;
        D.y[] yVarArr13;
        D.y[] yVarArr14;
        IconCompat b16;
        D.y[] yVarArr15;
        D.y[] yVarArr16;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        long j = this.f24175h;
        Resources resources = this.j;
        Context context = this.f24168a;
        ComponentName componentName = this.f24171d;
        char c9 = c3;
        v4.f fVar = this.f24170c;
        switch (c9) {
            case 0:
                f fVar2 = this.f24177k;
                int i13 = fVar2.f24162c;
                if (fVar2.f24161b) {
                    if (this.f24180n == null) {
                        if (i13 == 2) {
                            i9 = fVar.f23825f;
                            i10 = fVar.f23839t;
                        } else {
                            i9 = fVar.f23827g;
                            i10 = fVar.f23840u;
                        }
                        Intent intent = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent.setComponent(componentName);
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 67108864);
                        String string = resources.getString(i10);
                        if (i9 == 0) {
                            b10 = null;
                        } else {
                            b10 = IconCompat.b(null, "", i9);
                        }
                        Bundle bundle = new Bundle();
                        CharSequence b17 = m.b(string);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        if (arrayList.isEmpty()) {
                            yVarArr3 = null;
                        } else {
                            yVarArr3 = (D.y[]) arrayList.toArray(new D.y[arrayList.size()]);
                        }
                        if (arrayList2.isEmpty()) {
                            yVarArr4 = null;
                        } else {
                            yVarArr4 = (D.y[]) arrayList2.toArray(new D.y[arrayList2.size()]);
                        }
                        this.f24180n = new D.g(b10, b17, broadcast, bundle, yVarArr4, yVarArr3, true, true);
                    }
                    return this.f24180n;
                }
                if (this.f24179m == null) {
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                    intent2.setComponent(componentName);
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                    int i14 = fVar.f23828h;
                    String string2 = resources.getString(fVar.f23841v);
                    if (i14 == 0) {
                        b9 = null;
                    } else {
                        b9 = IconCompat.b(null, "", i14);
                    }
                    Bundle bundle2 = new Bundle();
                    CharSequence b18 = m.b(string2);
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    if (arrayList3.isEmpty()) {
                        yVarArr = null;
                    } else {
                        yVarArr = (D.y[]) arrayList3.toArray(new D.y[arrayList3.size()]);
                    }
                    if (arrayList4.isEmpty()) {
                        yVarArr2 = null;
                    } else {
                        yVarArr2 = (D.y[]) arrayList4.toArray(new D.y[arrayList4.size()]);
                    }
                    this.f24179m = new D.g(b9, b18, broadcast2, bundle2, yVarArr2, yVarArr, true, true);
                }
                return this.f24179m;
            case 1:
                boolean z9 = this.f24177k.f24165f;
                if (this.f24181o == null) {
                    if (z9) {
                        Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                        intent3.setComponent(componentName);
                        pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                    } else {
                        pendingIntent = null;
                    }
                    int i15 = fVar.f23829i;
                    String string3 = resources.getString(fVar.f23842w);
                    if (i15 == 0) {
                        b11 = null;
                    } else {
                        b11 = IconCompat.b(null, "", i15);
                    }
                    Bundle bundle3 = new Bundle();
                    CharSequence b19 = m.b(string3);
                    ArrayList arrayList5 = new ArrayList();
                    ArrayList arrayList6 = new ArrayList();
                    if (arrayList5.isEmpty()) {
                        yVarArr5 = null;
                    } else {
                        yVarArr5 = (D.y[]) arrayList5.toArray(new D.y[arrayList5.size()]);
                    }
                    if (arrayList6.isEmpty()) {
                        yVarArr6 = null;
                    } else {
                        yVarArr6 = (D.y[]) arrayList6.toArray(new D.y[arrayList6.size()]);
                    }
                    this.f24181o = new D.g(b11, b19, pendingIntent, bundle3, yVarArr6, yVarArr5, true, true);
                }
                return this.f24181o;
            case 2:
                boolean z10 = this.f24177k.f24166g;
                if (this.f24182p == null) {
                    if (z10) {
                        Intent intent4 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                        intent4.setComponent(componentName);
                        pendingIntent2 = PendingIntent.getBroadcast(context, 0, intent4, 67108864);
                    } else {
                        pendingIntent2 = null;
                    }
                    int i16 = fVar.j;
                    String string4 = resources.getString(fVar.f23843x);
                    if (i16 == 0) {
                        b12 = null;
                    } else {
                        b12 = IconCompat.b(null, "", i16);
                    }
                    Bundle bundle4 = new Bundle();
                    CharSequence b20 = m.b(string4);
                    ArrayList arrayList7 = new ArrayList();
                    ArrayList arrayList8 = new ArrayList();
                    if (arrayList7.isEmpty()) {
                        yVarArr7 = null;
                    } else {
                        yVarArr7 = (D.y[]) arrayList7.toArray(new D.y[arrayList7.size()]);
                    }
                    if (arrayList8.isEmpty()) {
                        yVarArr8 = null;
                    } else {
                        yVarArr8 = (D.y[]) arrayList8.toArray(new D.y[arrayList8.size()]);
                    }
                    this.f24182p = new D.g(b12, b20, pendingIntent2, bundle4, yVarArr8, yVarArr7, true, true);
                }
                return this.f24182p;
            case 3:
                if (this.f24183q == null) {
                    Intent intent5 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                    intent5.setComponent(componentName);
                    intent5.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    PendingIntent broadcast3 = PendingIntent.getBroadcast(context, 0, intent5, 201326592);
                    y4.b bVar = j.f24209a;
                    int i17 = fVar.f23830k;
                    if (j == 10000) {
                        i17 = fVar.f23831l;
                    } else if (j == 30000) {
                        i17 = fVar.f23832m;
                    }
                    if (j == 10000) {
                        i11 = fVar.f23845z;
                    } else if (j != 30000) {
                        i11 = fVar.f23844y;
                    } else {
                        i11 = fVar.f23814A;
                    }
                    String string5 = resources.getString(i11);
                    if (i17 == 0) {
                        b13 = null;
                    } else {
                        b13 = IconCompat.b(null, "", i17);
                    }
                    Bundle bundle5 = new Bundle();
                    CharSequence b21 = m.b(string5);
                    ArrayList arrayList9 = new ArrayList();
                    ArrayList arrayList10 = new ArrayList();
                    if (arrayList9.isEmpty()) {
                        yVarArr9 = null;
                    } else {
                        yVarArr9 = (D.y[]) arrayList9.toArray(new D.y[arrayList9.size()]);
                    }
                    if (arrayList10.isEmpty()) {
                        yVarArr10 = null;
                    } else {
                        yVarArr10 = (D.y[]) arrayList10.toArray(new D.y[arrayList10.size()]);
                    }
                    this.f24183q = new D.g(b13, b21, broadcast3, bundle5, yVarArr10, yVarArr9, true, true);
                }
                return this.f24183q;
            case 4:
                if (this.f24184r == null) {
                    Intent intent6 = new Intent(MediaIntentReceiver.ACTION_REWIND);
                    intent6.setComponent(componentName);
                    intent6.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    PendingIntent broadcast4 = PendingIntent.getBroadcast(context, 0, intent6, 201326592);
                    y4.b bVar2 = j.f24209a;
                    int i18 = fVar.f23833n;
                    if (j == 10000) {
                        i18 = fVar.f23834o;
                    } else if (j == 30000) {
                        i18 = fVar.f23835p;
                    }
                    if (j == 10000) {
                        i12 = fVar.f23816C;
                    } else if (j != 30000) {
                        i12 = fVar.f23815B;
                    } else {
                        i12 = fVar.f23817D;
                    }
                    String string6 = resources.getString(i12);
                    if (i18 == 0) {
                        b14 = null;
                    } else {
                        b14 = IconCompat.b(null, "", i18);
                    }
                    Bundle bundle6 = new Bundle();
                    CharSequence b22 = m.b(string6);
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    if (arrayList11.isEmpty()) {
                        yVarArr11 = null;
                    } else {
                        yVarArr11 = (D.y[]) arrayList11.toArray(new D.y[arrayList11.size()]);
                    }
                    if (arrayList12.isEmpty()) {
                        yVarArr12 = null;
                    } else {
                        yVarArr12 = (D.y[]) arrayList12.toArray(new D.y[arrayList12.size()]);
                    }
                    this.f24184r = new D.g(b14, b22, broadcast4, bundle6, yVarArr12, yVarArr11, true, true);
                }
                return this.f24184r;
            case 5:
                if (this.f24186t == null) {
                    Intent intent7 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                    intent7.setComponent(componentName);
                    PendingIntent broadcast5 = PendingIntent.getBroadcast(context, 0, intent7, 67108864);
                    int i19 = fVar.f23836q;
                    String string7 = resources.getString(fVar.f23818X);
                    if (i19 == 0) {
                        b15 = null;
                    } else {
                        b15 = IconCompat.b(null, "", i19);
                    }
                    Bundle bundle7 = new Bundle();
                    CharSequence b23 = m.b(string7);
                    ArrayList arrayList13 = new ArrayList();
                    ArrayList arrayList14 = new ArrayList();
                    if (arrayList13.isEmpty()) {
                        yVarArr13 = null;
                    } else {
                        yVarArr13 = (D.y[]) arrayList13.toArray(new D.y[arrayList13.size()]);
                    }
                    if (arrayList14.isEmpty()) {
                        yVarArr14 = null;
                    } else {
                        yVarArr14 = (D.y[]) arrayList14.toArray(new D.y[arrayList14.size()]);
                    }
                    this.f24186t = new D.g(b15, b23, broadcast5, bundle7, yVarArr14, yVarArr13, true, true);
                }
                return this.f24186t;
            case 6:
                if (this.f24185s == null) {
                    Intent intent8 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                    intent8.setComponent(componentName);
                    PendingIntent broadcast6 = PendingIntent.getBroadcast(context, 0, intent8, 67108864);
                    int i20 = fVar.f23836q;
                    String string8 = resources.getString(fVar.f23818X, "");
                    if (i20 == 0) {
                        b16 = null;
                    } else {
                        b16 = IconCompat.b(null, "", i20);
                    }
                    Bundle bundle8 = new Bundle();
                    CharSequence b24 = m.b(string8);
                    ArrayList arrayList15 = new ArrayList();
                    ArrayList arrayList16 = new ArrayList();
                    if (arrayList15.isEmpty()) {
                        yVarArr15 = null;
                    } else {
                        yVarArr15 = (D.y[]) arrayList15.toArray(new D.y[arrayList15.size()]);
                    }
                    if (arrayList16.isEmpty()) {
                        yVarArr16 = null;
                    } else {
                        yVarArr16 = (D.y[]) arrayList16.toArray(new D.y[arrayList16.size()]);
                    }
                    this.f24185s = new D.g(b16, b24, broadcast6, bundle8, yVarArr16, yVarArr15, true, true);
                }
                return this.f24185s;
            default:
                y4.b bVar3 = f24167u;
                Log.e(bVar3.f24917a, bVar3.d("Action: %s is not a pre-defined action.", str));
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [D.n, q0.b, java.lang.Object] */
    public final void b() {
        Bitmap bitmap;
        PendingIntent activities;
        int[] iArr;
        D.g a5;
        IconCompat b9;
        D.y[] yVarArr;
        D.y[] yVarArr2;
        int i9 = 0;
        NotificationManager notificationManager = this.f24169b;
        if (notificationManager != null && this.f24177k != null) {
            C1499E c1499e = this.f24178l;
            if (c1499e == null || (bitmap = (Bitmap) c1499e.f19986c) == null || bitmap.getWidth() <= 1 || bitmap.getHeight() <= 1) {
                bitmap = null;
            }
            Context context = this.f24168a;
            m mVar = new m(context, "cast_media_notification");
            mVar.d(bitmap);
            v4.f fVar = this.f24170c;
            mVar.f1705w.icon = fVar.f23824e;
            mVar.f1688e = m.b(this.f24177k.f24163d);
            mVar.f1689f = m.b(this.j.getString(fVar.f23838s, this.f24177k.f24164e));
            mVar.c(2, true);
            mVar.f1694l = false;
            mVar.f1701s = 1;
            ComponentName componentName = this.f24172e;
            if (componentName == null) {
                activities = null;
            } else {
                Intent intent = new Intent();
                intent.putExtra("targetActivity", componentName);
                intent.setAction(componentName.flattenToString());
                intent.setComponent(componentName);
                ArrayList arrayList = new ArrayList();
                ComponentName component = intent.getComponent();
                if (component == null) {
                    component = intent.resolveActivity(context.getPackageManager());
                }
                if (component != null) {
                    int size = arrayList.size();
                    try {
                        for (Intent a9 = D.c.a(context, component); a9 != null; a9 = D.c.a(context, a9.getComponent())) {
                            arrayList.add(size, a9);
                        }
                    } catch (PackageManager.NameNotFoundException e8) {
                        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                        throw new IllegalArgumentException(e8);
                    }
                }
                arrayList.add(intent);
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
                } else {
                    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
                }
            }
            if (activities != null) {
                mVar.f1690g = activities;
            }
            y4.b bVar = f24167u;
            v vVar = fVar.Y;
            if (vVar != null) {
                bVar.b("actionsProvider != null", new Object[0]);
                int[] b10 = j.b(vVar);
                if (b10 == null) {
                    iArr = null;
                } else {
                    iArr = (int[]) b10.clone();
                }
                this.f24174g = iArr;
                ArrayList a10 = j.a(vVar);
                this.f24173f = new ArrayList();
                if (a10 != null) {
                    int size2 = a10.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        Object obj = a10.get(i10);
                        i10++;
                        v4.d dVar = (v4.d) obj;
                        String str = dVar.f23802a;
                        boolean equals = str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        String str2 = dVar.f23802a;
                        if (!equals && !str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) && !str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) && !str.equals(MediaIntentReceiver.ACTION_FORWARD) && !str.equals(MediaIntentReceiver.ACTION_REWIND) && !str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) && !str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                            Intent intent2 = new Intent(str2);
                            intent2.setComponent(this.f24171d);
                            PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                            int i11 = dVar.f23803b;
                            if (i11 == 0) {
                                b9 = null;
                            } else {
                                b9 = IconCompat.b(null, "", i11);
                            }
                            Bundle bundle = new Bundle();
                            CharSequence b11 = m.b(dVar.f23804c);
                            ArrayList arrayList2 = new ArrayList();
                            ArrayList arrayList3 = new ArrayList();
                            if (arrayList2.isEmpty()) {
                                yVarArr = null;
                            } else {
                                yVarArr = (D.y[]) arrayList2.toArray(new D.y[arrayList2.size()]);
                            }
                            if (arrayList3.isEmpty()) {
                                yVarArr2 = null;
                            } else {
                                yVarArr2 = (D.y[]) arrayList3.toArray(new D.y[arrayList3.size()]);
                            }
                            a5 = new D.g(b9, b11, broadcast, bundle, yVarArr2, yVarArr, true, true);
                        } else {
                            a5 = a(str2);
                        }
                        if (a5 != null) {
                            this.f24173f.add(a5);
                        }
                    }
                }
            } else {
                bVar.b("actionsProvider == null", new Object[0]);
                this.f24173f = new ArrayList();
                ArrayList arrayList4 = fVar.f23820a;
                int size3 = arrayList4.size();
                int i12 = 0;
                while (i12 < size3) {
                    Object obj2 = arrayList4.get(i12);
                    i12++;
                    D.g a11 = a((String) obj2);
                    if (a11 != null) {
                        this.f24173f.add(a11);
                    }
                }
                int[] iArr2 = fVar.f23821b;
                this.f24174g = (int[]) Arrays.copyOf(iArr2, iArr2.length).clone();
            }
            ArrayList arrayList5 = this.f24173f;
            int size4 = arrayList5.size();
            while (i9 < size4) {
                Object obj3 = arrayList5.get(i9);
                i9++;
                D.g gVar = (D.g) obj3;
                if (gVar != null) {
                    mVar.f1685b.add(gVar);
                }
            }
            ?? obj4 = new Object();
            obj4.f22234b = null;
            int[] iArr3 = this.f24174g;
            if (iArr3 != null) {
                obj4.f22234b = iArr3;
            }
            MediaSessionCompat$Token mediaSessionCompat$Token = this.f24177k.f24160a;
            if (mediaSessionCompat$Token != null) {
                obj4.f22235c = mediaSessionCompat$Token;
            }
            mVar.e(obj4);
            notificationManager.notify("castMediaNotification", 1, mVar.a());
        }
    }
}
