package O5;

import android.text.TextUtils;
import d0.u;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g implements d0.m {

    /* renamed from: a, reason: collision with root package name */
    public String f5494a;

    public g(String str, int i9) {
        switch (i9) {
            case 1:
                this.f5494a = str;
                return;
            default:
                str.getClass();
                this.f5494a = str;
                return;
        }
    }

    public String a(List list) {
        CharSequence obj;
        CharSequence obj2;
        Iterator it = list.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb.append(obj);
                while (it.hasNext()) {
                    sb.append((CharSequence) this.f5494a);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb.append(obj2);
                }
            }
            return sb.toString();
        } catch (IOException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // d0.m
    public boolean d(CharSequence charSequence, int i9, int i10, u uVar) {
        if (TextUtils.equals(charSequence.subSequence(i9, i10), this.f5494a)) {
            uVar.f16680c = (uVar.f16680c & 3) | 4;
            return false;
        }
        return true;
    }

    @Override // d0.m
    public Object b() {
        return this;
    }
}
