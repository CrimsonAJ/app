package X3;

import N3.o0;
import android.text.TextUtils;
import j3.L;
import j3.M;
import java.util.ArrayList;
import java.util.Collections;
import l3.AbstractC1552a;
import l4.AbstractC1566a;
import l4.y;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class f extends d {

    /* renamed from: e, reason: collision with root package name */
    public M f8446e;

    public static ArrayList p(String str) {
        byte[][] bArr;
        int length;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            byte[] p9 = y.p(str);
            if (p9.length > 4) {
                int i9 = 0;
                while (true) {
                    byte[] bArr2 = AbstractC1566a.f20473a;
                    if (i9 < 4) {
                        if (p9[i9] != bArr2[i9]) {
                            break;
                        }
                        i9++;
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        int i10 = 0;
                        do {
                            arrayList2.add(Integer.valueOf(i10));
                            i10 += 4;
                            int length2 = p9.length - 4;
                            while (true) {
                                if (i10 <= length2) {
                                    if (p9.length - i10 > 4) {
                                        for (int i11 = 0; i11 < 4; i11++) {
                                            if (p9[i10 + i11] != bArr2[i11]) {
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    i10++;
                                } else {
                                    i10 = -1;
                                    break;
                                }
                            }
                        } while (i10 != -1);
                        byte[][] bArr3 = new byte[arrayList2.size()];
                        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                            int intValue = ((Integer) arrayList2.get(i12)).intValue();
                            if (i12 < arrayList2.size() - 1) {
                                length = ((Integer) arrayList2.get(i12 + 1)).intValue();
                            } else {
                                length = p9.length;
                            }
                            int i13 = length - intValue;
                            byte[] bArr4 = new byte[i13];
                            System.arraycopy(p9, intValue, bArr4, 0, i13);
                            bArr3[i12] = bArr4;
                        }
                        bArr = bArr3;
                    }
                }
            }
            bArr = null;
            if (bArr == null) {
                arrayList.add(p9);
                return arrayList;
            }
            Collections.addAll(arrayList, bArr);
        }
        return arrayList;
    }

    @Override // X3.d
    public final Object b() {
        return this.f8446e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    @Override // X3.d
    public final void j(XmlPullParser xmlPullParser) {
        String str;
        int i9;
        L l9 = new L();
        String attributeValue = xmlPullParser.getAttributeValue(null, "FourCC");
        if (attributeValue != null) {
            if (!attributeValue.equalsIgnoreCase("H264") && !attributeValue.equalsIgnoreCase("X264") && !attributeValue.equalsIgnoreCase("AVC1") && !attributeValue.equalsIgnoreCase("DAVC")) {
                if (attributeValue.equalsIgnoreCase("AAC") || attributeValue.equalsIgnoreCase("AACL") || attributeValue.equalsIgnoreCase("AACH") || attributeValue.equalsIgnoreCase("AACP")) {
                    str = "audio/mp4a-latm";
                } else if (!attributeValue.equalsIgnoreCase("TTML") && !attributeValue.equalsIgnoreCase("DFXP")) {
                    if (!attributeValue.equalsIgnoreCase("ac-3") && !attributeValue.equalsIgnoreCase("dac3")) {
                        if (!attributeValue.equalsIgnoreCase("ec-3") && !attributeValue.equalsIgnoreCase("dec3")) {
                            if (attributeValue.equalsIgnoreCase("dtsc")) {
                                str = "audio/vnd.dts";
                            } else if (!attributeValue.equalsIgnoreCase("dtsh") && !attributeValue.equalsIgnoreCase("dtsl")) {
                                if (attributeValue.equalsIgnoreCase("dtse")) {
                                    str = "audio/vnd.dts.hd;profile=lbr";
                                } else if (attributeValue.equalsIgnoreCase("opus")) {
                                    str = "audio/opus";
                                } else {
                                    str = null;
                                }
                            } else {
                                str = "audio/vnd.dts.hd";
                            }
                        } else {
                            str = "audio/eac3";
                        }
                    } else {
                        str = "audio/ac3";
                    }
                } else {
                    str = "application/ttml+xml";
                }
            } else {
                str = "video/avc";
            }
            int intValue = ((Integer) c("Type")).intValue();
            if (intValue == 2) {
                ArrayList p9 = p(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                l9.j = "video/mp4";
                l9.f19407p = d.i(xmlPullParser, "MaxWidth");
                l9.f19408q = d.i(xmlPullParser, "MaxHeight");
                l9.f19404m = p9;
            } else if (intValue == 1) {
                if (str == null) {
                    str = "audio/mp4a-latm";
                }
                int i10 = d.i(xmlPullParser, "Channels");
                int i11 = d.i(xmlPullParser, "SamplingRate");
                ArrayList p10 = p(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                boolean isEmpty = p10.isEmpty();
                ArrayList arrayList = p10;
                if (isEmpty) {
                    arrayList = p10;
                    if ("audio/mp4a-latm".equals(str)) {
                        arrayList = Collections.singletonList(AbstractC1552a.a(i11, i10));
                    }
                }
                l9.j = "audio/mp4";
                l9.f19415x = i10;
                l9.f19416y = i11;
                l9.f19404m = arrayList;
            } else if (intValue == 3) {
                String str2 = (String) c("Subtype");
                if (str2 != null) {
                    if (!str2.equals("CAPT")) {
                        if (str2.equals("DESC")) {
                            i9 = 1024;
                        }
                    } else {
                        i9 = 64;
                    }
                    l9.j = "application/mp4";
                    l9.f19397e = i9;
                }
                i9 = 0;
                l9.j = "application/mp4";
                l9.f19397e = i9;
            } else {
                l9.j = "application/mp4";
            }
            l9.f19393a = xmlPullParser.getAttributeValue(null, "Index");
            l9.f19394b = (String) c("Name");
            l9.f19402k = str;
            l9.f19398f = d.i(xmlPullParser, "Bitrate");
            l9.f19395c = (String) c("Language");
            this.f8446e = new M(l9);
            return;
        }
        throw new o0("FourCC", 1);
    }
}
