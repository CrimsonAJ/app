package D;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import co.notix.R;
import java.util.ArrayList;
import java.util.Iterator;
import s.C1936f;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1684a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f1688e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f1689f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f1690g;

    /* renamed from: h, reason: collision with root package name */
    public PendingIntent f1691h;

    /* renamed from: i, reason: collision with root package name */
    public IconCompat f1692i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f1693k;

    /* renamed from: m, reason: collision with root package name */
    public n f1695m;

    /* renamed from: n, reason: collision with root package name */
    public String f1696n;

    /* renamed from: p, reason: collision with root package name */
    public String f1698p;

    /* renamed from: q, reason: collision with root package name */
    public Bundle f1699q;

    /* renamed from: t, reason: collision with root package name */
    public String f1702t;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f1704v;

    /* renamed from: w, reason: collision with root package name */
    public final Notification f1705w;

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f1706x;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1685b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1686c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1687d = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public boolean f1694l = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1697o = false;

    /* renamed from: r, reason: collision with root package name */
    public int f1700r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f1701s = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f1703u = 0;

    public m(Context context, String str) {
        Notification notification = new Notification();
        this.f1705w = notification;
        this.f1684a = context;
        this.f1702t = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f1693k = 0;
        this.f1706x = new ArrayList();
        this.f1704v = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, l1.g] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.content.Context, android.content.res.Resources] */
    public final Notification a() {
        boolean z9;
        boolean z10;
        boolean z11;
        Icon e8;
        Notification build;
        Bundle bundle;
        String Y;
        int i9;
        Bundle bundle2;
        Bundle[] bundleArr;
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        Icon icon;
        Bundle bundle3;
        int i11;
        ?? obj = new Object();
        new ArrayList();
        obj.f20185d = new Bundle();
        obj.f20184c = this;
        Context context = this.f1684a;
        obj.f20182a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            obj.f20183b = p.a(context, this.f1702t);
        } else {
            obj.f20183b = new Notification.Builder(this.f1684a);
        }
        Notification notification = this.f1705w;
        ?? r7 = 0;
        Notification.Builder lights = ((Notification.Builder) obj.f20183b).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z12 = true;
        if ((notification.flags & 2) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z9);
        if ((notification.flags & 8) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z10);
        if ((notification.flags & 16) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z11).setDefaults(notification.defaults).setContentTitle(this.f1688e).setContentText(this.f1689f).setContentInfo(null).setContentIntent(this.f1690g).setDeleteIntent(notification.deleteIntent);
        PendingIntent pendingIntent = this.f1691h;
        if ((notification.flags & 128) == 0) {
            z12 = false;
        }
        deleteIntent.setFullScreenIntent(pendingIntent, z12).setNumber(this.j).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) obj.f20183b;
        IconCompat iconCompat = this.f1692i;
        if (iconCompat == null) {
            e8 = null;
        } else {
            e8 = iconCompat.e(context);
        }
        builder.setLargeIcon(e8);
        ((Notification.Builder) obj.f20183b).setSubText(null).setUsesChronometer(false).setPriority(this.f1693k);
        ArrayList arrayList3 = this.f1685b;
        int size = arrayList3.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            g gVar = (g) obj2;
            if (gVar.f1673b == null && (i11 = gVar.f1677f) != 0) {
                gVar.f1673b = IconCompat.b(r7, "", i11);
            }
            IconCompat iconCompat2 = gVar.f1673b;
            if (iconCompat2 != 0) {
                icon = iconCompat2.e(r7);
            } else {
                icon = r7;
            }
            Throwable th = r7;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(icon, gVar.f1678g, gVar.f1679h);
            y[] yVarArr = gVar.f1674c;
            if (yVarArr != null) {
                int length = yVarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                if (yVarArr.length <= 0) {
                    for (int i13 = 0; i13 < length; i13++) {
                        builder2.addRemoteInput(remoteInputArr[i13]);
                    }
                } else {
                    y yVar = yVarArr[0];
                    throw th;
                }
            }
            Bundle bundle4 = gVar.f1672a;
            if (bundle4 != null) {
                bundle3 = new Bundle(bundle4);
            } else {
                bundle3 = new Bundle();
            }
            boolean z13 = gVar.f1675d;
            bundle3.putBoolean("android.support.allowGeneratedReplies", z13);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 24) {
                o.b(builder2, z13);
            }
            bundle3.putInt("android.support.action.semanticAction", 0);
            if (i14 >= 28) {
                q.a(builder2);
            }
            if (i14 >= 29) {
                d.d(builder2);
            }
            if (i14 >= 31) {
                r.a(builder2);
            }
            bundle3.putBoolean("android.support.action.showsUserInterface", gVar.f1676e);
            builder2.addExtras(bundle3);
            ((Notification.Builder) obj.f20183b).addAction(builder2.build());
            r7 = th;
        }
        String str = r7;
        Bundle bundle5 = this.f1699q;
        if (bundle5 != null) {
            ((Bundle) obj.f20185d).putAll(bundle5);
        }
        int i15 = Build.VERSION.SDK_INT;
        ((Notification.Builder) obj.f20183b).setShowWhen(this.f1694l);
        ((Notification.Builder) obj.f20183b).setLocalOnly(this.f1697o);
        ((Notification.Builder) obj.f20183b).setGroup(this.f1696n);
        ((Notification.Builder) obj.f20183b).setSortKey(str);
        ((Notification.Builder) obj.f20183b).setGroupSummary(false);
        ((Notification.Builder) obj.f20183b).setCategory(this.f1698p);
        ((Notification.Builder) obj.f20183b).setColor(this.f1700r);
        ((Notification.Builder) obj.f20183b).setVisibility(this.f1701s);
        ((Notification.Builder) obj.f20183b).setPublicVersion(null);
        ((Notification.Builder) obj.f20183b).setSound(notification.sound, notification.audioAttributes);
        ArrayList arrayList4 = this.f1706x;
        ArrayList arrayList5 = this.f1686c;
        if (i15 < 28) {
            if (arrayList5 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList5.size());
                Iterator it = arrayList5.iterator();
                if (it.hasNext()) {
                    throw A0.a.h(it);
                }
            }
            if (arrayList2 != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList2;
                } else {
                    C1936f c1936f = new C1936f(arrayList4.size() + arrayList2.size());
                    c1936f.addAll(arrayList2);
                    c1936f.addAll(arrayList4);
                    arrayList4 = new ArrayList(c1936f);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            int size2 = arrayList4.size();
            int i16 = 0;
            while (i16 < size2) {
                Object obj3 = arrayList4.get(i16);
                i16++;
                ((Notification.Builder) obj.f20183b).addPerson((String) obj3);
            }
        }
        ArrayList arrayList6 = this.f1687d;
        if (arrayList6.size() > 0) {
            if (this.f1699q == null) {
                this.f1699q = new Bundle();
            }
            Bundle bundle6 = this.f1699q.getBundle("android.car.EXTENSIONS");
            if (bundle6 == null) {
                bundle6 = new Bundle();
            }
            Bundle bundle7 = new Bundle(bundle6);
            Bundle bundle8 = new Bundle();
            int i17 = 0;
            while (i17 < arrayList6.size()) {
                String num = Integer.toString(i17);
                g gVar2 = (g) arrayList6.get(i17);
                Bundle bundle9 = new Bundle();
                if (gVar2.f1673b == null && (i10 = gVar2.f1677f) != 0) {
                    gVar2.f1673b = IconCompat.b(null, "", i10);
                }
                IconCompat iconCompat3 = gVar2.f1673b;
                if (iconCompat3 != null) {
                    i9 = iconCompat3.c();
                } else {
                    i9 = 0;
                }
                bundle9.putInt("icon", i9);
                bundle9.putCharSequence("title", gVar2.f1678g);
                bundle9.putParcelable("actionIntent", gVar2.f1679h);
                Bundle bundle10 = gVar2.f1672a;
                if (bundle10 != null) {
                    bundle2 = new Bundle(bundle10);
                } else {
                    bundle2 = new Bundle();
                }
                bundle2.putBoolean("android.support.allowGeneratedReplies", gVar2.f1675d);
                bundle9.putBundle("extras", bundle2);
                y[] yVarArr2 = gVar2.f1674c;
                if (yVarArr2 == null) {
                    arrayList = arrayList6;
                    bundleArr = null;
                } else {
                    bundleArr = new Bundle[yVarArr2.length];
                    arrayList = arrayList6;
                    if (yVarArr2.length > 0) {
                        y yVar2 = yVarArr2[0];
                        new Bundle();
                        throw null;
                    }
                }
                bundle9.putParcelableArray("remoteInputs", bundleArr);
                bundle9.putBoolean("showsUserInterface", gVar2.f1676e);
                bundle9.putInt("semanticAction", 0);
                bundle8.putBundle(num, bundle9);
                i17++;
                arrayList6 = arrayList;
            }
            bundle6.putBundle("invisible_actions", bundle8);
            bundle7.putBundle("invisible_actions", bundle8);
            if (this.f1699q == null) {
                this.f1699q = new Bundle();
            }
            this.f1699q.putBundle("android.car.EXTENSIONS", bundle6);
            ((Bundle) obj.f20185d).putBundle("android.car.EXTENSIONS", bundle7);
        }
        int i18 = Build.VERSION.SDK_INT;
        if (i18 >= 24) {
            ((Notification.Builder) obj.f20183b).setExtras(this.f1699q);
            o.c((Notification.Builder) obj.f20183b);
        }
        if (i18 >= 26) {
            p.d((Notification.Builder) obj.f20183b, this.f1703u);
            p.f((Notification.Builder) obj.f20183b);
            p.g((Notification.Builder) obj.f20183b);
            p.h((Notification.Builder) obj.f20183b);
            p.e((Notification.Builder) obj.f20183b);
            if (!TextUtils.isEmpty(this.f1702t)) {
                ((Notification.Builder) obj.f20183b).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i18 >= 28) {
            Iterator it2 = arrayList5.iterator();
            if (it2.hasNext()) {
                throw A0.a.h(it2);
            }
        }
        if (i18 >= 29) {
            d.b((Notification.Builder) obj.f20183b, this.f1704v);
            d.c((Notification.Builder) obj.f20183b);
        }
        m mVar = (m) obj.f20184c;
        n nVar = mVar.f1695m;
        if (nVar != 0) {
            nVar.W(obj);
        }
        int i19 = Build.VERSION.SDK_INT;
        Notification.Builder builder3 = (Notification.Builder) obj.f20183b;
        if (i19 >= 26) {
            build = builder3.build();
        } else if (i19 >= 24) {
            build = builder3.build();
        } else {
            builder3.setExtras((Bundle) obj.f20185d);
            build = builder3.build();
        }
        if (nVar != 0) {
            mVar.f1695m.getClass();
        }
        if (nVar != 0 && (bundle = build.extras) != null && (Y = nVar.Y()) != null) {
            bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", Y);
        }
        return build;
    }

    public final void c(int i9, boolean z9) {
        Notification notification = this.f1705w;
        if (z9) {
            notification.flags = i9 | notification.flags;
        } else {
            notification.flags = (~i9) & notification.flags;
        }
    }

    public final void d(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f1684a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f9577k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f9579b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f1692i = iconCompat;
    }

    public final void e(n nVar) {
        if (this.f1695m != nVar) {
            this.f1695m = nVar;
            if (((m) nVar.f1707a) != this) {
                nVar.f1707a = this;
                e(nVar);
            }
        }
    }
}
