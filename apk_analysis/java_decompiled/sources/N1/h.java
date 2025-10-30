package N1;

import A3.E;
import F0.Y;
import J1.A;
import J1.AbstractC0177g0;
import J1.L;
import N3.C0270v;
import P1.C0332h;
import P1.G;
import P5.D;
import Q2.InterfaceC0358a;
import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Log;
import android.util.SparseArray;
import b3.EnumC0602c;
import b7.C0699a;
import c7.C0788h;
import co.notix.R;
import com.anilab.android.ui.categoryDetail.MovieListFragment;
import com.anilab.android.ui.comment.CommentListFragment;
import com.anilab.android.ui.filterResult.FilterResultFragment;
import com.anilab.android.ui.myList.MyListFragment;
import com.google.firebase.FirebaseCommonRegistrar;
import e2.C1136B;
import f3.C1162a;
import f5.AbstractC1176h;
import f5.C1185q;
import f5.InterfaceC1169a;
import f5.InterfaceC1171c;
import f5.InterfaceC1175g;
import g3.InterfaceC1251b;
import i0.AbstractC1336M;
import i0.Z;
import j3.AbstractC1455g;
import j3.C1441D;
import j3.C1462m;
import j3.E0;
import j3.F0;
import j3.G0;
import j3.M;
import j3.j0;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k3.AbstractC1492h;
import k3.AbstractC1493i;
import k3.C1485a;
import k3.C1489e;
import k3.C1490f;
import k3.C1491g;
import k3.C1494j;
import k4.AbstractC1497C;
import k4.C1496B;
import k4.C1498D;
import k4.C1524y;
import k4.X;
import n3.C1623C;
import n3.C1626c;
import n3.C1630g;
import n3.C1631h;
import s.C1935e;
import s6.C1962b;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements V0.i, s6.d, InterfaceC1171c, InterfaceC1169a, InterfaceC1175g, InterfaceC1251b, f3.f, InterfaceC0358a, L.b, i4.l, l4.j, l4.i, S6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4850b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4851c;

    public /* synthetic */ h(Object obj, int i9, Object obj2) {
        this.f4849a = i9;
        this.f4850b = obj;
        this.f4851c = obj2;
    }

    private final Object d(AbstractC1176h abstractC1176h) {
        com.google.firebase.messaging.j jVar = (com.google.firebase.messaging.j) this.f4850b;
        String str = (String) this.f4851c;
        synchronized (jVar) {
            ((C1935e) jVar.f16480b).remove(str);
        }
        return abstractC1176h;
    }

    private final Object j(AbstractC1176h abstractC1176h) {
        d7.i iVar = (d7.i) this.f4850b;
        Date date = (Date) this.f4851c;
        iVar.getClass();
        if (abstractC1176h.j()) {
            d7.m mVar = iVar.f16922g;
            synchronized (mVar.f16952b) {
                mVar.f16951a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
            }
            return abstractC1176h;
        }
        Exception f9 = abstractC1176h.f();
        if (f9 == null) {
            return abstractC1176h;
        }
        if (f9 instanceof C0788h) {
            iVar.f16922g.h();
            return abstractC1176h;
        }
        iVar.f16922g.g();
        return abstractC1176h;
    }

    @Override // f5.InterfaceC1171c
    public void G(AbstractC1176h abstractC1176h) {
        ((com.google.firebase.messaging.h) this.f4850b).a((Intent) this.f4851c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l4.j
    public void a(Object obj, l4.f fVar) {
        boolean z9;
        int i9;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        Y y9;
        int i16;
        int i17;
        int i18;
        int i19;
        PlaybackErrorEvent.Builder timeSinceCreatedMillis;
        PlaybackErrorEvent.Builder errorCode;
        PlaybackErrorEvent.Builder subErrorCode;
        PlaybackErrorEvent.Builder exception;
        PlaybackErrorEvent build;
        int i20;
        int i21;
        E e8;
        int i22;
        int i23;
        int i24;
        PlaybackStateEvent.Builder state;
        PlaybackStateEvent.Builder timeSinceCreatedMillis2;
        PlaybackStateEvent build2;
        NetworkEvent.Builder networkType;
        NetworkEvent.Builder timeSinceCreatedMillis3;
        NetworkEvent build3;
        int i25;
        int i26;
        int i27;
        M m9;
        int i28;
        int i29;
        int i30;
        C1630g c1630g;
        int i31;
        C1489e c1489e = (C1489e) this.f4850b;
        C1441D c1441d = (C1441D) this.f4851c;
        C1494j c1494j = (C1494j) obj;
        SparseArray sparseArray = c1489e.f19932e;
        SparseArray sparseArray2 = new SparseArray(fVar.f20498a.size());
        for (int i32 = 0; i32 < fVar.f20498a.size(); i32++) {
            int a5 = fVar.a(i32);
            C1485a c1485a = (C1485a) sparseArray.get(a5);
            c1485a.getClass();
            sparseArray2.append(a5, c1485a);
        }
        c1494j.getClass();
        if (fVar.f20498a.size() != 0) {
            for (int i33 = 0; i33 < fVar.f20498a.size(); i33++) {
                int a9 = fVar.a(i33);
                C1485a c1485a2 = (C1485a) sparseArray2.get(a9);
                c1485a2.getClass();
                if (a9 == 0) {
                    C1491g c1491g = c1494j.f19954b;
                    synchronized (c1491g) {
                        try {
                            c1491g.f19949d.getClass();
                            E0 e02 = c1491g.f19950e;
                            c1491g.f19950e = c1485a2.f19915b;
                            Iterator it = c1491g.f19948c.values().iterator();
                            while (it.hasNext()) {
                                C1490f c1490f = (C1490f) it.next();
                                if (c1490f.b(e02, c1491g.f19950e) && !c1490f.a(c1485a2)) {
                                }
                                it.remove();
                                if (c1490f.f19941e) {
                                    if (c1490f.f19937a.equals(c1491g.f19951f)) {
                                        c1491g.f19951f = null;
                                    }
                                    c1491g.f19949d.d(c1485a2, c1490f.f19937a);
                                }
                            }
                            c1491g.d(c1485a2);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else if (a9 == 11) {
                    c1494j.f19954b.f(c1485a2, c1494j.f19962k);
                } else {
                    c1494j.f19954b.e(c1485a2);
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (fVar.f20498a.get(0)) {
                C1485a c1485a3 = (C1485a) sparseArray2.get(0);
                c1485a3.getClass();
                if (c1494j.j != null) {
                    c1494j.c(c1485a3.f19915b, c1485a3.f19917d);
                }
            }
            if (fVar.f20498a.get(2) && c1494j.j != null) {
                D listIterator = c1441d.q().f19338a.listIterator(0);
                loop3: while (true) {
                    if (listIterator.hasNext()) {
                        F0 f02 = (F0) listIterator.next();
                        for (int i34 = 0; i34 < f02.f19325a; i34++) {
                            if (f02.f19329e[i34] && (c1630g = f02.f19326b.f5167d[i34].f19438o) != null) {
                                break loop3;
                            }
                        }
                    } else {
                        c1630g = null;
                        break;
                    }
                }
                if (c1630g != null) {
                    PlaybackMetrics.Builder builder = c1494j.j;
                    int i35 = l4.y.f20553a;
                    PlaybackMetrics.Builder e9 = AbstractC1493i.e(builder);
                    int i36 = 0;
                    while (true) {
                        if (i36 < c1630g.f21123d) {
                            UUID uuid = c1630g.f21120a[i36].f21116b;
                            if (uuid.equals(AbstractC1455g.f19619d)) {
                                i31 = 3;
                                break;
                            } else if (uuid.equals(AbstractC1455g.f19620e)) {
                                i31 = 2;
                                break;
                            } else {
                                if (uuid.equals(AbstractC1455g.f19618c)) {
                                    i31 = 6;
                                    break;
                                }
                                i36++;
                            }
                        } else {
                            i31 = 1;
                            break;
                        }
                    }
                    e9.setDrmType(i31);
                }
            }
            if (fVar.f20498a.get(1011)) {
                c1494j.f19977z++;
            }
            C1462m c1462m = c1494j.f19965n;
            int i37 = 5;
            if (c1462m == null) {
                i20 = 1;
                i12 = 4;
                i15 = 13;
                i10 = 8;
                i11 = 7;
                i13 = 6;
                i14 = 9;
            } else {
                if (c1494j.f19973v == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                int i38 = c1462m.f19684a;
                if (i38 == 1001) {
                    y9 = new Y(20, 0);
                } else {
                    if (c1462m instanceof C1462m) {
                        if (c1462m.f19686c == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        i9 = c1462m.f19690g;
                    } else {
                        i9 = 0;
                        z10 = false;
                    }
                    Throwable cause = c1462m.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        if (cause instanceof C1498D) {
                            y9 = new Y(5, ((C1498D) cause).f19982d);
                        } else {
                            if ((cause instanceof AbstractC1497C) || (cause instanceof j0)) {
                                i16 = 9;
                                i17 = 6;
                                i11 = 7;
                                if (z9) {
                                    i18 = 10;
                                } else {
                                    i18 = 11;
                                }
                                y9 = new Y(i18, 0);
                                i12 = 4;
                                i10 = 8;
                            } else {
                                boolean z11 = cause instanceof C1496B;
                                if (z11 || (cause instanceof X)) {
                                    i16 = 9;
                                    if (l4.s.d(c1494j.f19953a).e() == 1) {
                                        y9 = new Y(3, 0);
                                    } else {
                                        Throwable cause2 = cause.getCause();
                                        if (cause2 instanceof UnknownHostException) {
                                            y9 = new Y(6, 0);
                                            i14 = 9;
                                            i13 = 6;
                                            i15 = 13;
                                            i10 = 8;
                                            i11 = 7;
                                        } else {
                                            i17 = 6;
                                            if (cause2 instanceof SocketTimeoutException) {
                                                y9 = new Y(7, 0);
                                                i11 = 7;
                                                i14 = 9;
                                                i13 = 6;
                                                i15 = 13;
                                                i10 = 8;
                                            } else if (z11 && ((C1496B) cause).f19981c == 1) {
                                                y9 = new Y(4, 0);
                                                i12 = 4;
                                                i11 = 7;
                                                i14 = 9;
                                                i13 = 6;
                                                i15 = 13;
                                                i10 = 8;
                                                PlaybackSession playbackSession = c1494j.f19955c;
                                                timeSinceCreatedMillis = AbstractC1492h.f().setTimeSinceCreatedMillis(elapsedRealtime - c1494j.f19956d);
                                                errorCode = timeSinceCreatedMillis.setErrorCode(y9.f2058a);
                                                subErrorCode = errorCode.setSubErrorCode(y9.f2059b);
                                                exception = subErrorCode.setException(c1462m);
                                                build = exception.build();
                                                playbackSession.reportPlaybackErrorEvent(build);
                                                i20 = 1;
                                                c1494j.f19952A = true;
                                                c1494j.f19965n = null;
                                            } else {
                                                y9 = new Y(8, 0);
                                                i12 = 4;
                                                i10 = 8;
                                                i11 = 7;
                                            }
                                        }
                                        i12 = 4;
                                        PlaybackSession playbackSession2 = c1494j.f19955c;
                                        timeSinceCreatedMillis = AbstractC1492h.f().setTimeSinceCreatedMillis(elapsedRealtime - c1494j.f19956d);
                                        errorCode = timeSinceCreatedMillis.setErrorCode(y9.f2058a);
                                        subErrorCode = errorCode.setSubErrorCode(y9.f2059b);
                                        exception = subErrorCode.setException(c1462m);
                                        build = exception.build();
                                        playbackSession2.reportPlaybackErrorEvent(build);
                                        i20 = 1;
                                        c1494j.f19952A = true;
                                        c1494j.f19965n = null;
                                    }
                                } else if (i38 == 1002) {
                                    y9 = new Y(21, 0);
                                } else if (cause instanceof C1631h) {
                                    Throwable cause3 = cause.getCause();
                                    cause3.getClass();
                                    int i39 = l4.y.f20553a;
                                    if (i39 >= 21 && (cause3 instanceof MediaDrm.MediaDrmStateException)) {
                                        int t7 = l4.y.t(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                        switch (l4.y.s(t7)) {
                                            case 6002:
                                                i19 = 24;
                                                break;
                                            case 6003:
                                                i19 = 28;
                                                break;
                                            case 6004:
                                                i19 = 25;
                                                break;
                                            case 6005:
                                                i19 = 26;
                                                break;
                                            default:
                                                i19 = 27;
                                                break;
                                        }
                                        y9 = new Y(i19, t7);
                                    } else if (i39 >= 23 && (cause3 instanceof MediaDrmResetException)) {
                                        y9 = new Y(27, 0);
                                    } else if (i39 >= 18 && (cause3 instanceof NotProvisionedException)) {
                                        y9 = new Y(24, 0);
                                    } else if (i39 >= 18 && (cause3 instanceof DeniedByServerException)) {
                                        y9 = new Y(29, 0);
                                    } else if (cause3 instanceof C1623C) {
                                        y9 = new Y(23, 0);
                                    } else if (cause3 instanceof C1626c) {
                                        y9 = new Y(28, 0);
                                    } else {
                                        y9 = new Y(30, 0);
                                    }
                                } else if ((cause instanceof C1524y) && (cause.getCause() instanceof FileNotFoundException)) {
                                    Throwable cause4 = cause.getCause();
                                    cause4.getClass();
                                    Throwable cause5 = cause4.getCause();
                                    if (l4.y.f20553a >= 21 && (cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) {
                                        y9 = new Y(32, 0);
                                    } else {
                                        y9 = new Y(31, 0);
                                    }
                                } else {
                                    i16 = 9;
                                    y9 = new Y(9, 0);
                                }
                                i14 = i16;
                                i15 = 13;
                                i10 = 8;
                                i11 = 7;
                                i12 = 4;
                                i13 = 6;
                                PlaybackSession playbackSession22 = c1494j.f19955c;
                                timeSinceCreatedMillis = AbstractC1492h.f().setTimeSinceCreatedMillis(elapsedRealtime - c1494j.f19956d);
                                errorCode = timeSinceCreatedMillis.setErrorCode(y9.f2058a);
                                subErrorCode = errorCode.setSubErrorCode(y9.f2059b);
                                exception = subErrorCode.setException(c1462m);
                                build = exception.build();
                                playbackSession22.reportPlaybackErrorEvent(build);
                                i20 = 1;
                                c1494j.f19952A = true;
                                c1494j.f19965n = null;
                            }
                            i14 = i16;
                            i13 = i17;
                            i15 = 13;
                            PlaybackSession playbackSession222 = c1494j.f19955c;
                            timeSinceCreatedMillis = AbstractC1492h.f().setTimeSinceCreatedMillis(elapsedRealtime - c1494j.f19956d);
                            errorCode = timeSinceCreatedMillis.setErrorCode(y9.f2058a);
                            subErrorCode = errorCode.setSubErrorCode(y9.f2059b);
                            exception = subErrorCode.setException(c1462m);
                            build = exception.build();
                            playbackSession222.reportPlaybackErrorEvent(build);
                            i20 = 1;
                            c1494j.f19952A = true;
                            c1494j.f19965n = null;
                        }
                    } else {
                        int i40 = 27;
                        i10 = 8;
                        i11 = 7;
                        i12 = 4;
                        i13 = 6;
                        i14 = 9;
                        if (z10 && (i9 == 0 || i9 == 1)) {
                            y9 = new Y(35, 0);
                        } else if (z10 && i9 == 3) {
                            y9 = new Y(15, 0);
                        } else if (z10 && i9 == 2) {
                            y9 = new Y(23, 0);
                        } else {
                            if (cause instanceof C3.s) {
                                i15 = 13;
                                y9 = new Y(13, l4.y.t(((C3.s) cause).f1490d));
                            } else {
                                i15 = 13;
                                if (cause instanceof C3.n) {
                                    y9 = new Y(14, l4.y.t(((C3.n) cause).f1478a));
                                } else if (cause instanceof OutOfMemoryError) {
                                    y9 = new Y(14, 0);
                                } else if (cause instanceof l3.o) {
                                    y9 = new Y(17, ((l3.o) cause).f20416a);
                                } else if (cause instanceof l3.p) {
                                    y9 = new Y(18, ((l3.p) cause).f20419a);
                                } else if (l4.y.f20553a >= 16 && (cause instanceof MediaCodec.CryptoException)) {
                                    int errorCode2 = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    switch (l4.y.s(errorCode2)) {
                                        case 6002:
                                            i40 = 24;
                                            break;
                                        case 6003:
                                            i40 = 28;
                                            break;
                                        case 6004:
                                            i40 = 25;
                                            break;
                                        case 6005:
                                            i40 = 26;
                                            break;
                                    }
                                    y9 = new Y(i40, errorCode2);
                                } else {
                                    y9 = new Y(22, 0);
                                }
                            }
                            PlaybackSession playbackSession2222 = c1494j.f19955c;
                            timeSinceCreatedMillis = AbstractC1492h.f().setTimeSinceCreatedMillis(elapsedRealtime - c1494j.f19956d);
                            errorCode = timeSinceCreatedMillis.setErrorCode(y9.f2058a);
                            subErrorCode = errorCode.setSubErrorCode(y9.f2059b);
                            exception = subErrorCode.setException(c1462m);
                            build = exception.build();
                            playbackSession2222.reportPlaybackErrorEvent(build);
                            i20 = 1;
                            c1494j.f19952A = true;
                            c1494j.f19965n = null;
                        }
                        i15 = 13;
                        PlaybackSession playbackSession22222 = c1494j.f19955c;
                        timeSinceCreatedMillis = AbstractC1492h.f().setTimeSinceCreatedMillis(elapsedRealtime - c1494j.f19956d);
                        errorCode = timeSinceCreatedMillis.setErrorCode(y9.f2058a);
                        subErrorCode = errorCode.setSubErrorCode(y9.f2059b);
                        exception = subErrorCode.setException(c1462m);
                        build = exception.build();
                        playbackSession22222.reportPlaybackErrorEvent(build);
                        i20 = 1;
                        c1494j.f19952A = true;
                        c1494j.f19965n = null;
                    }
                }
                i15 = 13;
                i10 = 8;
                i11 = 7;
                i12 = 4;
                i13 = 6;
                i14 = 9;
                PlaybackSession playbackSession222222 = c1494j.f19955c;
                timeSinceCreatedMillis = AbstractC1492h.f().setTimeSinceCreatedMillis(elapsedRealtime - c1494j.f19956d);
                errorCode = timeSinceCreatedMillis.setErrorCode(y9.f2058a);
                subErrorCode = errorCode.setSubErrorCode(y9.f2059b);
                exception = subErrorCode.setException(c1462m);
                build = exception.build();
                playbackSession222222.reportPlaybackErrorEvent(build);
                i20 = 1;
                c1494j.f19952A = true;
                c1494j.f19965n = null;
            }
            if (fVar.f20498a.get(2)) {
                G0 q9 = c1441d.q();
                boolean a10 = q9.a(2);
                boolean a11 = q9.a(i20);
                boolean a12 = q9.a(3);
                if (!a10 && !a11 && !a12) {
                    i22 = 3;
                    i21 = i12;
                    e8 = 0;
                } else {
                    if (!a10) {
                        if (l4.y.a(c1494j.f19969r, null)) {
                            i22 = 3;
                            i21 = i12;
                            m9 = null;
                        } else {
                            if (c1494j.f19969r == null) {
                                i30 = 1;
                            } else {
                                i30 = 0;
                            }
                            c1494j.f19969r = null;
                            i22 = 3;
                            m9 = null;
                            i21 = i12;
                            c1494j.e(1, elapsedRealtime, null, i30);
                        }
                    } else {
                        i22 = 3;
                        i21 = i12;
                        m9 = null;
                    }
                    if (!a11 && !l4.y.a(c1494j.f19970s, m9)) {
                        if (c1494j.f19970s == null) {
                            i29 = 1;
                        } else {
                            i29 = 0;
                        }
                        c1494j.f19970s = m9;
                        c1494j.e(0, elapsedRealtime, m9, i29);
                    }
                    if (!a12 && !l4.y.a(c1494j.f19971t, m9)) {
                        if (c1494j.f19971t == null) {
                            i28 = 1;
                        } else {
                            i28 = 0;
                        }
                        c1494j.f19971t = m9;
                        c1494j.e(2, elapsedRealtime, m9, i28);
                    }
                    e8 = m9;
                }
            } else {
                i21 = i12;
                e8 = 0;
                i22 = 3;
            }
            if (c1494j.a(c1494j.f19966o)) {
                E e10 = c1494j.f19966o;
                M m10 = (M) e10.f47c;
                if (m10.f19441r != -1) {
                    int i41 = e10.f46b;
                    if (!l4.y.a(c1494j.f19969r, m10)) {
                        if (c1494j.f19969r == null && i41 == 0) {
                            i27 = 1;
                        } else {
                            i27 = i41;
                        }
                        c1494j.f19969r = m10;
                        c1494j.e(1, elapsedRealtime, m10, i27);
                    }
                    c1494j.f19966o = e8;
                }
            }
            if (c1494j.a(c1494j.f19967p)) {
                E e11 = c1494j.f19967p;
                M m11 = (M) e11.f47c;
                int i42 = e11.f46b;
                if (!l4.y.a(c1494j.f19970s, m11)) {
                    if (c1494j.f19970s == null && i42 == 0) {
                        i26 = 1;
                    } else {
                        i26 = i42;
                    }
                    c1494j.f19970s = m11;
                    c1494j.e(0, elapsedRealtime, m11, i26);
                }
                c1494j.f19967p = e8;
            }
            if (c1494j.a(c1494j.f19968q)) {
                E e12 = c1494j.f19968q;
                M m12 = (M) e12.f47c;
                int i43 = e12.f46b;
                if (!l4.y.a(c1494j.f19971t, m12)) {
                    if (c1494j.f19971t == null && i43 == 0) {
                        i25 = 1;
                    } else {
                        i25 = i43;
                    }
                    c1494j.f19971t = m12;
                    c1494j.e(2, elapsedRealtime, m12, i25);
                }
                c1494j.f19968q = e8;
            }
            switch (l4.s.d(c1494j.f19953a).e()) {
                case 0:
                    i23 = 0;
                    break;
                case 1:
                    i23 = i14;
                    break;
                case 2:
                    i23 = 2;
                    break;
                case 3:
                    i23 = i21;
                    break;
                case 4:
                    i23 = 5;
                    break;
                case 5:
                    i23 = i13;
                    break;
                case 6:
                case 8:
                default:
                    i23 = 1;
                    break;
                case 7:
                    i23 = i22;
                    break;
                case 9:
                    i23 = i10;
                    break;
                case R.styleable.GradientColor_android_endX /* 10 */:
                    i23 = i11;
                    break;
            }
            if (i23 != c1494j.f19964m) {
                c1494j.f19964m = i23;
                PlaybackSession playbackSession3 = c1494j.f19955c;
                networkType = AbstractC1492h.b().setNetworkType(i23);
                timeSinceCreatedMillis3 = networkType.setTimeSinceCreatedMillis(elapsedRealtime - c1494j.f19956d);
                build3 = timeSinceCreatedMillis3.build();
                playbackSession3.reportNetworkEvent(build3);
            }
            if (c1441d.e() != 2) {
                c1494j.f19972u = false;
            }
            if (c1441d.d() == null) {
                c1494j.f19974w = false;
                i24 = 10;
            } else {
                i24 = 10;
                if (fVar.f20498a.get(10)) {
                    c1494j.f19974w = true;
                }
            }
            int e13 = c1441d.e();
            if (!c1494j.f19972u) {
                if (c1494j.f19974w) {
                    i37 = i15;
                } else if (e13 == i21) {
                    i37 = 11;
                } else if (e13 == 2) {
                    int i44 = c1494j.f19963l;
                    if (i44 != 0 && i44 != 2) {
                        if (!c1441d.m()) {
                            i37 = i11;
                        } else if (c1441d.F() != 0) {
                            i37 = i24;
                        } else {
                            i37 = i13;
                        }
                    } else {
                        i37 = 2;
                    }
                } else if (e13 == i22) {
                    if (!c1441d.m()) {
                        i37 = i21;
                    } else if (c1441d.F() != 0) {
                        i37 = i14;
                    } else {
                        i37 = i22;
                    }
                } else if (e13 == 1 && c1494j.f19963l != 0) {
                    i37 = 12;
                } else {
                    i37 = c1494j.f19963l;
                }
            }
            if (c1494j.f19963l != i37) {
                c1494j.f19963l = i37;
                c1494j.f19952A = true;
                PlaybackSession playbackSession4 = c1494j.f19955c;
                state = AbstractC1492h.i().setState(c1494j.f19963l);
                timeSinceCreatedMillis2 = state.setTimeSinceCreatedMillis(elapsedRealtime - c1494j.f19956d);
                build2 = timeSinceCreatedMillis2.build();
                playbackSession4.reportPlaybackStateEvent(build2);
            }
            if (fVar.f20498a.get(1028)) {
                C1491g c1491g2 = c1494j.f19954b;
                C1485a c1485a4 = (C1485a) sparseArray2.get(1028);
                c1485a4.getClass();
                c1491g2.a(c1485a4);
            }
        }
    }

    @Override // f3.f
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        f3.h hVar = (f3.h) this.f4850b;
        C1162a c1162a = hVar.f17348d;
        int i9 = c1162a.f17333b;
        Y2.j jVar = (Y2.j) this.f4851c;
        ArrayList s9 = hVar.s(sQLiteDatabase, jVar, i9);
        for (V2.d dVar : V2.d.values()) {
            if (dVar != jVar.f8631c) {
                int size = c1162a.f17333b - s9.size();
                if (size <= 0) {
                    break;
                }
                s9.addAll(hVar.s(sQLiteDatabase, jVar.b(dVar), size));
            }
        }
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < s9.size(); i10++) {
            sb.append(((f3.b) s9.get(i10)).f17337a);
            if (i10 < s9.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor query = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (query.moveToNext()) {
            try {
                long j = query.getLong(0);
                Set set = (Set) hashMap.get(Long.valueOf(j));
                if (set == null) {
                    set = new HashSet();
                    hashMap.put(Long.valueOf(j), set);
                }
                set.add(new f3.g(query.getString(1), query.getString(2)));
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        }
        query.close();
        ListIterator listIterator = s9.listIterator();
        while (listIterator.hasNext()) {
            f3.b bVar = (f3.b) listIterator.next();
            if (hashMap.containsKey(Long.valueOf(bVar.f17337a))) {
                Y2.h c3 = bVar.f17339c.c();
                long j4 = bVar.f17337a;
                for (f3.g gVar : (Set) hashMap.get(Long.valueOf(j4))) {
                    c3.a(gVar.f17342a, gVar.f17343b);
                }
                listIterator.set(new f3.b(j4, bVar.f17338b, c3.b()));
            }
        }
        return s9;
    }

    @Override // V0.i
    public void b() {
        switch (this.f4849a) {
            case 0:
                ((A) this.f4850b).f3601A.setRefreshing(false);
                MovieListFragment movieListFragment = (MovieListFragment) this.f4851c;
                ((j) movieListFragment.f13739G0.getValue()).d();
                movieListFragment.h0().g(movieListFragment.s0().f4874a, 1, true);
                return;
            case 1:
                ((J1.E) this.f4850b).f3650F.setRefreshing(false);
                CommentListFragment commentListFragment = (CommentListFragment) this.f4851c;
                ((C0332h) commentListFragment.f13743F0.getValue()).d();
                G h02 = commentListFragment.h0();
                h02.getClass();
                h02.d(true, new P1.A(h02, 1, null));
                return;
            case 2:
                ((L) this.f4850b).f3709A.setRefreshing(false);
                FilterResultFragment filterResultFragment = (FilterResultFragment) this.f4851c;
                ((V1.d) filterResultFragment.f13769G0.getValue()).d();
                filterResultFragment.h0().g(1, filterResultFragment.s0().f7633b, filterResultFragment.s0().f7632a, filterResultFragment.s0().f7634c, B7.j.o0(filterResultFragment.s0().f7635d));
                return;
            default:
                ((AbstractC0177g0) this.f4850b).f3938A.setRefreshing(false);
                MyListFragment myListFragment = (MyListFragment) this.f4851c;
                myListFragment.s0().d();
                C1136B h03 = myListFragment.h0();
                h03.getClass();
                h03.d(true, new e2.y(h03, 1, null));
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    @Override // i4.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public P5.S c(int r18, N3.m0 r19, int[] r20) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.h.c(int, N3.m0, int[]):P5.S");
    }

    @Override // s6.d
    public Object e(Y2.r rVar) {
        String str;
        int i9;
        switch (this.f4849a) {
            case 3:
                Context context = (Context) rVar.b(Context.class);
                switch (((k8.a) this.f4851c).f20138a) {
                    case 1:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            str = String.valueOf(applicationInfo.targetSdkVersion);
                            break;
                        } else {
                            str = "";
                            break;
                        }
                    case 2:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                            i9 = applicationInfo2.minSdkVersion;
                            str = String.valueOf(i9);
                            break;
                        } else {
                            str = "";
                            break;
                        }
                        break;
                    case 3:
                        int i10 = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            str = "tv";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            str = "watch";
                            break;
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            str = "auto";
                            break;
                        } else if (i10 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            str = "embedded";
                            break;
                        } else {
                            str = "";
                            break;
                        }
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        if (installerPackageName != null) {
                            str = FirebaseCommonRegistrar.a(installerPackageName);
                            break;
                        } else {
                            str = "";
                            break;
                        }
                }
                return new C0699a((String) this.f4850b, str);
            default:
                String str2 = (String) this.f4850b;
                C1962b c1962b = (C1962b) this.f4851c;
                try {
                    Trace.beginSection(str2);
                    return c1962b.f22752f.e(rVar);
                } finally {
                    Trace.endSection();
                }
        }
    }

    @Override // g3.InterfaceC1251b
    public Object f() {
        switch (this.f4849a) {
            case 12:
                f3.h hVar = (f3.h) ((e3.j) this.f4850b).f17173c;
                hVar.getClass();
                Iterable iterable = (Iterable) this.f4851c;
                if (iterable.iterator().hasNext()) {
                    hVar.a().compileStatement("DELETE FROM events WHERE _id in " + f3.h.I(iterable)).execute();
                    return null;
                }
                return null;
            default:
                e3.j jVar = (e3.j) this.f4850b;
                jVar.getClass();
                Iterator it = ((HashMap) this.f4851c).entrySet().iterator();
                while (it.hasNext()) {
                    ((f3.h) jVar.f17179i).x(((Integer) r2.getValue()).intValue(), EnumC0602c.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                }
                return null;
        }
    }

    @Override // L.b
    public void g() {
        Z operation = (Z) this.f4851c;
        kotlin.jvm.internal.h.e(operation, "$operation");
        ((Animator) this.f4850b).end();
        if (AbstractC1336M.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + operation + " has been canceled.");
        }
    }

    @Override // S6.a
    public void h(S6.b bVar) {
        ((S6.a) this.f4850b).h(bVar);
        ((S6.a) this.f4851c).h(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5 A[Catch: all -> 0x0055, TryCatch #3 {all -> 0x0055, blocks: (B:34:0x003c, B:38:0x0041, B:39:0x0042, B:43:0x005d, B:45:0x00d1, B:47:0x00d5, B:64:0x00d9), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d9 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:34:0x003c, B:38:0x0041, B:39:0x0042, B:43:0x005d, B:45:0x00d1, B:47:0x00d5, B:64:0x00d9), top: B:4:0x0018 }] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v22, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v3, types: [f5.q] */
    /* JADX WARN: Type inference failed for: r14v40, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r14v44, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v1, types: [d7.k] */
    @Override // f5.InterfaceC1169a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(f5.AbstractC1176h r14) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N1.h.i(f5.h):java.lang.Object");
    }

    @Override // l4.i
    public void invoke(Object obj) {
        C1494j c1494j = (C1494j) obj;
        c1494j.getClass();
        C1485a c1485a = (C1485a) this.f4850b;
        N3.A a5 = c1485a.f19917d;
        if (a5 != null) {
            C0270v c0270v = (C0270v) this.f4851c;
            M m9 = (M) c0270v.f5205f;
            m9.getClass();
            a5.getClass();
            E e8 = new E(m9, c0270v.f5204e, c1494j.f19954b.c(c1485a.f19915b, a5), 12);
            int i9 = c0270v.f5202c;
            if (i9 != 0) {
                if (i9 != 1) {
                    if (i9 != 2) {
                        if (i9 != 3) {
                            return;
                        }
                        c1494j.f19968q = e8;
                        return;
                    }
                } else {
                    c1494j.f19967p = e8;
                    return;
                }
            }
            c1494j.f19966o = e8;
        }
    }

    @Override // f5.InterfaceC1175g
    public C1185q s(Object obj) {
        d7.d dVar = (d7.d) this.f4850b;
        d7.e eVar = (d7.e) this.f4851c;
        synchronized (dVar) {
            dVar.f16895c = s8.n.p(eVar);
        }
        return s8.n.p(eVar);
    }
}
