package i5;

import android.os.Parcelable;
import co.notix.R;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import n3.C1629f;
import n3.C1630g;
import o4.C1698d;
import o4.C1700f;
import p.C1750J;
import p.C1803k;
import p5.C1859a;
import s4.C1954a;
import t4.C2011a;
import t4.C2012b;
import t4.C2013c;
import t4.C2014d;
import t4.h;
import t4.i;
import t4.j;
import t4.k;
import t4.l;
import t4.m;
import t4.n;
import t4.p;
import t4.q;
import t4.r;
import t4.s;
import t4.t;
import t4.u;

/* renamed from: i5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1381b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18667a;

    public /* synthetic */ C1381b(int i9) {
        this.f18667a = i9;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 788
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r37) {
        /*
            Method dump skipped, instructions count: 2810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i5.C1381b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i9) {
        switch (this.f18667a) {
            case 0:
                return new C1382c[i9];
            case 1:
                return new C1630g[i9];
            case 2:
                return new C1629f[i9];
            case 3:
                return new C1698d[i9];
            case 4:
                return new C1700f[i9];
            case 5:
                return new C1803k[i9];
            case 6:
                return new C1750J[i9];
            case 7:
                return new C1859a[i9];
            case 8:
                return new C1954a[i9];
            case 9:
                return new SignInConfiguration[i9];
            case R.styleable.GradientColor_android_endX /* 10 */:
                return new C2011a[i9];
            case R.styleable.GradientColor_android_endY /* 11 */:
                return new h[i9];
            case 12:
                return new t[i9];
            case 13:
                return new u[i9];
            case 14:
                return new C2012b[i9];
            case 15:
                return new i[i9];
            case 16:
                return new MediaError[i9];
            case 17:
                return new MediaInfo[i9];
            case 18:
                return new j[i9];
            case 19:
                return new C2013c[i9];
            case 20:
                return new k[i9];
            case 21:
                return new l[i9];
            case 22:
                return new m[i9];
            case 23:
                return new n[i9];
            case 24:
                return new p[i9];
            case 25:
                return new MediaTrack[i9];
            case 26:
                return new C2014d[i9];
            case 27:
                return new q[i9];
            case 28:
                return new r[i9];
            default:
                return new s[i9];
        }
    }
}
