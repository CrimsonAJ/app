package p;

import android.widget.AbsListView;
import java.lang.reflect.Field;

/* renamed from: p.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1810n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Field f22039a;

    static {
        Field field = null;
        try {
            field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            field.setAccessible(true);
        } catch (NoSuchFieldException e8) {
            e8.printStackTrace();
        }
        f22039a = field;
    }
}
