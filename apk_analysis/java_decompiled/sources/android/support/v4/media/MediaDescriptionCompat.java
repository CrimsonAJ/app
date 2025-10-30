package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f9240a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f9241b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f9242c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f9243d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f9244e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f9245f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f9246g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f9247h;

    /* renamed from: i, reason: collision with root package name */
    public MediaDescription f9248i;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f9240a = str;
        this.f9241b = charSequence;
        this.f9242c = charSequence2;
        this.f9243d = charSequence3;
        this.f9244e = bitmap;
        this.f9245f = uri;
        this.f9246g = bundle;
        this.f9247h = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L5c
            android.media.MediaDescription r13 = (android.media.MediaDescription) r13
            java.lang.String r2 = android.support.v4.media.b.g(r13)
            java.lang.CharSequence r3 = android.support.v4.media.b.i(r13)
            java.lang.CharSequence r4 = android.support.v4.media.b.h(r13)
            java.lang.CharSequence r5 = android.support.v4.media.b.c(r13)
            android.graphics.Bitmap r6 = android.support.v4.media.b.e(r13)
            android.net.Uri r7 = android.support.v4.media.b.f(r13)
            android.os.Bundle r1 = android.support.v4.media.b.d(r13)
            if (r1 == 0) goto L27
            android.os.Bundle r1 = android.support.v4.media.session.y.Z(r1)
        L27:
            java.lang.String r8 = "android.support.v4.media.description.MEDIA_URI"
            if (r1 == 0) goto L32
            android.os.Parcelable r9 = r1.getParcelable(r8)
            android.net.Uri r9 = (android.net.Uri) r9
            goto L33
        L32:
            r9 = r0
        L33:
            if (r9 == 0) goto L4c
            java.lang.String r10 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r11 = r1.containsKey(r10)
            if (r11 == 0) goto L46
            int r11 = r1.size()
            r12 = 2
            if (r11 != r12) goto L46
            r8 = r0
            goto L4d
        L46:
            r1.remove(r8)
            r1.remove(r10)
        L4c:
            r8 = r1
        L4d:
            if (r9 == 0) goto L50
            goto L54
        L50:
            android.net.Uri r9 = android.support.v4.media.c.a(r13)
        L54:
            android.support.v4.media.MediaDescriptionCompat r1 = new android.support.v4.media.MediaDescriptionCompat
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.f9248i = r13
            return r1
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f9241b) + ", " + ((Object) this.f9242c) + ", " + ((Object) this.f9243d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        MediaDescription mediaDescription = this.f9248i;
        if (mediaDescription == null) {
            MediaDescription.Builder b9 = b.b();
            b.n(b9, this.f9240a);
            b.p(b9, this.f9241b);
            b.o(b9, this.f9242c);
            b.j(b9, this.f9243d);
            b.l(b9, this.f9244e);
            b.m(b9, this.f9245f);
            b.k(b9, this.f9246g);
            c.b(b9, this.f9247h);
            mediaDescription = b.a(b9);
            this.f9248i = mediaDescription;
        }
        mediaDescription.writeToParcel(parcel, i9);
    }
}
