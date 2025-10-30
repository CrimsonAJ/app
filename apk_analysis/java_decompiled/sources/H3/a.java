package H3;

import B6.u0;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v4.e;

/* loaded from: classes.dex */
public final class a extends e {
    public static final Pattern j = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: h, reason: collision with root package name */
    public final CharsetDecoder f3096h = O5.e.f5491c.newDecoder();

    /* renamed from: i, reason: collision with root package name */
    public final CharsetDecoder f3097i = O5.e.f5490b.newDecoder();

    @Override // v4.e
    public final D3.c j(D3.e eVar, ByteBuffer byteBuffer) {
        String str;
        CharsetDecoder charsetDecoder = this.f3097i;
        CharsetDecoder charsetDecoder2 = this.f3096h;
        String str2 = null;
        try {
            str = charsetDecoder2.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = charsetDecoder.decode(byteBuffer).toString();
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = charBuffer;
            } catch (CharacterCodingException unused2) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                charsetDecoder.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            charsetDecoder2.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new D3.c(new d(null, null, bArr));
        }
        Matcher matcher = j.matcher(str);
        String str3 = null;
        for (int i9 = 0; matcher.find(i9); i9 = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String L8 = u0.L(group);
                L8.getClass();
                if (!L8.equals("streamurl")) {
                    if (L8.equals("streamtitle")) {
                        str2 = group2;
                    }
                } else {
                    str3 = group2;
                }
            }
        }
        return new D3.c(new d(str2, str3, bArr));
    }
}
