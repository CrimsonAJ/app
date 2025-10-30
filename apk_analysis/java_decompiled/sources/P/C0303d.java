package P;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.google.android.gms.internal.measurement.AbstractC0953k1;
import java.util.Locale;

/* renamed from: P.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303d implements InterfaceC0302c, InterfaceC0304e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5583a = 0;

    /* renamed from: b, reason: collision with root package name */
    public ClipData f5584b;

    /* renamed from: c, reason: collision with root package name */
    public int f5585c;

    /* renamed from: d, reason: collision with root package name */
    public int f5586d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f5587e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f5588f;

    public /* synthetic */ C0303d() {
    }

    @Override // P.InterfaceC0302c
    public void K(int i9) {
        this.f5586d = i9;
    }

    @Override // P.InterfaceC0302c
    public C0305f b() {
        return new C0305f(new C0303d(this));
    }

    @Override // P.InterfaceC0302c
    public void c(Bundle bundle) {
        this.f5588f = bundle;
    }

    @Override // P.InterfaceC0304e
    public int i() {
        return this.f5586d;
    }

    @Override // P.InterfaceC0304e
    public ClipData j() {
        return this.f5584b;
    }

    @Override // P.InterfaceC0304e
    public ContentInfo m() {
        return null;
    }

    @Override // P.InterfaceC0304e
    public int r() {
        return this.f5585c;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f5583a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f5584b.getDescription());
                sb.append(", source=");
                int i9 = this.f5585c;
                if (i9 != 0) {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            if (i9 != 3) {
                                if (i9 != 4) {
                                    if (i9 != 5) {
                                        str = String.valueOf(i9);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                int i10 = this.f5586d;
                if ((i10 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i10);
                }
                sb.append(valueOf);
                String str3 = "";
                Uri uri = this.f5587e;
                if (uri == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str2);
                if (this.f5588f != null) {
                    str3 = ", hasExtras";
                }
                return AbstractC0953k1.q(sb, str3, "}");
            default:
                return super.toString();
        }
    }

    @Override // P.InterfaceC0302c
    public void z(Uri uri) {
        this.f5587e = uri;
    }

    public C0303d(C0303d c0303d) {
        ClipData clipData = c0303d.f5584b;
        clipData.getClass();
        this.f5584b = clipData;
        int i9 = c0303d.f5585c;
        if (i9 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i9 <= 5) {
            this.f5585c = i9;
            int i10 = c0303d.f5586d;
            if ((i10 & 1) == i10) {
                this.f5586d = i10;
                this.f5587e = c0303d.f5587e;
                this.f5588f = c0303d.f5588f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i10) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
    }
}
