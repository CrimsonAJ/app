package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes.dex */
public final class b8 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c8 f11915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(c8 c8Var, String str, E7.d dVar) {
        super(2, dVar);
        this.f11915a = c8Var;
        this.f11916b = str;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new b8(this.f11915a, this.f11916b, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b8) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        AbstractC0485a.A(obj);
        c8 c8Var = this.f11915a;
        String str = this.f11916b;
        fb fbVar = c8.f11988f;
        c8Var.getClass();
        FileInputStream fileInputStream = new FileInputStream(((File) c8Var.f11992c.getValue()) + '/' + str.hashCode() + '.' + c8.f11988f.f12239a);
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
            fileInputStream.close();
            return decodeStream;
        } finally {
        }
    }
}
