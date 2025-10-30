package androidx.media;

import co.notix.R;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f9919a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f9920b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f9921c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f9922d = -1;

    public final boolean equals(Object obj) {
        int i9;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f9920b == audioAttributesImplBase.f9920b) {
            int i10 = this.f9921c;
            int i11 = audioAttributesImplBase.f9921c;
            int i12 = audioAttributesImplBase.f9922d;
            if (i12 != -1) {
                i9 = i12;
            } else {
                int i13 = audioAttributesImplBase.f9919a;
                int i14 = AudioAttributesCompat.f9915b;
                if ((i11 & 1) == 1) {
                    i9 = 7;
                } else if ((i11 & 4) == 4) {
                    i9 = 6;
                } else {
                    switch (i13) {
                        case 2:
                            i9 = 0;
                            break;
                        case 3:
                            i9 = 8;
                            break;
                        case 4:
                            i9 = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case R.styleable.GradientColor_android_endX /* 10 */:
                            i9 = 5;
                            break;
                        case 6:
                            i9 = 2;
                            break;
                        case R.styleable.GradientColor_android_endY /* 11 */:
                            i9 = 10;
                            break;
                        case 12:
                        default:
                            i9 = 3;
                            break;
                        case 13:
                            i9 = 1;
                            break;
                    }
                }
            }
            if (i9 == 6) {
                i11 |= 4;
            } else if (i9 == 7) {
                i11 |= 1;
            }
            if (i10 == (i11 & 273) && this.f9919a == audioAttributesImplBase.f9919a && this.f9922d == i12) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9920b), Integer.valueOf(this.f9921c), Integer.valueOf(this.f9919a), Integer.valueOf(this.f9922d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f9922d != -1) {
            sb.append(" stream=");
            sb.append(this.f9922d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i9 = this.f9919a;
        int i10 = AudioAttributesCompat.f9915b;
        switch (i9) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case R.styleable.GradientColor_android_endX /* 10 */:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case R.styleable.GradientColor_android_endY /* 11 */:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = AbstractC0953k1.j(i9, "unknown usage ");
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f9920b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f9921c).toUpperCase());
        return sb.toString();
    }
}
