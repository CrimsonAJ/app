package co.notix;

/* loaded from: classes.dex */
public final class m8 implements td {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0021. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0080  */
    @Override // co.notix.td
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r8) {
        /*
            r7 = this;
            org.json.JSONObject r8 = (org.json.JSONObject) r8
            java.lang.String r0 = "from"
            kotlin.jvm.internal.h.e(r8, r0)
            java.lang.String r0 = "close_data"
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r1 = "from.getString(DATA_FIELD)"
            kotlin.jvm.internal.h.d(r0, r1)
            java.lang.String r1 = "ad_format"
            java.lang.String r1 = r8.getString(r1)
            java.lang.String r2 = "it"
            kotlin.jvm.internal.h.d(r1, r2)
            int r2 = r1.hashCode()
            switch(r2) {
                case -1980132765: goto L68;
                case -1968751561: goto L5d;
                case 2499173: goto L52;
                case 2499386: goto L47;
                case 769047372: goto L3c;
                case 870560747: goto L31;
                case 1982491468: goto L26;
                default: goto L24;
            }
        L24:
            goto La3
        L26:
            java.lang.String r2 = "Banner"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La3
            co.notix.w2 r1 = co.notix.w2.f13398a
            goto L72
        L31:
            java.lang.String r2 = "AppOpen"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La3
            co.notix.v2 r1 = co.notix.v2.f13328a
            goto L72
        L3c:
            java.lang.String r2 = "Interstitial"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La3
            co.notix.y2 r1 = co.notix.y2.f13572a
            goto L72
        L47:
            java.lang.String r2 = "Push"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La3
            co.notix.c3 r1 = co.notix.c3.f11973a
            goto L72
        L52:
            java.lang.String r2 = "Pull"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La3
            co.notix.b3 r1 = co.notix.b3.f11907a
            goto L72
        L5d:
            java.lang.String r2 = "Native"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La3
            co.notix.a3 r1 = co.notix.a3.f11820a
            goto L72
        L68:
            java.lang.String r2 = "LockScreenInterstitial"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto La3
            co.notix.z2 r1 = co.notix.z2.f13625a
        L72:
            java.lang.String r2 = "reason"
            java.lang.String r8 = r8.getString(r2)
            co.notix.p8[] r2 = co.notix.p8.values()
            int r3 = r2.length
            r4 = 0
        L7e:
            if (r4 >= r3) goto L8e
            r5 = r2[r4]
            java.lang.String r6 = r5.f12935a
            boolean r6 = kotlin.jvm.internal.h.a(r6, r8)
            if (r6 == 0) goto L8b
            goto L8f
        L8b:
            int r4 = r4 + 1
            goto L7e
        L8e:
            r5 = 0
        L8f:
            if (r5 == 0) goto L97
            co.notix.l8 r8 = new co.notix.l8
            r8.<init>(r0, r1, r5)
            return r8
        L97:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "unknown CloseReason name="
            java.lang.String r8 = u0.z.e(r1, r8)
            r0.<init>(r8)
            throw r0
        La3:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "unknown AdFormat name="
            java.lang.String r0 = r0.concat(r1)
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: co.notix.m8.a(java.lang.Object):java.lang.Object");
    }
}
