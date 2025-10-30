package j3;

import android.content.Context;
import android.os.Looper;
import java.util.ArrayList;

/* renamed from: j3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1460k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19660a;

    /* renamed from: b, reason: collision with root package name */
    public final F5.e f19661b = new F5.e(2);

    public C1460k(Context context) {
        this.f19660a = context;
    }

    public void a(SurfaceHolderCallbackC1438A surfaceHolderCallbackC1438A, Looper looper, ArrayList arrayList) {
        arrayList.add(new Y3.l(surfaceHolderCallbackC1438A, looper, Y3.j.f8714L));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j3.AbstractC1449d[] b(android.os.Handler r10, j3.SurfaceHolderCallbackC1438A r11, j3.SurfaceHolderCallbackC1438A r12, j3.SurfaceHolderCallbackC1438A r13, j3.SurfaceHolderCallbackC1438A r14) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            m4.i r1 = new m4.i
            F5.e r4 = r9.f19661b
            android.content.Context r3 = r9.f19660a
            r1.<init>(r3, r4, r10, r11)
            r0.add(r1)
            b5.G1 r11 = new b5.G1
            r1 = 14
            r2 = 0
            r11.<init>(r1, r2)
            l3.g r1 = l3.C1558g.f20397c
            r11.f10717b = r1
            l3.E r2 = l3.E.f20294a
            r11.f10719d = r2
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r5 = "android.media.action.HDMI_AUDIO_PLUG"
            r2.<init>(r5)
            r5 = 0
            android.content.Intent r2 = l4.y.M(r3, r5, r2)
            int r5 = l4.y.f20553a
            r6 = 17
            r8 = 0
            if (r5 < r6) goto L56
            java.lang.String r6 = l4.y.f20555c
            java.lang.String r7 = "Amazon"
            boolean r7 = r7.equals(r6)
            if (r7 != 0) goto L46
            java.lang.String r7 = "Xiaomi"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L56
        L46:
            android.content.ContentResolver r6 = r3.getContentResolver()
            java.lang.String r7 = "external_surround_sound_enabled"
            int r6 = android.provider.Settings.Global.getInt(r6, r7, r8)
            r7 = 1
            if (r6 != r7) goto L56
            l3.g r1 = l3.C1558g.f20398d
            goto L98
        L56:
            r6 = 29
            r7 = 8
            if (r5 < r6) goto L7c
            boolean r6 = l4.y.G(r3)
            if (r6 != 0) goto L72
            r6 = 23
            if (r5 < r6) goto L7c
            android.content.pm.PackageManager r5 = r3.getPackageManager()
            java.lang.String r6 = "android.hardware.type.automotive"
            boolean r5 = r5.hasSystemFeature(r6)
            if (r5 == 0) goto L7c
        L72:
            l3.g r1 = new l3.g
            int[] r2 = l3.AbstractC1557f.a()
            r1.<init>(r2, r7)
            goto L98
        L7c:
            if (r2 == 0) goto L98
            java.lang.String r5 = "android.media.extra.AUDIO_PLUG_STATE"
            int r5 = r2.getIntExtra(r5, r8)
            if (r5 != 0) goto L87
            goto L98
        L87:
            l3.g r1 = new l3.g
            java.lang.String r5 = "android.media.extra.ENCODINGS"
            int[] r5 = r2.getIntArrayExtra(r5)
            java.lang.String r6 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r2 = r2.getIntExtra(r6, r7)
            r1.<init>(r5, r2)
        L98:
            r1.getClass()
            r11.f10717b = r1
            java.lang.Object r1 = r11.f10718c
            b5.G1 r1 = (b5.G1) r1
            if (r1 != 0) goto Lac
            b5.G1 r1 = new b5.G1
            l3.j[] r2 = new l3.InterfaceC1561j[r8]
            r1.<init>(r2)
            r11.f10718c = r1
        Lac:
            l3.D r7 = new l3.D
            r7.<init>(r11)
            l3.H r2 = new l3.H
            r5 = r10
            r6 = r12
            r2.<init>(r3, r4, r5, r6, r7)
            r0.add(r2)
            android.os.Looper r10 = r5.getLooper()
            r9.a(r13, r10, r0)
            android.os.Looper r10 = r5.getLooper()
            D3.f r11 = new D3.f
            r11.<init>(r14, r10)
            r0.add(r11)
            n4.b r10 = new n4.b
            r10.<init>()
            r0.add(r10)
            j3.d[] r10 = new j3.AbstractC1449d[r8]
            java.lang.Object[] r10 = r0.toArray(r10)
            j3.d[] r10 = (j3.AbstractC1449d[]) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.C1460k.b(android.os.Handler, j3.A, j3.A, j3.A, j3.A):j3.d[]");
    }
}
