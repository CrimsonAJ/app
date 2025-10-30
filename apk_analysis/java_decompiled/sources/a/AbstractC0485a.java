package a;

import A3.E;
import A4.r;
import A7.i;
import A7.n;
import B7.k;
import F5.w;
import O7.p;
import P.P;
import P.Q;
import P5.D;
import P5.I;
import P5.Y;
import R3.b;
import R3.j;
import R3.m;
import W7.d;
import W7.e;
import W7.l;
import X7.c;
import Y7.AbstractC0450a;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.datastore.preferences.protobuf.C0521g;
import co.notix.R;
import com.google.android.gms.cast.framework.media.internal.ResourceProvider;
import com.google.android.gms.internal.measurement.D1;
import d8.AbstractC1130a;
import i4.q;
import i8.F;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import k4.C1516p;
import k4.G;
import kotlin.jvm.internal.h;
import l4.AbstractC1566a;
import p.C1749I0;
import q3.u;
import s7.InterfaceC1963a;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0485a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9071a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f9072b = false;

    /* renamed from: c, reason: collision with root package name */
    public static Method f9073c = null;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f9074d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Field f9075e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f9076f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9077g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f9078h = 0;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f9079i = 0;
    public static Thread j;

    public static final void A(Object obj) {
        if (!(obj instanceof i)) {
        } else {
            throw ((i) obj).f549a;
        }
    }

    public static int B(String str) {
        Integer num;
        try {
            Map map = ResourceProvider.f14641a;
            num = (Integer) ResourceProvider.class.getMethod("findResourceByName", String.class).invoke(null, str);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static boolean C(byte b9) {
        if (b9 > -65) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = v(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11) {
        /*
            boolean r0 = b(r8, r9, r10)
            boolean r1 = b(r8, r9, r11)
            if (r1 != 0) goto L75
            if (r0 != 0) goto Le
            goto L75
        Le:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r2 = 33
            r3 = 66
            r4 = 17
            r5 = 1
            if (r8 == r4) goto L3c
            if (r8 == r2) goto L35
            if (r8 == r3) goto L2e
            if (r8 != r1) goto L28
            int r6 = r9.bottom
            int r7 = r11.top
            if (r6 > r7) goto L74
            goto L42
        L28:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L2e:
            int r6 = r9.right
            int r7 = r11.left
            if (r6 > r7) goto L74
            goto L42
        L35:
            int r6 = r9.top
            int r7 = r11.bottom
            if (r6 < r7) goto L74
            goto L42
        L3c:
            int r6 = r9.left
            int r7 = r11.right
            if (r6 < r7) goto L74
        L42:
            if (r8 == r4) goto L74
            if (r8 != r3) goto L47
            goto L74
        L47:
            int r10 = v(r8, r9, r10)
            if (r8 == r4) goto L69
            if (r8 == r2) goto L64
            if (r8 == r3) goto L5f
            if (r8 != r1) goto L59
            int r8 = r11.bottom
            int r9 = r9.bottom
        L57:
            int r8 = r8 - r9
            goto L6e
        L59:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r0)
            throw r8
        L5f:
            int r8 = r11.right
            int r9 = r9.right
            goto L57
        L64:
            int r8 = r9.top
            int r9 = r11.top
            goto L57
        L69:
            int r8 = r9.left
            int r9 = r11.left
            goto L57
        L6e:
            int r8 = java.lang.Math.max(r5, r8)
            if (r10 >= r8) goto L75
        L74:
            return r5
        L75:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0485a.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean b(int i9, Rect rect, Rect rect2) {
        if (i9 != 17) {
            if (i9 != 33) {
                if (i9 != 66) {
                    if (i9 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
            return false;
        }
        if (rect2.bottom >= rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static C1516p c(m mVar, String str, j jVar, int i9) {
        Map map = Collections.EMPTY_MAP;
        Uri M7 = AbstractC1566a.M(str, jVar.f6626c);
        String a5 = mVar.a();
        if (a5 == null) {
            a5 = AbstractC1566a.M(((b) mVar.f6632b.get(0)).f6581a, jVar.f6626c).toString();
        }
        String str2 = a5;
        AbstractC1566a.o(M7, "The uri must be set.");
        return new C1516p(M7, 1, null, map, jVar.f6624a, jVar.f6625b, str2, i9);
    }

    public static void d(Object obj) {
        if (obj != null) {
        } else {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static void e(long j4, r rVar, u[] uVarArr) {
        int i9;
        int i10;
        boolean z9;
        while (true) {
            boolean z10 = true;
            if (rVar.e() > 1) {
                int i11 = 0;
                while (true) {
                    if (rVar.e() == 0) {
                        i9 = -1;
                        break;
                    }
                    int x5 = rVar.x();
                    i11 += x5;
                    if (x5 != 255) {
                        i9 = i11;
                        break;
                    }
                }
                int i12 = 0;
                while (true) {
                    if (rVar.e() == 0) {
                        i12 = -1;
                        break;
                    }
                    int x9 = rVar.x();
                    i12 += x9;
                    if (x9 != 255) {
                        break;
                    }
                }
                int i13 = rVar.f382a + i12;
                if (i12 != -1 && i12 <= rVar.e()) {
                    if (i9 == 4 && i12 >= 8) {
                        int x10 = rVar.x();
                        int C8 = rVar.C();
                        if (C8 == 49) {
                            i10 = rVar.i();
                        } else {
                            i10 = 0;
                        }
                        int x11 = rVar.x();
                        if (C8 == 47) {
                            rVar.I(1);
                        }
                        if (x10 == 181 && ((C8 == 49 || C8 == 47) && x11 == 3)) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (C8 == 49) {
                            if (i10 != 1195456820) {
                                z10 = false;
                            }
                            z9 &= z10;
                        }
                        if (z9) {
                            f(j4, rVar, uVarArr);
                        }
                    }
                } else {
                    AbstractC1566a.P("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    i13 = rVar.f383b;
                }
                rVar.H(i13);
            } else {
                return;
            }
        }
    }

    public static void f(long j4, r rVar, u[] uVarArr) {
        long j9;
        int x5 = rVar.x();
        if ((x5 & 64) != 0) {
            rVar.I(1);
            int i9 = (x5 & 31) * 3;
            int i10 = rVar.f382a;
            int length = uVarArr.length;
            int i11 = 0;
            while (i11 < length) {
                u uVar = uVarArr[i11];
                rVar.H(i10);
                uVar.c(i9, rVar);
                if (j4 != -9223372036854775807L) {
                    j9 = j4;
                    uVar.d(j9, 1, i9, 0, null);
                } else {
                    j9 = j4;
                }
                i11++;
                j4 = j9;
            }
        }
    }

    public static final long g(long j4, c sourceUnit, c targetUnit) {
        h.e(sourceUnit, "sourceUnit");
        h.e(targetUnit, "targetUnit");
        return targetUnit.f8484a.convert(j4, sourceUnit.f8484a);
    }

    public static final i h(Throwable exception) {
        h.e(exception, "exception");
        return new i(exception);
    }

    public static G i(q qVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = qVar.length();
        int i9 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            if (qVar.h(elapsedRealtime, i10)) {
                i9++;
            }
        }
        return new G(1, 0, length, i9);
    }

    public static final boolean j(String current, String str) {
        h.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i9 < current.length()) {
                    char charAt = current.charAt(i9);
                    int i12 = i11 + 1;
                    if (i11 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i10 - 1 == 0 && i11 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i10++;
                    }
                    i9++;
                    i11 = i12;
                } else if (i10 == 0) {
                    String substring = current.substring(1, current.length() - 1);
                    h.d(substring, "substring(...)");
                    return h.a(d.j0(substring).toString(), str);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [P.P, java.lang.Object] */
    public static boolean k(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = Q.f5546a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = P.f5542d;
            P p9 = (P) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            P p10 = p9;
            if (p9 == null) {
                ?? obj = new Object();
                obj.f5543a = null;
                obj.f5544b = null;
                obj.f5545c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, obj);
                p10 = obj;
            }
            WeakReference weakReference2 = p10.f5545c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                p10.f5545c = new WeakReference(keyEvent);
                if (p10.f5544b == null) {
                    p10.f5544b = new SparseArray();
                }
                SparseArray sparseArray = p10.f5544b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    throw new ClassCastException();
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean l(P.InterfaceC0309j r7, android.view.View r8, android.view.Window.Callback r9, android.view.KeyEvent r10) {
        /*
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L6
            goto Le4
        L6:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r2 < r3) goto L11
            boolean r7 = r7.h(r10)
            return r7
        L11:
            boolean r2 = r9 instanceof android.app.Activity
            r3 = 0
            if (r2 == 0) goto L82
            android.app.Activity r9 = (android.app.Activity) r9
            r9.onUserInteraction()
            android.view.Window r7 = r9.getWindow()
            r8 = 8
            boolean r8 = r7.hasFeature(r8)
            if (r8 == 0) goto L65
            android.app.ActionBar r8 = r9.getActionBar()
            int r2 = r10.getKeyCode()
            r4 = 82
            if (r2 != r4) goto L65
            if (r8 == 0) goto L65
            boolean r2 = a.AbstractC0485a.f9072b
            if (r2 != 0) goto L4d
            java.lang.Class r2 = r8.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.Class<android.view.KeyEvent> r6 = android.view.KeyEvent.class
            r5[r1] = r6     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r2 = r2.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            a.AbstractC0485a.f9073c = r2     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            a.AbstractC0485a.f9072b = r0
        L4d:
            java.lang.reflect.Method r2 = a.AbstractC0485a.f9073c
            if (r2 == 0) goto L62
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L62
            r4[r1] = r10     // Catch: java.lang.Throwable -> L62
            java.lang.Object r8 = r2.invoke(r8, r4)     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto L5c
            goto L62
        L5c:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L62
            boolean r1 = r8.booleanValue()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r1 == 0) goto L65
            goto L81
        L65:
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto L6c
            goto L81
        L6c:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = P.Q.c(r7, r10)
            if (r8 == 0) goto L77
            goto L81
        L77:
            if (r7 == 0) goto L7d
            android.view.KeyEvent$DispatcherState r3 = r7.getKeyDispatcherState()
        L7d:
            boolean r0 = r10.dispatch(r9, r3, r9)
        L81:
            return r0
        L82:
            boolean r2 = r9 instanceof android.app.Dialog
            if (r2 == 0) goto Ld5
            android.app.Dialog r9 = (android.app.Dialog) r9
            boolean r7 = a.AbstractC0485a.f9074d
            if (r7 != 0) goto L9b
            java.lang.Class<android.app.Dialog> r7 = android.app.Dialog.class
            java.lang.String r8 = "mOnKeyListener"
            java.lang.reflect.Field r7 = r7.getDeclaredField(r8)     // Catch: java.lang.NoSuchFieldException -> L99
            a.AbstractC0485a.f9075e = r7     // Catch: java.lang.NoSuchFieldException -> L99
            r7.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L99
        L99:
            a.AbstractC0485a.f9074d = r0
        L9b:
            java.lang.reflect.Field r7 = a.AbstractC0485a.f9075e
            if (r7 == 0) goto La6
            java.lang.Object r7 = r7.get(r9)     // Catch: java.lang.IllegalAccessException -> La6
            android.content.DialogInterface$OnKeyListener r7 = (android.content.DialogInterface.OnKeyListener) r7     // Catch: java.lang.IllegalAccessException -> La6
            goto La7
        La6:
            r7 = r3
        La7:
            if (r7 == 0) goto Lb4
            int r8 = r10.getKeyCode()
            boolean r7 = r7.onKey(r9, r8, r10)
            if (r7 == 0) goto Lb4
            goto Ld4
        Lb4:
            android.view.Window r7 = r9.getWindow()
            boolean r8 = r7.superDispatchKeyEvent(r10)
            if (r8 == 0) goto Lbf
            goto Ld4
        Lbf:
            android.view.View r7 = r7.getDecorView()
            boolean r8 = P.Q.c(r7, r10)
            if (r8 == 0) goto Lca
            goto Ld4
        Lca:
            if (r7 == 0) goto Ld0
            android.view.KeyEvent$DispatcherState r3 = r7.getKeyDispatcherState()
        Ld0:
            boolean r0 = r10.dispatch(r9, r3, r9)
        Ld4:
            return r0
        Ld5:
            if (r8 == 0) goto Ldd
            boolean r8 = P.Q.c(r8, r10)
            if (r8 != 0) goto Le3
        Ldd:
            boolean r7 = r7.h(r10)
            if (r7 == 0) goto Le4
        Le3:
            return r0
        Le4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0485a.l(P.j, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static String m(C0521g c0521g) {
        StringBuilder sb = new StringBuilder(c0521g.size());
        for (int i9 = 0; i9 < c0521g.size(); i9++) {
            byte b9 = c0521g.b(i9);
            if (b9 != 34) {
                if (b9 != 39) {
                    if (b9 != 92) {
                        switch (b9) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case R.styleable.GradientColor_android_endX /* 10 */:
                                sb.append("\\n");
                                break;
                            case R.styleable.GradientColor_android_endY /* 11 */:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (b9 >= 32 && b9 <= 126) {
                                    sb.append((char) b9);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b9 >>> 6) & 3) + 48));
                                    sb.append((char) (((b9 >>> 3) & 7) + 48));
                                    sb.append((char) ((b9 & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final String n(Collection collection) {
        h.e(collection, "collection");
        if (!collection.isEmpty()) {
            return e.C(k.u0(collection, ",\n", "\n", "\n", null, 56)) + "},";
        }
        return " }";
    }

    public static final int o(Bitmap bitmap) {
        int i9;
        Bitmap.Config config;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config2 = bitmap.getConfig();
                if (config2 == Bitmap.Config.ALPHA_8) {
                    i9 = 1;
                } else if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444) {
                    i9 = 2;
                } else {
                    if (Build.VERSION.SDK_INT >= 26) {
                        config = Bitmap.Config.RGBA_F16;
                        if (config2 == config) {
                            i9 = 8;
                        }
                    }
                    i9 = 4;
                }
                return height * i9;
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + bitmap + " [" + bitmap.getWidth() + " x " + bitmap.getHeight() + "] + " + bitmap.getConfig()).toString());
    }

    public static Drawable q(Context context, int i9) {
        return C1749I0.d().f(context, i9);
    }

    public static Set r() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static boolean s(int i9, Rect rect, Rect rect2) {
        if (i9 != 17) {
            if (i9 != 33) {
                if (i9 != 66) {
                    if (i9 == 130) {
                        int i10 = rect.top;
                        int i11 = rect2.top;
                        if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                        return false;
                    }
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                int i12 = rect.left;
                int i13 = rect2.left;
                if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
                    return true;
                }
                return false;
            }
            int i14 = rect.bottom;
            int i15 = rect2.bottom;
            if ((i14 > i15 || rect.top >= i15) && rect.top > rect2.top) {
                return true;
            }
            return false;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if ((i16 > i17 || rect.left >= i17) && rect.left > rect2.left) {
            return true;
        }
        return false;
    }

    public static boolean t(Context context) {
        boolean z9;
        h.e(context, "context");
        ((I1.j) ((InterfaceC1963a) v4.e.p(InterfaceC1963a.class, Z0.a.h(context.getApplicationContext())))).getClass();
        int i9 = I.f5906c;
        Y y9 = Y.j;
        if (y9.f5950h <= 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        s8.e.h(z9, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (y9.isEmpty()) {
            return true;
        }
        return ((Boolean) ((D) y9.iterator()).next()).booleanValue();
    }

    public static final boolean u(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int v(int i9, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i9 != 17) {
            if (i9 != 33) {
                if (i9 != 66) {
                    if (i9 == 130) {
                        i10 = rect2.top;
                        i11 = rect.bottom;
                    } else {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                } else {
                    i10 = rect2.left;
                    i11 = rect.right;
                }
            } else {
                i10 = rect.top;
                i11 = rect2.bottom;
            }
        } else {
            i10 = rect.left;
            i11 = rect2.right;
        }
        return Math.max(0, i10 - i11);
    }

    public static String w(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i9 = 0; i9 < str.length(); i9++) {
                sb.append(str.charAt(i9));
                if (str2.length() > i9) {
                    sb.append(str2.charAt(i9));
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException("Invalid input received");
    }

    public static int x(int i9, Rect rect, Rect rect2) {
        if (i9 != 17) {
            if (i9 != 33) {
                if (i9 != 66) {
                    if (i9 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static E y(String statusLine) {
        int i9;
        String str;
        h.e(statusLine, "statusLine");
        boolean L8 = l.L(statusLine, "HTTP/1.", false);
        F f9 = F.HTTP_1_0;
        if (L8) {
            i9 = 9;
            if (statusLine.length() >= 9 && statusLine.charAt(8) == ' ') {
                int charAt = statusLine.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        f9 = F.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
        } else if (l.L(statusLine, "ICY ", false)) {
            i9 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        int i10 = i9 + 3;
        if (statusLine.length() >= i10) {
            try {
                String substring = statusLine.substring(i9, i10);
                h.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() > i10) {
                    if (statusLine.charAt(i10) == ' ') {
                        str = statusLine.substring(i9 + 4);
                        h.d(str, "this as java.lang.String).substring(startIndex)");
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                    }
                } else {
                    str = "";
                }
                return new E(f9, parseInt, str, 13);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
        }
        throw new ProtocolException("Unexpected status line: ".concat(statusLine));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void z(p pVar, AbstractC0450a abstractC0450a, AbstractC0450a abstractC0450a2) {
        try {
            AbstractC1130a.h(D1.A(((G7.a) pVar).create(abstractC0450a, abstractC0450a2)), n.f558a);
        } catch (Throwable th) {
            abstractC0450a2.resumeWith(h(th));
            throw th;
        }
    }

    public abstract void p(w wVar, float f9, float f10);
}
