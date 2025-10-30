package d0;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends SpannableStringBuilder {

    /* renamed from: a, reason: collision with root package name */
    public final Class f16675a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f16676b;

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f16676b = new ArrayList();
        s8.e.g(cls, "watcherClass cannot be null");
        this.f16675a = cls;
    }

    public final void a() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f16676b;
            if (i9 < arrayList.size()) {
                ((s) arrayList.get(i9)).f16674b.incrementAndGet();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f16676b;
            if (i9 < arrayList.size()) {
                ((s) arrayList.get(i9)).onTextChanged(this, 0, length(), length());
                i9++;
            } else {
                return;
            }
        }
    }

    public final s c(Object obj) {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f16676b;
            if (i9 < arrayList.size()) {
                s sVar = (s) arrayList.get(i9);
                if (sVar.f16673a == obj) {
                    return sVar;
                }
                i9++;
            } else {
                return null;
            }
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            if (this.f16675a == obj.getClass()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i9, int i10) {
        super.delete(i9, i10);
        return this;
    }

    public final void e() {
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f16676b;
            if (i9 < arrayList.size()) {
                ((s) arrayList.get(i9)).f16674b.decrementAndGet();
                i9++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        s c3;
        if (d(obj) && (c3 = c(obj)) != null) {
            obj = c3;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        s c3;
        if (d(obj) && (c3 = c(obj)) != null) {
            obj = c3;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        s c3;
        if (d(obj) && (c3 = c(obj)) != null) {
            obj = c3;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i9, int i10, Class cls) {
        if (this.f16675a == cls) {
            s[] sVarArr = (s[]) super.getSpans(i9, i10, s.class);
            Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, sVarArr.length);
            for (int i11 = 0; i11 < sVarArr.length; i11++) {
                objArr[i11] = sVarArr[i11].f16673a;
            }
            return objArr;
        }
        return super.getSpans(i9, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i9, CharSequence charSequence) {
        super.insert(i9, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i9, int i10, Class cls) {
        if (cls == null || this.f16675a == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i9, i10, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        s sVar;
        if (d(obj)) {
            sVar = c(obj);
            if (sVar != null) {
                obj = sVar;
            }
        } else {
            sVar = null;
        }
        super.removeSpan(obj);
        if (sVar != null) {
            this.f16676b.remove(sVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i9, int i10, CharSequence charSequence) {
        replace(i9, i10, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i9, int i10, int i11) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.f16676b.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i9, i10, i11);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i9, int i10) {
        return new t(this.f16675a, this, i9, i10);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i9, int i10) {
        super.delete(i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i9, CharSequence charSequence) {
        super.insert(i9, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i9, int i10, CharSequence charSequence, int i11, int i12) {
        replace(i9, i10, charSequence, i11, i12);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i9, CharSequence charSequence, int i10, int i11) {
        super.insert(i9, charSequence, i10, i11);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i9, int i10, CharSequence charSequence) {
        a();
        super.replace(i9, i10, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i9, CharSequence charSequence, int i10, int i11) {
        super.insert(i9, charSequence, i10, i11);
        return this;
    }

    public t(Class cls, t tVar, int i9, int i10) {
        super(tVar, i9, i10);
        this.f16676b = new ArrayList();
        s8.e.g(cls, "watcherClass cannot be null");
        this.f16675a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c3) {
        super.append(c3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i9, int i10, CharSequence charSequence, int i11, int i12) {
        a();
        super.replace(i9, i10, charSequence, i11, i12);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i9, int i10) {
        super.append(charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i9, int i10) {
        super.append(charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i9, int i10) {
        super.append(charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i9) {
        super.append(charSequence, obj, i9);
        return this;
    }
}
