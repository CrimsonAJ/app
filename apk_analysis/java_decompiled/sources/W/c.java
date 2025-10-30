package W;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final DataBinderMapperImpl f7843a = new DataBinderMapperImpl();

    public static g a(ViewGroup viewGroup, int i9, int i10) {
        int childCount = viewGroup.getChildCount();
        int i11 = childCount - i9;
        DataBinderMapperImpl dataBinderMapperImpl = f7843a;
        if (i11 == 1) {
            return dataBinderMapperImpl.b(viewGroup.getChildAt(childCount - 1), i10);
        }
        View[] viewArr = new View[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            viewArr[i12] = viewGroup.getChildAt(i12 + i9);
        }
        return dataBinderMapperImpl.c(viewArr, i10);
    }

    public static g b(LayoutInflater layoutInflater, int i9, ViewGroup viewGroup, boolean z9) {
        boolean z10;
        int i10 = 0;
        if (viewGroup != null && z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            i10 = viewGroup.getChildCount();
        }
        View inflate = layoutInflater.inflate(i9, viewGroup, z9);
        if (z10) {
            return a(viewGroup, i10, i9);
        }
        return f7843a.b(inflate, i9);
    }
}
