package B4;

import F4.y;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import co.notix.R;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends G4.a {

    /* renamed from: a, reason: collision with root package name */
    public final int f684a;

    /* renamed from: b, reason: collision with root package name */
    public final int f685b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f686c;

    /* renamed from: d, reason: collision with root package name */
    public final String f687d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f683e = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new A1.a(1);

    public b(int i9, int i10, PendingIntent pendingIntent, String str) {
        this.f684a = i9;
        this.f685b = i10;
        this.f686c = pendingIntent;
        this.f687d = str;
    }

    public static String f(int i9) {
        if (i9 != 99) {
            if (i9 != 1500) {
                switch (i9) {
                    case -1:
                        return "UNKNOWN";
                    case 0:
                        return "SUCCESS";
                    case 1:
                        return "SERVICE_MISSING";
                    case 2:
                        return "SERVICE_VERSION_UPDATE_REQUIRED";
                    case 3:
                        return "SERVICE_DISABLED";
                    case 4:
                        return "SIGN_IN_REQUIRED";
                    case 5:
                        return "INVALID_ACCOUNT";
                    case 6:
                        return "RESOLUTION_REQUIRED";
                    case 7:
                        return "NETWORK_ERROR";
                    case 8:
                        return "INTERNAL_ERROR";
                    case 9:
                        return "SERVICE_INVALID";
                    case R.styleable.GradientColor_android_endX /* 10 */:
                        return "DEVELOPER_ERROR";
                    case R.styleable.GradientColor_android_endY /* 11 */:
                        return "LICENSE_CHECK_FAILED";
                    default:
                        switch (i9) {
                            case 13:
                                return "CANCELED";
                            case 14:
                                return "TIMEOUT";
                            case 15:
                                return "INTERRUPTED";
                            case 16:
                                return "API_UNAVAILABLE";
                            case 17:
                                return "SIGN_IN_FAILED";
                            case 18:
                                return "SERVICE_UPDATING";
                            case 19:
                                return "SERVICE_MISSING_PERMISSION";
                            case 20:
                                return "RESTRICTED_PROFILE";
                            case 21:
                                return "API_VERSION_UPDATE_REQUIRED";
                            case 22:
                                return "RESOLUTION_ACTIVITY_NOT_FOUND";
                            case 23:
                                return "API_DISABLED";
                            case 24:
                                return "API_DISABLED_FOR_CONNECTION";
                            case 25:
                                return "API_INSTALL_REQUIRED";
                            default:
                                return A0.a.m("UNKNOWN_ERROR_CODE(", i9, ")");
                        }
                }
            }
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        return "UNFINISHED";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f685b == bVar.f685b && y.k(this.f686c, bVar.f686c) && y.k(this.f687d, bVar.f687d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f685b), this.f686c, this.f687d});
    }

    public final String toString() {
        A1.g gVar = new A1.g(this);
        gVar.j(f(this.f685b), "statusCode");
        gVar.j(this.f686c, "resolution");
        gVar.j(this.f687d, "message");
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int R2 = s8.n.R(parcel, 20293);
        s8.n.V(parcel, 1, 4);
        parcel.writeInt(this.f684a);
        s8.n.V(parcel, 2, 4);
        parcel.writeInt(this.f685b);
        s8.n.L(parcel, 3, this.f686c, i9);
        s8.n.M(parcel, 4, this.f687d);
        s8.n.U(parcel, R2);
    }

    public b(int i9) {
        this(1, i9, null, null);
    }

    public b(int i9, PendingIntent pendingIntent) {
        this(1, i9, pendingIntent, null);
    }
}
