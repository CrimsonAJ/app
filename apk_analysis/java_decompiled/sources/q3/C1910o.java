package q3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l4.y;

/* renamed from: q3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1910o {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f22335c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f22336a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f22337b = -1;

    public final boolean a(String str) {
        Matcher matcher = f22335c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i9 = y.f20553a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f22336a = parseInt;
                    this.f22337b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(D3.c cVar) {
        int i9 = 0;
        while (true) {
            D3.b[] bVarArr = cVar.f1786a;
            if (i9 < bVarArr.length) {
                D3.b bVar = bVarArr[i9];
                if (bVar instanceof I3.e) {
                    I3.e eVar = (I3.e) bVar;
                    if ("iTunSMPB".equals(eVar.f3498c) && a(eVar.f3499d)) {
                        return;
                    }
                } else if (bVar instanceof I3.k) {
                    I3.k kVar = (I3.k) bVar;
                    if ("com.apple.iTunes".equals(kVar.f3510b) && "iTunSMPB".equals(kVar.f3511c) && a(kVar.f3512d)) {
                        return;
                    }
                } else {
                    continue;
                }
                i9++;
            } else {
                return;
            }
        }
    }
}
