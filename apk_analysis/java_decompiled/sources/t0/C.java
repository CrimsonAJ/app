package t0;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class C {

    /* renamed from: a, reason: collision with root package name */
    public final C1966B f22840a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22841b;

    /* renamed from: c, reason: collision with root package name */
    public final String f22842c;

    /* renamed from: d, reason: collision with root package name */
    public String f22843d;

    /* renamed from: e, reason: collision with root package name */
    public String f22844e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f22845f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22846g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22847h;

    /* renamed from: i, reason: collision with root package name */
    public int f22848i;
    public boolean j;

    /* renamed from: l, reason: collision with root package name */
    public int f22850l;

    /* renamed from: m, reason: collision with root package name */
    public int f22851m;

    /* renamed from: n, reason: collision with root package name */
    public int f22852n;

    /* renamed from: o, reason: collision with root package name */
    public int f22853o;

    /* renamed from: p, reason: collision with root package name */
    public int f22854p;

    /* renamed from: q, reason: collision with root package name */
    public int f22855q;

    /* renamed from: s, reason: collision with root package name */
    public Bundle f22857s;

    /* renamed from: t, reason: collision with root package name */
    public IntentSender f22858t;

    /* renamed from: u, reason: collision with root package name */
    public C1980n f22859u;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f22849k = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public int f22856r = -1;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f22860v = new ArrayList();

    public C(C1966B c1966b, String str, String str2, boolean z9) {
        this.f22840a = c1966b;
        this.f22841b = str;
        this.f22842c = str2;
        this.f22847h = z9;
    }

    public static r b() {
        D.b();
        AbstractC1984s abstractC1984s = D.c().f22967e;
        if (abstractC1984s instanceof r) {
            return (r) abstractC1984s;
        }
        return null;
    }

    public final C1991z a() {
        if (this instanceof C1991z) {
            return (C1991z) this;
        }
        return null;
    }

    public final AbstractC1986u c() {
        C1966B c1966b = this.f22840a;
        c1966b.getClass();
        D.b();
        return c1966b.f22835a;
    }

    public final boolean d() {
        D.b();
        C c3 = D.c().f22983v;
        if (c3 != null) {
            if (c3 != this && this.f22852n != 3) {
                if (TextUtils.equals(((ComponentName) c().f23036b.f17433b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
                    return true;
                }
                return false;
            }
            return true;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    public final boolean e() {
        return !this.f22860v.isEmpty();
    }

    public final boolean f() {
        if (this.f22859u != null && this.f22846g) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        D.b();
        if (D.c().g() == this) {
            return true;
        }
        return false;
    }

    public final boolean h(C1988w c1988w) {
        if (c1988w != null) {
            D.b();
            ArrayList arrayList = this.f22849k;
            if (arrayList != null) {
                c1988w.a();
                if (!c1988w.f23048b.isEmpty()) {
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            Iterator it = c1988w.f23048b.iterator();
                            while (it.hasNext()) {
                                if (intentFilter.hasCategory((String) it.next())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0102, code lost:
    
        if (r7.hasNext() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(t0.C1980n r18) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.C.i(t0.n):int");
    }

    public final void j(int i9) {
        D.b();
        C1971e c3 = D.c();
        int min = Math.min(this.f22855q, Math.max(0, i9));
        AbstractC1984s f9 = c3.f(this);
        if (f9 != null) {
            f9.f(min);
        }
    }

    public final void k(int i9) {
        AbstractC1984s f9;
        D.b();
        if (i9 != 0 && (f9 = D.c().f(this)) != null) {
            f9.i(i9);
        }
    }

    public final void l(boolean z9) {
        D.b();
        D.c().j(this, 3, z9);
    }

    public final boolean m(String str) {
        D.b();
        ArrayList arrayList = this.f22849k;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.f22842c);
        sb.append(", name=");
        sb.append(this.f22843d);
        sb.append(", description=");
        sb.append(this.f22844e);
        sb.append(", iconUri=");
        sb.append(this.f22845f);
        sb.append(", enabled=");
        sb.append(this.f22846g);
        sb.append(", isSystemRoute=");
        sb.append(this.f22847h);
        sb.append(", connectionState=");
        sb.append(this.f22848i);
        sb.append(", canDisconnect=");
        sb.append(this.j);
        sb.append(", playbackType=");
        sb.append(this.f22850l);
        sb.append(", playbackStream=");
        sb.append(this.f22851m);
        sb.append(", deviceType=");
        sb.append(this.f22852n);
        sb.append(", volumeHandling=");
        sb.append(this.f22853o);
        sb.append(", volume=");
        sb.append(this.f22854p);
        sb.append(", volumeMax=");
        sb.append(this.f22855q);
        sb.append(", presentationDisplayId=");
        sb.append(this.f22856r);
        sb.append(", extras=");
        sb.append(this.f22857s);
        sb.append(", settingsIntent=");
        sb.append(this.f22858t);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.f22840a.f22838d.f17433b).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.f22860v.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (i9 > 0) {
                    sb.append(", ");
                }
                if (this.f22860v.get(i9) != this) {
                    sb.append(((C) this.f22860v.get(i9)).f22842c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
