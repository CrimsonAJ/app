package androidx.databinding.library.baseAdapters;

import W.a;
import W.g;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f9620a = new SparseIntArray(0);

    @Override // W.a
    public final List a() {
        return new ArrayList(0);
    }

    @Override // W.a
    public final g b(View view, int i9) {
        if (f9620a.get(i9) > 0 && view.getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // W.a
    public final g c(View[] viewArr, int i9) {
        if (viewArr.length != 0 && f9620a.get(i9) > 0 && viewArr[0].getTag() == null) {
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }
}
