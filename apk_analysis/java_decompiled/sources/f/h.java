package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new android.support.v4.media.a(24);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f17238a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f17239b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17240c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17241d;

    public h(IntentSender intentSender, Intent intent, int i9, int i10) {
        this.f17238a = intentSender;
        this.f17239b = intent;
        this.f17240c = i9;
        this.f17241d = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i9) {
        kotlin.jvm.internal.h.e(dest, "dest");
        dest.writeParcelable(this.f17238a, i9);
        dest.writeParcelable(this.f17239b, i9);
        dest.writeInt(this.f17240c);
        dest.writeInt(this.f17241d);
    }
}
