package p5;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import i5.C1381b;

/* renamed from: p5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1859a extends View.BaseSavedState {
    public static final Parcelable.Creator<C1859a> CREATOR = new C1381b(7);

    /* renamed from: a, reason: collision with root package name */
    public int f22181a;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i9 = this.f22181a;
        if (i9 != 1) {
            if (i9 != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        return AbstractC0953k1.q(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        super.writeToParcel(parcel, i9);
        parcel.writeValue(Integer.valueOf(this.f22181a));
    }
}
