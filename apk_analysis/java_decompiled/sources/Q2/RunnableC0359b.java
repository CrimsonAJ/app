package Q2;

import b5.S0;
import com.anilab.exoplayer.AspectRatioFrameLayout;

/* renamed from: Q2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0359b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6208a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6209b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6210c;

    public RunnableC0359b(S0 s02, boolean z9) {
        this.f6209b = z9;
        this.f6210c = s02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
    
        if (r4 != r0) goto L21;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r9 = this;
            r0 = 0
            int r1 = r9.f6208a
            switch(r1) {
                case 0: goto L6d;
                default: goto L6;
            }
        L6:
            java.lang.Object r1 = r9.f6210c
            b5.S0 r1 = (b5.S0) r1
            java.lang.Object r2 = r1.f1707a
            b5.n0 r2 = (b5.C0650n0) r2
            boolean r3 = r2.a()
            java.lang.Boolean r4 = r2.f11216B
            r5 = 1
            if (r4 == 0) goto L21
            java.lang.Boolean r4 = r2.f11216B
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L21
            r4 = r5
            goto L22
        L21:
            r4 = r0
        L22:
            boolean r6 = r9.f6209b
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r2.f11216B = r7
            if (r4 != r6) goto L3c
            b5.V r4 = r2.f11229i
            b5.C0650n0.f(r4)
            b5.T r4 = r4.f10978n
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            java.lang.String r8 = "Default data collection state already set to"
            r4.c(r7, r8)
        L3c:
            boolean r4 = r2.a()
            if (r4 == r3) goto L55
            boolean r4 = r2.a()
            java.lang.Boolean r7 = r2.f11216B
            if (r7 == 0) goto L53
            java.lang.Boolean r7 = r2.f11216B
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L53
            r0 = r5
        L53:
            if (r4 == r0) goto L69
        L55:
            b5.V r0 = r2.f11229i
            b5.C0650n0.f(r0)
            b5.T r0 = r0.f10975k
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r4 = "Default data collection is different than actual status"
            r0.d(r2, r3, r4)
        L69:
            r1.I0()
            return
        L6d:
            r9.f6209b = r0
            java.lang.Object r1 = r9.f6210c
            com.anilab.exoplayer.AspectRatioFrameLayout r1 = (com.anilab.exoplayer.AspectRatioFrameLayout) r1
            Q2.a r1 = r1.f14444b
            if (r1 != 0) goto L78
            goto Lae
        L78:
            N1.h r1 = (N1.h) r1
            int r2 = com.anilab.android.ui.player.PlayerActivity.f13798w0
            java.lang.Object r2 = r1.f4850b
            J1.c r2 = (J1.AbstractC0165c) r2
            com.anilab.exoplayer.StyledPlayerView r3 = r2.f3853N
            com.anilab.exoplayer.AspectRatioFrameLayout r3 = r3.getContentFrame()
            com.anilab.exoplayer.StyledPlayerView r2 = r2.f3853N
            com.anilab.exoplayer.SubtitleView r2 = r2.getSubtitleView()
            if (r3 == 0) goto Lae
            if (r2 == 0) goto Lae
            java.lang.Object r1 = r1.f4851c
            com.anilab.android.ui.player.PlayerActivity r1 = (com.anilab.android.ui.player.PlayerActivity) r1
            android.content.res.Resources r3 = r1.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.orientation
            r4 = 2
            if (r3 == r4) goto La5
            r3 = 1061119713(0x3f3f66e1, float:0.74766356)
            goto La7
        La5:
            r3 = 1065353216(0x3f800000, float:1.0)
        La7:
            int r1 = r1.c0(r3)
            r2.setPadding(r0, r0, r0, r1)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Q2.RunnableC0359b.run():void");
    }

    public RunnableC0359b(AspectRatioFrameLayout aspectRatioFrameLayout) {
        this.f6210c = aspectRatioFrameLayout;
    }
}
