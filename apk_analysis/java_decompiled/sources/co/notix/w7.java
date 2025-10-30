package co.notix;

import Y7.InterfaceC0484z;
import a.AbstractC0485a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public final class w7 extends G7.j implements O7.p {

    /* renamed from: a, reason: collision with root package name */
    public String f13405a;

    /* renamed from: b, reason: collision with root package name */
    public int f13406b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c8 f13407c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f13408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ no f13409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(c8 c8Var, String str, no noVar, E7.d dVar) {
        super(2, dVar);
        this.f13407c = c8Var;
        this.f13408d = str;
        this.f13409e = noVar;
    }

    @Override // G7.a
    public final E7.d create(Object obj, E7.d dVar) {
        return new w7(this.f13407c, this.f13408d, this.f13409e, dVar);
    }

    @Override // O7.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w7) create((InterfaceC0484z) obj, (E7.d) obj2)).invokeSuspend(A7.n.f558a);
    }

    @Override // G7.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object obj2;
        F7.a aVar = F7.a.f2587a;
        int i9 = this.f13406b;
        int i10 = 1;
        if (i9 != 0) {
            if (i9 == 1) {
                str = this.f13405a;
                AbstractC0485a.A(obj);
                obj2 = ((A7.j) obj).f550a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC0485a.A(obj);
            c8 c8Var = this.f13407c;
            fb fbVar = c8.f11988f;
            ((File) c8Var.f11992c.getValue()).mkdirs();
            StringBuilder sb = new StringBuilder();
            c8 c8Var2 = this.f13407c;
            String str2 = this.f13408d;
            c8Var2.getClass();
            sb.append(((File) c8Var2.f11992c.getValue()) + '/' + str2.hashCode() + '.' + c8.f11988f.f12239a);
            sb.append(".tmp");
            String sb2 = sb.toString();
            no noVar = this.f13409e;
            v7 v7Var = new v7(this.f13407c, this.f13408d, sb2);
            this.f13405a = sb2;
            this.f13406b = 1;
            Object a5 = lr.a(noVar, null, v7Var, this);
            if (a5 == aVar) {
                return aVar;
            }
            str = sb2;
            obj2 = a5;
        }
        AbstractC0485a.A(obj2);
        c8 c8Var3 = this.f13407c;
        fb fbVar2 = c8.f11988f;
        c8Var3.getClass();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            BitmapFactory.decodeStream(fileInputStream, null, options);
            fileInputStream.close();
            double d9 = 1000;
            int pow = (int) Math.pow(2.0d, Math.ceil(Math.log(Math.max(options.outHeight / d9, options.outWidth / d9)) / Math.log(2.0d)));
            if (pow >= 1) {
                i10 = pow;
            }
            options.inSampleSize = i10;
            options.inJustDecodeBounds = false;
            fileInputStream = new FileInputStream(str);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                fileInputStream.close();
                if (decodeStream != null) {
                    new File(str).delete();
                    c8 c8Var4 = this.f13407c;
                    String str3 = this.f13408d;
                    c8Var4.getClass();
                    int hashCode = str3.hashCode();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append((File) c8Var4.f11992c.getValue());
                    sb3.append('/');
                    sb3.append(hashCode);
                    sb3.append('.');
                    fb fbVar3 = c8.f11988f;
                    sb3.append(fbVar3.f12239a);
                    FileOutputStream fileOutputStream = new FileOutputStream(sb3.toString());
                    try {
                        decodeStream.compress(fbVar3.f12240b, fbVar3.f12241c, fileOutputStream);
                        fileOutputStream.close();
                        return decodeStream;
                    } finally {
                    }
                } else {
                    throw new IllegalStateException("can't load sampled bitmap from tmp file");
                }
            } finally {
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
