package C3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Arrays;
import l4.AbstractC1566a;
import m3.C1589b;

/* loaded from: classes.dex */
public final class c implements m {

    /* renamed from: a, reason: collision with root package name */
    public int f1436a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1437b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1438c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f1439d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f1440e;

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0643  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0697  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06c1  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0769  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0785  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x07d9  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x07e7  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x089d  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x08d5  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x08ff  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:494:0x0929  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0937  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x096f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x097d  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x098b  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x09d1  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x09df  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0a25  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0a79  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0a87  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0ab1  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0abf  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0acd  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:590:0x0ae9  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0b13  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0b21  */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0b2f  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0b4b  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0b59  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:620:0x0b75  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0b83  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0b91  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0b9f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0bad  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0bbb  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0bc9  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0be5  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0bf3  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0c01  */
    /* JADX WARN: Removed duplicated region for block: B:653:0x0c0f  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x0c2b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:662:0x0c39  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0c55  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:674:0x0c71  */
    /* JADX WARN: Removed duplicated region for block: B:677:0x0c7f  */
    /* JADX WARN: Removed duplicated region for block: B:680:0x0c8d  */
    /* JADX WARN: Removed duplicated region for block: B:683:0x0c9b  */
    /* JADX WARN: Removed duplicated region for block: B:686:0x0ca9  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0cb6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:692:0x0cc3  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x0cd0  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x0cdc  */
    /* JADX WARN: Removed duplicated region for block: B:701:0x0ce7  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x0cfd  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0d08  */
    /* JADX WARN: Removed duplicated region for block: B:713:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x0d1e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:720:0x0d2b  */
    /* JADX WARN: Removed duplicated region for block: B:724:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:725:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x0d47  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0d4e  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x0d55  */
    /* JADX WARN: Removed duplicated region for block: B:730:0x0d5c  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x0d63  */
    /* JADX WARN: Removed duplicated region for block: B:732:0x0d6a  */
    /* JADX WARN: Removed duplicated region for block: B:733:0x0d71  */
    /* JADX WARN: Removed duplicated region for block: B:734:0x0d78  */
    /* JADX WARN: Removed duplicated region for block: B:735:0x0d7f  */
    /* JADX WARN: Removed duplicated region for block: B:736:0x0d86  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x0d8d  */
    /* JADX WARN: Removed duplicated region for block: B:738:0x0d94  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:740:0x0da2  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x0da9  */
    /* JADX WARN: Removed duplicated region for block: B:742:0x0db0  */
    /* JADX WARN: Removed duplicated region for block: B:743:0x0db7  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x0dbe  */
    /* JADX WARN: Removed duplicated region for block: B:745:0x0dc5  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x0dcc  */
    /* JADX WARN: Removed duplicated region for block: B:747:0x0dd3  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x0dda  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x0de1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x0de8  */
    /* JADX WARN: Removed duplicated region for block: B:751:0x0def  */
    /* JADX WARN: Removed duplicated region for block: B:752:0x0df6  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0dfd  */
    /* JADX WARN: Removed duplicated region for block: B:754:0x0e04  */
    /* JADX WARN: Removed duplicated region for block: B:755:0x0e0b  */
    /* JADX WARN: Removed duplicated region for block: B:756:0x0e12  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x0e19  */
    /* JADX WARN: Removed duplicated region for block: B:758:0x0e20  */
    /* JADX WARN: Removed duplicated region for block: B:759:0x0e27  */
    /* JADX WARN: Removed duplicated region for block: B:760:0x0e2e  */
    /* JADX WARN: Removed duplicated region for block: B:761:0x0e35  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x0e3c  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x0e43  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x0e4a  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x0e51  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0e58  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0e5f  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x0e6d  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x0e74  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x0e7b  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x0e82  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0e89  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x0e90  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x0e97  */
    /* JADX WARN: Removed duplicated region for block: B:776:0x0e9e  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x0ea5  */
    /* JADX WARN: Removed duplicated region for block: B:778:0x0eac  */
    /* JADX WARN: Removed duplicated region for block: B:779:0x0eb3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x0eba  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x0ec1  */
    /* JADX WARN: Removed duplicated region for block: B:782:0x0ec8  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x0ecf  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x0ed6  */
    /* JADX WARN: Removed duplicated region for block: B:785:0x0edd  */
    /* JADX WARN: Removed duplicated region for block: B:786:0x0ee4  */
    /* JADX WARN: Removed duplicated region for block: B:787:0x0eeb  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:789:0x0ef9  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x0f00  */
    /* JADX WARN: Removed duplicated region for block: B:791:0x0f07  */
    /* JADX WARN: Removed duplicated region for block: B:792:0x0f0e  */
    /* JADX WARN: Removed duplicated region for block: B:793:0x0f15  */
    /* JADX WARN: Removed duplicated region for block: B:794:0x0f1c  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x0f23  */
    /* JADX WARN: Removed duplicated region for block: B:796:0x0f2a  */
    /* JADX WARN: Removed duplicated region for block: B:797:0x0f31  */
    /* JADX WARN: Removed duplicated region for block: B:798:0x0f38  */
    /* JADX WARN: Removed duplicated region for block: B:799:0x0f3f  */
    /* JADX WARN: Removed duplicated region for block: B:800:0x0f46  */
    /* JADX WARN: Removed duplicated region for block: B:801:0x0f4d  */
    /* JADX WARN: Removed duplicated region for block: B:802:0x0f54  */
    /* JADX WARN: Removed duplicated region for block: B:803:0x0f5b  */
    /* JADX WARN: Removed duplicated region for block: B:804:0x0f62  */
    /* JADX WARN: Removed duplicated region for block: B:805:0x0f69  */
    /* JADX WARN: Removed duplicated region for block: B:806:0x0f70  */
    /* JADX WARN: Removed duplicated region for block: B:807:0x0f77  */
    /* JADX WARN: Removed duplicated region for block: B:808:0x0f7e  */
    /* JADX WARN: Removed duplicated region for block: B:809:0x0f85  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:810:0x0f8c  */
    /* JADX WARN: Removed duplicated region for block: B:811:0x0f93  */
    /* JADX WARN: Removed duplicated region for block: B:812:0x0f9a  */
    /* JADX WARN: Removed duplicated region for block: B:813:0x0fa1  */
    /* JADX WARN: Removed duplicated region for block: B:814:0x0fa8  */
    /* JADX WARN: Removed duplicated region for block: B:815:0x0faf  */
    /* JADX WARN: Removed duplicated region for block: B:816:0x0fb6  */
    /* JADX WARN: Removed duplicated region for block: B:817:0x0fbd  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x0fc4  */
    /* JADX WARN: Removed duplicated region for block: B:819:0x0fcb  */
    /* JADX WARN: Removed duplicated region for block: B:820:0x0fd2  */
    /* JADX WARN: Removed duplicated region for block: B:821:0x0fd9  */
    /* JADX WARN: Removed duplicated region for block: B:822:0x0fe0  */
    /* JADX WARN: Removed duplicated region for block: B:823:0x0fe7  */
    /* JADX WARN: Removed duplicated region for block: B:824:0x0fee  */
    /* JADX WARN: Removed duplicated region for block: B:825:0x0ff5  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x0ffc  */
    /* JADX WARN: Removed duplicated region for block: B:827:0x1003  */
    /* JADX WARN: Removed duplicated region for block: B:828:0x100a  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x1011  */
    /* JADX WARN: Removed duplicated region for block: B:830:0x1018  */
    /* JADX WARN: Removed duplicated region for block: B:831:0x101f  */
    /* JADX WARN: Removed duplicated region for block: B:832:0x1026  */
    /* JADX WARN: Removed duplicated region for block: B:833:0x102d  */
    /* JADX WARN: Removed duplicated region for block: B:834:0x1034  */
    /* JADX WARN: Removed duplicated region for block: B:835:0x103b  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x1042  */
    /* JADX WARN: Removed duplicated region for block: B:837:0x1049  */
    /* JADX WARN: Removed duplicated region for block: B:838:0x1050  */
    /* JADX WARN: Removed duplicated region for block: B:839:0x1057  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:840:0x105e  */
    /* JADX WARN: Removed duplicated region for block: B:841:0x1065  */
    /* JADX WARN: Removed duplicated region for block: B:842:0x106c  */
    /* JADX WARN: Removed duplicated region for block: B:843:0x1073  */
    /* JADX WARN: Removed duplicated region for block: B:844:0x107a  */
    /* JADX WARN: Removed duplicated region for block: B:845:0x1081  */
    /* JADX WARN: Removed duplicated region for block: B:846:0x1088  */
    /* JADX WARN: Removed duplicated region for block: B:847:0x108f  */
    /* JADX WARN: Removed duplicated region for block: B:848:0x1096  */
    /* JADX WARN: Removed duplicated region for block: B:849:0x109d  */
    /* JADX WARN: Removed duplicated region for block: B:850:0x10a4  */
    /* JADX WARN: Removed duplicated region for block: B:851:0x10ab  */
    /* JADX WARN: Removed duplicated region for block: B:852:0x10b2  */
    /* JADX WARN: Removed duplicated region for block: B:853:0x10b9  */
    /* JADX WARN: Removed duplicated region for block: B:854:0x10c0  */
    /* JADX WARN: Removed duplicated region for block: B:855:0x10c7  */
    /* JADX WARN: Removed duplicated region for block: B:856:0x10ce  */
    /* JADX WARN: Removed duplicated region for block: B:857:0x10d5  */
    /* JADX WARN: Removed duplicated region for block: B:858:0x10dc  */
    /* JADX WARN: Removed duplicated region for block: B:859:0x10e3  */
    /* JADX WARN: Removed duplicated region for block: B:860:0x10e9  */
    /* JADX WARN: Removed duplicated region for block: B:861:0x10ef  */
    /* JADX WARN: Removed duplicated region for block: B:862:0x10f5  */
    /* JADX WARN: Removed duplicated region for block: B:863:0x10fb  */
    /* JADX WARN: Removed duplicated region for block: B:864:0x1101  */
    /* JADX WARN: Removed duplicated region for block: B:865:0x1107  */
    /* JADX WARN: Removed duplicated region for block: B:866:0x110d  */
    /* JADX WARN: Removed duplicated region for block: B:867:0x1113  */
    /* JADX WARN: Removed duplicated region for block: B:868:0x1119  */
    /* JADX WARN: Removed duplicated region for block: B:869:0x111f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:870:0x1125  */
    /* JADX WARN: Removed duplicated region for block: B:871:0x112b  */
    /* JADX WARN: Removed duplicated region for block: B:872:0x1131  */
    /* JADX WARN: Removed duplicated region for block: B:873:0x1137  */
    /* JADX WARN: Removed duplicated region for block: B:874:0x113d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 8428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.c.<init>(android.content.Context):void");
    }

    public static void b(c cVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        boolean z9;
        h hVar = (h) cVar.f1439d;
        if (hVar.f1458c == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        AbstractC1566a.m(z9);
        HandlerThread handlerThread = hVar.f1457b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = (MediaCodec) cVar.f1438c;
        mediaCodec.setCallback(hVar, handler);
        hVar.f1458c = handler;
        AbstractC1566a.c("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        AbstractC1566a.v();
        g gVar = (g) cVar.f1440e;
        if (!gVar.f1455f) {
            HandlerThread handlerThread2 = gVar.f1451b;
            handlerThread2.start();
            gVar.f1452c = new e(gVar, handlerThread2.getLooper(), 0);
            gVar.f1455f = true;
        }
        AbstractC1566a.c("startCodec");
        mediaCodec.start();
        AbstractC1566a.v();
        cVar.f1436a = 1;
    }

    public static String c(int i9, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i9 == 1) {
            sb.append("Audio");
        } else if (i9 == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i9);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // C3.m
    public void a() {
        try {
            if (this.f1436a == 1) {
                g gVar = (g) this.f1440e;
                if (gVar.f1455f) {
                    gVar.a();
                    gVar.f1451b.quit();
                }
                gVar.f1455f = false;
                h hVar = (h) this.f1439d;
                synchronized (hVar.f1456a) {
                    hVar.f1466l = true;
                    hVar.f1457b.quit();
                    hVar.a();
                }
            }
            this.f1436a = 2;
        } finally {
            if (!this.f1437b) {
                ((MediaCodec) this.f1438c).release();
                this.f1437b = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x001e, DONT_GENERATE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0007, B:6:0x0011, B:12:0x001c, B:15:0x0021, B:17:0x0026, B:19:0x002a, B:23:0x0034, B:25:0x0036, B:27:0x003c, B:28:0x0063, B:32:0x0059, B:34:0x0065, B:35:0x0067, B:36:0x0068, B:37:0x006a), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0021 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0007, B:6:0x0011, B:12:0x001c, B:15:0x0021, B:17:0x0026, B:19:0x002a, B:23:0x0034, B:25:0x0036, B:27:0x003c, B:28:0x0063, B:32:0x0059, B:34:0x0065, B:35:0x0067, B:36:0x0068, B:37:0x006a), top: B:3:0x0007 }] */
    @Override // C3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f1439d
            C3.h r0 = (C3.h) r0
            java.lang.Object r1 = r0.f1456a
            monitor-enter(r1)
            long r2 = r0.f1465k     // Catch: java.lang.Throwable -> L1e
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 > 0) goto L18
            boolean r2 = r0.f1466l     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L16
            goto L18
        L16:
            r2 = r4
            goto L19
        L18:
            r2 = r3
        L19:
            r5 = -1
            if (r2 == 0) goto L21
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            return r5
        L1e:
            r0 = move-exception
            r10 = r0
            goto L6b
        L21:
            java.lang.IllegalStateException r2 = r0.f1467m     // Catch: java.lang.Throwable -> L1e
            r6 = 0
            if (r2 != 0) goto L68
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L65
            B3.e r2 = r0.f1460e     // Catch: java.lang.Throwable -> L1e
            int r6 = r2.f671c     // Catch: java.lang.Throwable -> L1e
            if (r6 != 0) goto L31
            goto L32
        L31:
            r3 = r4
        L32:
            if (r3 == 0) goto L36
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            return r5
        L36:
            int r2 = r2.e()     // Catch: java.lang.Throwable -> L1e
            if (r2 < 0) goto L56
            android.media.MediaFormat r3 = r0.f1463h     // Catch: java.lang.Throwable -> L1e
            l4.AbstractC1566a.n(r3)     // Catch: java.lang.Throwable -> L1e
            java.util.ArrayDeque r0 = r0.f1461f     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L1e
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L1e
            int r4 = r0.offset     // Catch: java.lang.Throwable -> L1e
            int r5 = r0.size     // Catch: java.lang.Throwable -> L1e
            long r6 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L1e
            int r8 = r0.flags     // Catch: java.lang.Throwable -> L1e
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L1e
            goto L63
        L56:
            r10 = -2
            if (r2 != r10) goto L63
            java.util.ArrayDeque r10 = r0.f1462g     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r10 = r10.remove()     // Catch: java.lang.Throwable -> L1e
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch: java.lang.Throwable -> L1e
            r0.f1463h = r10     // Catch: java.lang.Throwable -> L1e
        L63:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            return r2
        L65:
            r0.j = r6     // Catch: java.lang.Throwable -> L1e
            throw r2     // Catch: java.lang.Throwable -> L1e
        L68:
            r0.f1467m = r6     // Catch: java.lang.Throwable -> L1e
            throw r2     // Catch: java.lang.Throwable -> L1e
        L6b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.c.d(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // C3.m
    public void e(long j, int i9) {
        ((MediaCodec) this.f1438c).releaseOutputBuffer(i9, j);
    }

    @Override // C3.m
    public void flush() {
        ((g) this.f1440e).a();
        ((MediaCodec) this.f1438c).flush();
        h hVar = (h) this.f1439d;
        synchronized (hVar.f1456a) {
            hVar.f1465k++;
            Handler handler = hVar.f1458c;
            int i9 = l4.y.f20553a;
            handler.post(new A6.s(1, hVar));
        }
        ((MediaCodec) this.f1438c).start();
    }

    @Override // C3.m
    public void g(m4.h hVar, Handler handler) {
        ((MediaCodec) this.f1438c).setOnFrameRenderedListener(new C0080a(this, hVar, 0), handler);
    }

    @Override // C3.m
    public void h(int i9, boolean z9) {
        ((MediaCodec) this.f1438c).releaseOutputBuffer(i9, z9);
    }

    @Override // C3.m
    public void i(int i9) {
        ((MediaCodec) this.f1438c).setVideoScalingMode(i9);
    }

    @Override // C3.m
    public MediaFormat n() {
        MediaFormat mediaFormat;
        h hVar = (h) this.f1439d;
        synchronized (hVar.f1456a) {
            try {
                mediaFormat = hVar.f1463h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // C3.m
    public ByteBuffer o(int i9) {
        return ((MediaCodec) this.f1438c).getInputBuffer(i9);
    }

    @Override // C3.m
    public void q(Surface surface) {
        ((MediaCodec) this.f1438c).setOutputSurface(surface);
    }

    @Override // C3.m
    public void r(int i9, C1589b c1589b, long j) {
        g gVar = (g) this.f1440e;
        RuntimeException runtimeException = (RuntimeException) gVar.f1453d.getAndSet(null);
        if (runtimeException == null) {
            f b9 = g.b();
            b9.f1443a = i9;
            b9.f1444b = 0;
            b9.f1446d = j;
            b9.f1447e = 0;
            int i10 = c1589b.f20688f;
            MediaCodec.CryptoInfo cryptoInfo = b9.f1445c;
            cryptoInfo.numSubSamples = i10;
            int[] iArr = c1589b.f20686d;
            int[] iArr2 = cryptoInfo.numBytesOfClearData;
            if (iArr != null) {
                if (iArr2 != null && iArr2.length >= iArr.length) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                } else {
                    iArr2 = Arrays.copyOf(iArr, iArr.length);
                }
            }
            cryptoInfo.numBytesOfClearData = iArr2;
            int[] iArr3 = c1589b.f20687e;
            int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
            if (iArr3 != null) {
                if (iArr4 != null && iArr4.length >= iArr3.length) {
                    System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
                } else {
                    iArr4 = Arrays.copyOf(iArr3, iArr3.length);
                }
            }
            cryptoInfo.numBytesOfEncryptedData = iArr4;
            byte[] bArr = c1589b.f20684b;
            byte[] bArr2 = cryptoInfo.key;
            if (bArr != null) {
                if (bArr2 != null && bArr2.length >= bArr.length) {
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                } else {
                    bArr2 = Arrays.copyOf(bArr, bArr.length);
                }
            }
            bArr2.getClass();
            cryptoInfo.key = bArr2;
            byte[] bArr3 = c1589b.f20683a;
            byte[] bArr4 = cryptoInfo.iv;
            if (bArr3 != null) {
                if (bArr4 != null && bArr4.length >= bArr3.length) {
                    System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                } else {
                    bArr4 = Arrays.copyOf(bArr3, bArr3.length);
                }
            }
            bArr4.getClass();
            cryptoInfo.iv = bArr4;
            cryptoInfo.mode = c1589b.f20685c;
            if (l4.y.f20553a >= 24) {
                d.s();
                cryptoInfo.setPattern(d.g(c1589b.f20689g, c1589b.f20690h));
            }
            gVar.f1452c.obtainMessage(1, b9).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    @Override // C3.m
    public void s(Bundle bundle) {
        ((MediaCodec) this.f1438c).setParameters(bundle);
    }

    @Override // C3.m
    public ByteBuffer u(int i9) {
        return ((MediaCodec) this.f1438c).getOutputBuffer(i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[Catch: all -> 0x001e, DONT_GENERATE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0007, B:6:0x0011, B:12:0x001c, B:15:0x0020, B:17:0x0025, B:19:0x0029, B:24:0x0038, B:26:0x0034, B:28:0x003a, B:29:0x003c, B:30:0x003d, B:31:0x003f), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0020 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x0007, B:6:0x0011, B:12:0x001c, B:15:0x0020, B:17:0x0025, B:19:0x0029, B:24:0x0038, B:26:0x0034, B:28:0x003a, B:29:0x003c, B:30:0x003d, B:31:0x003f), top: B:3:0x0007 }] */
    @Override // C3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int v() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f1439d
            C3.h r0 = (C3.h) r0
            java.lang.Object r1 = r0.f1456a
            monitor-enter(r1)
            long r2 = r0.f1465k     // Catch: java.lang.Throwable -> L1e
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r2 > 0) goto L18
            boolean r2 = r0.f1466l     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L16
            goto L18
        L16:
            r2 = r4
            goto L19
        L18:
            r2 = r3
        L19:
            r5 = -1
            if (r2 == 0) goto L20
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            return r5
        L1e:
            r0 = move-exception
            goto L40
        L20:
            java.lang.IllegalStateException r2 = r0.f1467m     // Catch: java.lang.Throwable -> L1e
            r6 = 0
            if (r2 != 0) goto L3d
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L3a
            B3.e r0 = r0.f1459d     // Catch: java.lang.Throwable -> L1e
            int r2 = r0.f671c     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L30
            goto L31
        L30:
            r3 = r4
        L31:
            if (r3 == 0) goto L34
            goto L38
        L34:
            int r5 = r0.e()     // Catch: java.lang.Throwable -> L1e
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            return r5
        L3a:
            r0.j = r6     // Catch: java.lang.Throwable -> L1e
            throw r2     // Catch: java.lang.Throwable -> L1e
        L3d:
            r0.f1467m = r6     // Catch: java.lang.Throwable -> L1e
            throw r2     // Catch: java.lang.Throwable -> L1e
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C3.c.v():int");
    }

    @Override // C3.m
    public void w(int i9, int i10, long j, int i11) {
        g gVar = (g) this.f1440e;
        RuntimeException runtimeException = (RuntimeException) gVar.f1453d.getAndSet(null);
        if (runtimeException == null) {
            f b9 = g.b();
            b9.f1443a = i9;
            b9.f1444b = i10;
            b9.f1446d = j;
            b9.f1447e = i11;
            e eVar = gVar.f1452c;
            int i12 = l4.y.f20553a;
            eVar.obtainMessage(0, b9).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2) {
        this.f1438c = mediaCodec;
        this.f1439d = new h(handlerThread);
        this.f1440e = new g(mediaCodec, handlerThread2);
        this.f1436a = 0;
    }
}
